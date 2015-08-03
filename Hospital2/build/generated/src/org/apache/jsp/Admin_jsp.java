package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<head> \n");
      out.write("    <title> \n");
      out.write("        Admin's Page\n");
      out.write("    </title>\n");
      out.write("    <style>\n");
      out.write("\n");
      out.write("        body{\n");
      out.write("            background-image: url(\"images/\");\n");
      out.write("\n");
      out.write("        }    \n");
      out.write("        .container {\n");
      out.write("            margin:60px auto;\n");
      out.write("            width:940px;\n");
      out.write("            overflow:hidden;\n");
      out.write("            font-size:.875em;\n");
      out.write("            padding-bottom:176px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container a {\n");
      out.write("            color: #006666;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .container a:hover {\n");
      out.write("            color: #088cc4;\n");
      out.write("        }\n");
      out.write("        h1,h2 {text-align:center}\n");
      out.write("\n");
      out.write("        form{\n");
      out.write("            float:left;\n");
      out.write("            padding:50px;   \n");
      out.write("            margin:auto auto 20px auto;\n");
      out.write("        }\n");
      out.write("        .buttonHolder{ text-align: left;\n");
      out.write("                       width:250px;\n");
      out.write("                       margin:0 auto;\n");
      out.write("        }\n");
      out.write("        .buttonHolder1{ text-align: right; }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <link rel=\"stylesheet\" href=\"Site.css\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"wrap\">\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1><a href=\"#\">Welcome to the Admin Page <br>");
      out.print(session.getAttribute("name"));
      out.write("  </a></h1><br><br><br><br>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                <h2><a href=\"#\">Choose the profile to Visit</a></h2>\n");
      out.write("                <form action='patientAdmin.jsp' method='post'>\n");
      out.write("                    <div class=\"buttonHolder\">    \n");
      out.write("                        <input type='submit' class=\"button red\" align=\"left\" value=\"Patient's Profile\"/>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                <form action='doctorAdmin.jsp' method='post'>\n");
      out.write("                    <div class=\"buttonHolder1\">\n");
      out.write("                        <input type='submit' class=\"button blue\" align=\"right\" value=\"Doctor's Profile\"/>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("</body>");
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
