<% if(session.getAttribute("role").equals("patient")){
      
%>

<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="${initParam.driver}"
                 url="${initParam.url}"
                 user="${initParam.user}" password="${initParam.pwd}"/>

<s:update var="ur">
    update patient set loanStatus='${"yes"}' where name='${sessionScope.name}'
</s:update>
<c:set var="sm" value="LOAN APPROVED SUCCESSFULLY" scope="request"/>
<jsp:forward page="patient1.jsp"/>

<%
}else{
    response.sendRedirect("Login/login.html");
}

%>