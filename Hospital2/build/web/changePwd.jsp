<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="${initParam.driver}"
                 url="${initParam.url}"
                 user="${initParam.user}" password="${initParam.pwd}"/>


<s:update var="ur">
    update login set password='${param.confirm}' where username='${param.name}'
</s:update>
<c:set var="sm" value="Password Changed Succesfully" scope="request"/>
<jsp:forward page="login.jsp"/>