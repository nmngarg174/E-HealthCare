<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="${initParam.driver}"
                 url="${initParam.url}"
                 user="${initParam.user}" password="${initParam.pwd}"/>

<s:update var="ur">
    update patient set contact='${param.contact}',age='${param.age}',email='${param.email}',gender='${param.gender}' where name='${param.name}'
</s:update>
<c:set var="sm" value="PATIENT SAVED SUCCESSFULLY" scope="request"/>
<jsp:forward page="editPatientForm1.jsp?id=${param.sn}"/>