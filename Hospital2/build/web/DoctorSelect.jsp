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
<form action="myquery" method="post">    
<nav>
  <ul class="nav">
      <s:query var="rs">
        select * from doctor where dept="cardiology"
    </s:query>
        
     <li><a>CARDIOLOGY</a> 
      <ul>
         <c:forEach var="data" items="${rs.rows}" >
            
             <li><input type="radio" name="same" value="${data.name}"><img src="${data.image}" ><br>DR.${data.name}  </li>

         </c:forEach>	
      </ul>
    </li>
    <s:query var="rs">
        select * from doctor where dept="dermatology"
    </s:query>
        <li><a>DERMATOLOGY</a> 
      <ul>

     <c:forEach var="data" items="${rs.rows}" >
            
             <li><input type="radio" name="same" value="${data.name}"><img src="${data.image}" ><br>DR.${data.name}  </li>

         </c:forEach>
	
		
		
      </ul>
    </li>
    <s:query var="rs">
        select * from doctor where dept="neurology"
    </s:query>
    <li><a>NEUROLOGY</a> 
      <ul>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><input type="radio" name="same" value="${data.name}"><img src="${data.image}" ><br>DR.${data.name}  </li>

         </c:forEach>
     
      </ul>
    </li>
    <s:query var="rs">
        select * from doctor where dept="urology"
    </s:query>
    <li><a>UROLOGY</a> 
      <ul>

		
          <c:forEach var="data" items="${rs.rows}" >
            
             <li><input type="radio" name="same" value="${data.name}"><img src="${data.image}" ><br>DR.${data.name}  </li>

         </c:forEach>
		
      </ul>
    </li>   
    <li><a>ENDOCRiNOLOGY</a> 
     <ul>
    <s:query var="rs">
        select * from doctor where dept="endocrinology"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><input type="radio" name="same" value="${data.name}"><img src="${data.image}" ><br>DR.${data.name}  </li>

         </c:forEach>

	 </ul>
    </li>
	<li><a>ORTHOPEDIATRICS</a> 
      <ul>
        
		<s:query var="rs">
        select * from doctor where dept="orthopediatrics"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><input type="radio" name="same" value="${data.name}"><img src="${data.image}" ><br>DR.${data.name}  </li>

         </c:forEach>
      </ul>
    </li>
    <li><a>ONCOLOGY</a> 
      <ul>

		<s:query var="rs">
        select * from doctor where dept="oncology"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><input type="radio" name="same" value="${data.name}"><img src="${data.image}" ><br>DR.${data.name}  </li>

         </c:forEach>       
      </ul>
    </li>
	<li><a>ENT</a> 
      <ul>
<s:query var="rs">
        select * from doctor where dept="ent"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><input type="radio" name="same" value="${data.name}"><img src="${data.image}" ><br>DR.${data.name}  </li>

         </c:forEach>
		
      </ul>
    </li>
	<li><a>PEDIATRICS</a> 
      <ul>

        <s:query var="rs">
        select * from doctor where dept="pediatrics"
    </s:query>

          <c:forEach var="data" items="${rs.rows}" >
            
             <li><input type="radio" name="same" value="${data.name}"><img src="${data.image}" ><br>DR.${data.name}  </li>

         </c:forEach>
      </ul>
    </li>
	
	
  </ul>
</nav>
    <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    <br><br>
    <br>
    <br>
    <br>
    <br>
    <footer class="nav" align="right">
      <table width="97%" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="14%">&nbsp;</td>
          <td width="14%">&nbsp;</td>
          <td width="100%">&nbsp;</td>
          <td width="7%"><font size="+4"><b><input type="submit" class="nav" value="NEXT!!"/></b></font></td>
        </tr>
      </table>
    </footer>
    
    
    </form>
</body>