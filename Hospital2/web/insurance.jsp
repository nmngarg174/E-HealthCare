<%-- 
    Document   : insuranse
    Created on : Jul 13, 2014, 6:16:14 AM
    Author     : princEvil
--%>
<head>
<!--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">-->
<title>JSP Page</title>
<link rel="stylesheet" type="text/css" href="css/image.css" />
</head>
<% if(session.getAttribute("role").equals("patient")){
      
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="Site.css"/>
    </head>
    <body>
        <h1>Enter Your Credentials For Getting A Health Loan !</h1>
        
                <p ><a href="#condition"><font color="#FF0000">Conditions Apply </a></p>
            
                </font>
        <form  action="calculate.jsp?id=${param.id}" method ="post" > 
          <pre>
           Enter Your Monthly Salary :
           <select name="salary">
               <option value="">Enter the range for your salary</option>
               
               <%for (int i=300000;i<=1000000;i+=100000){ %>
               <option value="<%=i%>"><%=i%></option>
                       <%}%>
                   
           </select>     


           Enter the time you have been working :
           <select name="year">
               <option value="">Enter the time in years</option>
               
               <%for (int i=2;i<=20;i+=1){ %>
               <option value="<%=i%>"><%=i%></option>
                       <%}%>
           </select>


           Enter your Home monthly Earnings:
           <select name="earnings">
               <option value="">Enter the range for your salary</option>
               
               <%for (int i=500000;i<=1500000;i+=100000){ %>
               <option value="<%=i%>"><%=i%></option>
                       <%}%>
           </select>



           Have you got a life insurance :
           <select name="life">
               <option value="">Enter Yes or No</option>
               
               
               <option value="YES">YES</option>
               <option value="YES">NO</option>        
           </select>


           How many family members you have :
           <select name="family">
               <option value="">Enter the no. of members</option>
               
               <%for (int i=1;i<=8;i+=1){ %>
               <option value="<%=i%>"><%=i%></option>
                       <%}%>
                       
                       
                       
                       
           </select>



           Enter the loan amount :
           <select name="amount">
               <option value="">Enter the loan amount</option>
               
               <%for (int i=100000;i<=1000000;i+=100000){ %>
               <option value="<%=i%>"><%=i%></option>
                       <%}%>
                       
                       
                       
                       
           </select>

           Enter the time to repay the loan in years:
           <select name="time">
               <option value="">Enter the time</option>
               
               <%for (int i=1;i<=5;i+=1){ %>
               <option value="<%=i%>"><%=i%></option>
                       <%}%>
                       
                       
                       
                       
           </select>

           

           <input type="submit" class="button red" value="Submit Credentials"            
                       </pre>
        </form>
        
        <font color="#FF0000">        
        <a name="condition">Conditions Apply *</a><br>
1)Rate of interest for the loan is 12.5% for the GENERAL and 11% for senior citizens.<br> 
2)Once Loan is apprived you cannot apply again and reject it. <br>
3)In case emi are not submitted on time an extension will be given for 3 months for a appropriate reason then legal action could be taken.<br>
4)Loan is given for health treatment only , other use of cash is against our policies.
            
            </font>

            
            
    </body>
</html>

<%
}else{
    response.sendRedirect("Login/login.html");
}

%>