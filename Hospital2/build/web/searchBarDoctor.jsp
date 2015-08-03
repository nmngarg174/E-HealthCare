<% 
    if(session.getAttribute("role").equals("admin")){  
%>
<form action="searchDoctorServlet">
<table width="896" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor=transparent>
  <!--DWLayoutTable-->
  <tr>
    <td width="56" height="25">&nbsp;</td>
    <td width="154" valign="top">SEARCH BY DEPT </td>
    <td width="269" valign="top"><input type="text" name="sbt"/></td>
    <td width="58">&nbsp;</td>
    <td width="150" valign="top">SEARCH BY ID </td>
    <td width="275" valign="top"><input type="text" name="sbi"/></td>
    <td width="38">&nbsp;</td>
  </tr>
  <tr>
    <td height="5"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td height="26"></td>
    <td valign="top">SEARCH BY NAME </td>
    <td valign="top"><input type="text" name="sbn"/></td>
    <td></td>
    <td valign="top"><input class="button green" type="submit" value="SEARCH"/></td>
    <td valign="top"><input class="button red" type="reset"/></td>
    <td></td>
  </tr>
  
  <tr>
    <td height="4"></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
    <td></td>
  </tr>
 </form> 
  
  
  
  
</table>

<%
}else{
    response.sendRedirect("login.jsp");
}

%>