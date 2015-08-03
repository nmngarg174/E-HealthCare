package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insurance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<head>\n");
      out.write("<!--<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">-->\n");
      out.write("<title>JSP Page</title>\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/image.css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Site.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Enter Your Credentials For Getting A Health Loan !</h1>\n");
      out.write("        \n");
      out.write("                <p ><a href=\"#condition\"><font color=\"#FF0000\">Conditions Apply </a></p>\n");
      out.write("            \n");
      out.write("                </font>\n");
      out.write("        <form  action=\"calculate.jsp?id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" method =\"post\" > \n");
      out.write("          \n");
      out.write("           Enter Your Monthly Salary :\n");
      out.write("           <select name=\"salary\">\n");
      out.write("               <option value=\"\">Enter the range for your salary</option>\n");
      out.write("               \n");
      out.write("               ");
for (int i=300000;i<=1000000;i+=100000){ 
      out.write("\n");
      out.write("               <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                       ");
}
      out.write("\n");
      out.write("                   \n");
      out.write("           </select>     \n");
      out.write("\n");
      out.write("\n");
      out.write("           Enter the time you have been working :\n");
      out.write("           <select name=\"year\">\n");
      out.write("               <option value=\"\">Enter the time in years</option>\n");
      out.write("               \n");
      out.write("               ");
for (int i=2;i<=20;i+=1){ 
      out.write("\n");
      out.write("               <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                       ");
}
      out.write("\n");
      out.write("           </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("           Enter your Home monthly Earnings:\n");
      out.write("           <select name=\"earnings\">\n");
      out.write("               <option value=\"\">Enter the range for your salary</option>\n");
      out.write("               \n");
      out.write("               ");
for (int i=500000;i<=1500000;i+=100000){ 
      out.write("\n");
      out.write("               <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                       ");
}
      out.write("\n");
      out.write("           </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("           Have you got a life insurance :\n");
      out.write("           <select name=\"life\">\n");
      out.write("               <option value=\"\">Enter Yes or No</option>\n");
      out.write("               \n");
      out.write("               \n");
      out.write("               <option value=\"YES\">YES</option>\n");
      out.write("               <option value=\"YES\">NO</option>        \n");
      out.write("           </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("           How many family members you have :\n");
      out.write("           <select name=\"family\">\n");
      out.write("               <option value=\"\">Enter the no. of members</option>\n");
      out.write("               \n");
      out.write("               ");
for (int i=1;i<=8;i+=1){ 
      out.write("\n");
      out.write("               <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                       ");
}
      out.write("\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("           </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("           Enter the loan amount :\n");
      out.write("           <select name=\"amount\">\n");
      out.write("               <option value=\"\">Enter the loan amount</option>\n");
      out.write("               \n");
      out.write("               ");
for (int i=100000;i<=1000000;i+=100000){ 
      out.write("\n");
      out.write("               <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                       ");
}
      out.write("\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("           </select>\n");
      out.write("\n");
      out.write("           Enter the time to repay the loan in years:\n");
      out.write("           <select name=\"time\">\n");
      out.write("               <option value=\"\">Enter the time</option>\n");
      out.write("               \n");
      out.write("               ");
for (int i=1;i<=5;i+=1){ 
      out.write("\n");
      out.write("               <option value=\"");
      out.print(i);
      out.write('"');
      out.write('>');
      out.print(i);
      out.write("</option>\n");
      out.write("                       ");
}
      out.write("\n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("                       \n");
      out.write("           </select>\n");
      out.write("\n");
      out.write("           \n");
      out.write("\n");
      out.write("           <input type=\"submit\" class=\"button red\" value=\"Submit Credentials\"            \n");
      out.write("          \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <font color=\"#FF0000\">        \n");
      out.write("        <a name=\"condition\">Conditions Apply *</a><br>\n");
      out.write("1)Rate of interest for the loan is 12.5% for the GENERAL and 11% for senior citizens.<br> \n");
      out.write("2)Once Loan is apprived you cannot apply again and reject it. <br>\n");
      out.write("3)In case emi are not submitted on time an extension will be given for 3 months for a appropriate reason then legal action could be taken.<br>\n");
      out.write("4)Loan is given for health treatment only , other use of cash is against our policies.\n");
      out.write("            \n");
      out.write("            </font>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
