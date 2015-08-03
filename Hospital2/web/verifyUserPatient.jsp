<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="${initParam.driver}"
                 url="${initParam.url}"
                 user="${initParam.user}" password="${initParam.pwd}"/>

<s:query var="rs">
    select id from patient where name='${param.name}'
</s:query>
<c:choose> 
    <c:when test="${rs eq null}">
        <s:update var="ur">
            insert into patient(age,contact,email,gender,location,name) values('${param.age}','${param.contact}','${param.email}','${param.gender}','${param.location}','${param.name}')
        </s:update>
        <c:set var="sm" value="PATIENT ADDED SUCCESSFULLY" scope="request"/>
        <jsp:forward page="login.jsp"/>
    </c:when>

    <c:otherwise>
        <c:set var="sm" value="UserName Already Exists" scope="request"/>
        String em = "<b><font size=2 color=red>Invalid Username Or Password</font></b>";

        request.setAttribute("errmsg", "UserName Already Exists ");// session se aage na jaa sake data to use request dispatcher
        request.getRequestDispatcher("login.jsp").forward(request, response);

        <jsp:forward page="login.jsp"/>
    </c:otherwise>
</c:choose>

