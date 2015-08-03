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
    insert into msg(msg,reciever,sender) values('${param.content}','${param.title}','${sessionScope.name}')
</s:update>
<c:set var="sm" value="Message Sent Successfully" scope="request"/>
<jsp:forward page="doctor1.jsp"/>    
