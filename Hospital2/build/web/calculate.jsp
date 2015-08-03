<%-- 
    Document   : calculate
    Created on : Jul 13, 2014, 7:09:51 AM
    Author     : princEvil
--%>
<head>
<!--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">-->
<title>JSP Page</title>
<link rel="stylesheet" type="text/css" href="image.css" />
</head>

<% if(session.getAttribute("role").equals("patient")){
      
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your Loan Status !</h1>
        
        
        <%
        String sal=request.getParameter("salary");
        int sal1=Integer.parseInt(sal);
        
        String year=request.getParameter("year");
        int year1=Integer.parseInt(year);
        
        String earning=request.getParameter("earnings");
        int earning1=Integer.parseInt(earning);
     
        String life=request.getParameter("life");   
        
        String family=request.getParameter("family");
        int family1=Integer.parseInt(family);
        
        String loan=request.getParameter("amount");
        int loan1=Integer.parseInt(loan);
        
        String time=request.getParameter("time");
        int time1=Integer.parseInt(time);
        
        float index=(float)(time1*12.5*loan1)/100;
        float net=index+loan1;
        
        if(sal1+family1>net){
            out.print("Loan Approved");
            
            
        }
        else{
            
            //out.println("Loan not Approved");
            RequestDispatcher rd = request.getRequestDispatcher("lnp.jsp");   
            rd.forward(request, response);
        }
        %>
        <a href="approveloan.jsp?id=${param.id}">Click To Approve the loan</a>

    </body>
</html>
<%
}else{
    response.sendRedirect("Login/login.html");
}

%>