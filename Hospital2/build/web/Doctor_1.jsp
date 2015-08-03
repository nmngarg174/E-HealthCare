<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<s:setDataSource driver="com.mysql.jdbc.Driver"
                 url="jdbc:mysql://localhost:3306/healthcare"
                 user="root" password="1234"/>
<link rel="stylesheet" type="text/css" href="css/doctor.css">
<style type="text/css">
body {
	
	background-image: url(images/oper.jpg);
}
</style>
<body>
    
<nav>
  <ul class="nav">
      <s:query var="rs">
        select * from doctor where dept="cardiology"
    </s:query>
        
     <li><a>CARDIOLOGY</a>
      <ul>
         <c:forEach var="data" items="${rs.rows}" >
            
             <li><a href="${data.location}"><img src="${data.image}" ><br>DR.${data.name} </a></li>

         </c:forEach>	
      </ul>
    </li>
    <s:query var="rs">
        select * from doctor where dept="dermatology"
    </s:query>
        <li><a>DERMATOLOGY</a>
      <ul>

     <c:forEach var="data" items="${rs.rows}" >
            
             <li><a href="${data.location}"><img src="${data.image}" ><br>DR.${data.name} </a></li>

         </c:forEach>
	
		
		
      </ul>
    </li>
    <s:query var="rs">
        select * from doctor where dept="neurology"
    </s:query>
    <li><a>NEUROLOGY</a>
      <ul>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><a href="${data.location}"><img src="${data.image}" ><br>DR.${data.name} </a></li>

         </c:forEach>
     
      </ul>
    </li>
    <s:query var="rs">
        select * from doctor where dept="urology"
    </s:query>
    <li><a>UROLOGY</a>
      <ul>

		
          <c:forEach var="data" items="${rs.rows}" >
            
             <li><a href="${data.location}"><img src="${data.image}" ><br>DR.${data.name} </a></li>

         </c:forEach>
		
      </ul>
    </li>   
    <li><a>ENDOCRiNOLOGY</a>
     <ul>
    <s:query var="rs">
        select * from doctor where dept="endocrinology"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><a href="${data.location}"><img src="${data.image}" ><br>DR.${data.name} </a></li>

         </c:forEach>

	 </ul>
    </li>
	<li><a>ORTHOPEDIATRICS</a>
      <ul>
        
		<s:query var="rs">
        select * from doctor where dept="orthopediatrics"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><a href="${data.location}"><img src="${data.image}" ><br>DR.${data.name} </a></li>

         </c:forEach>
      </ul>
    </li>
    <li><a>ONCOLOGY</a>
      <ul>

		<s:query var="rs">
        select * from doctor where dept="oncology"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><a href="${data.location}"><img src="${data.image}" ><br>DR.${data.name} </a></li>

         </c:forEach>      
      </ul>
    </li>
	<li><a>ENT</a>
      <ul>
<s:query var="rs">
        select * from doctor where dept="ent"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><a href="${data.location}"><img src="${data.image}" ><br>DR.${data.name} </a></li>

         </c:forEach>
		
      </ul>
    </li>
	<li><a>PEDIATRICS</a>
      <ul>

        <s:query var="rs">
        select * from doctor where dept="pediatrics"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><a href="${data.location}"><img src="${data.image}" ><br>DR.${data.name} </a></li>

         </c:forEach>
      </ul>
    </li>
	
	
  </ul>
</nav>
