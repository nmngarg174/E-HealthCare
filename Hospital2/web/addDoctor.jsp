<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="${initParam.driver}"
                 url="${initParam.url}"
                 user="${initParam.user}" password="${initParam.pwd}"/>

<s:update var="ur">
    insert into doctor(contact,dept,email,gender,image,name) values('${sessionScope.contact}','${sessionScope.dept}','${sessionScope.email}','${sessionScope.gender}','${sessionScope.fileName}','${sessionScope.name}')
</s:update>
<s:update var="ur">
    insert into login(password,position,username) values('${sessionScope.password}','doctor','${sessionScope.name}')
</s:update>
<c:set var="sm" value="DOCTOR ADDED SUCCESSFULLY" scope="request"/>

<jsp:forward page="login.jsp"/>
