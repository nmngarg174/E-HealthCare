<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="${initParam.driver}"
                 url="${initParam.url}"
                 user="${initParam.user}" password="${initParam.pwd}"/>

<s:update var="ur">
    insert into patient(age,contact,email,gender,location,name) values('${param.age}','${param.phone}','${param.email}','${param.gender}','${param.location}','${param.name}')
</s:update>
<s:update var="ur">
    insert into login(password,position,username) values('${param.password}','patient','${param.name}')
</s:update>
<c:set var="sm" value="PATIENT ADDED SUCCESSFULLY" scope="request"/>
<jsp:forward page="Login/login.html"/>