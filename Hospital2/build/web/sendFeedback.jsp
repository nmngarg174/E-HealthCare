<%-- 
    Document   : addnotice
    Created on : Jul 26, 2014, 12:36:14 PM
    Author     : princEvil
--%>

<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="${initParam.driver}"
                 url="${initParam.url}"
                 user="${initParam.user}"
                 password="${initParam.pwd}"/>

<s:update var="ur">
    insert into feedback(m1,m2,m3,suggestion,name,position) values('${param.m1}','${param.m2}','${param.m3}','${param.suggestion}','${sessionScope.name}','${sessionScope.role}')
</s:update>
<c:set var="sm" value="Message Sent Successfully" scope="request"/>
<jsp:forward page="patient.jsp"/>    
