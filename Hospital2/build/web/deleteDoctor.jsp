<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="${initParam.driver}"
                 url="${initParam.url}"
                 user="${initParam.user}" password="${initParam.pwd}"/>

<s:update var="ur">
  delete from doctor where id=${param.id}
</s:update>
<s:update var="ur">
  delete from login where username='${param.name}' and position='doctor'
</s:update>
<jsp:forward page="doctorAdmin1.jsp"/>