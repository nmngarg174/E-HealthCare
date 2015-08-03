<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="${initParam.driver}"
                 url="${initParam.url}"
                 user="${initParam.user}" password="${initParam.pwd}"/>

<s:update var="ur">
  delete from patient where id=${param.id}
</s:update>
<s:update var="ur">
  delete from login where username='${param.name}' and position='patient'
</s:update>
<jsp:forward page="patientAdmin1.jsp"/>