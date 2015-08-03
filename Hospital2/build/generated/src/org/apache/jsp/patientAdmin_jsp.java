package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class patientAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Admin</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/Site.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/adminstyle.css\" type=\"text/css\" media=\"all\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\" ></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/cufon-yui.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/cufon-replace.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/Myriad_Pro_300.font.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/Myriad_Pro_400.font.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("        <!--[if lt IE 7]>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ie6.css\" type=\"text/css\" media=\"screen\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/ie_png.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">ie_png.fix('.png, footer, header nav ul li a, .nav-bg, .list li img');</script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <!--[if lt IE 9]><script type=\"text/javascript\" src=\"js/html5.js\"></script><![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body id=\"page1\">\n");
      out.write("        <!-- START PAGE SOURCE -->\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1><a href=\"#\">Admin's site</a></h1>\n");
      out.write("                    <nav>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"current\"><a href=\"AdminAdd.jsp\" class=\"m1\">Patient List</a></li>\n");
      out.write("                            <li><a href=\"AdminEdit.jsp\" class=\"m2\">Add Patient</a></li>\n");
      out.write("                            <li><a href=\"AdminAddNotice.jsp\" class=\"m3\">Search Patient</a></li>\n");
      out.write("                            <li><a href=\"AdminDeleteNotice.jsp\" class=\"m4\">Delete notice</a></li>\n");
      out.write("                            <li class=\"last\"><a href=\"logout\" class=\"m5\">logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    <form action=\"#\" id=\"search-form\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <div class=\"rowElem\">\n");
      out.write("                                \n");
      out.write("                                <a href=\"AdminSearch.jsp\">Search Faculty/Student</a></div>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <aside>\n");
      out.write("                         <font color=red>Last Login :&nbsp;");
      out.print(session.getAttribute("date"));
      out.write("</font>\n");
      out.write("                    <br><br>\n");
      out.write("                    <!--");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("-->\n");
      out.write("                    <!--<h3>Welcome &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>-->\n");
      out.write("                    <h3>userid &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3><hr>\n");
      out.write("                    <!--<h3><a href=\"#\">Calendar</a></h3>\n");
      out.write("                    <hr>--><h3><a href=\"changepwd.jsp\">change password</a></h3><hr>\n");
      out.write("                    <br>\n");
      out.write("                    <h3>Online Students</h3>\n");
      out.write("                    <ul class=\"categories\">\n");
      out.write("                        <li><span><a href=\"#\">Programs</a></span></li>\n");
      out.write("                        <li><span><a href=\"#\">Programs</a></span></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <hr>\n");
      out.write("                    <h3>Online Faculties</h3>\n");
      out.write("                    <ul class=\"categories\">\n");
      out.write("                        <li><span><a href=\"#\">Administrators</a></span></li>\n");
      out.write("                        <li><span><a href=\"#\">Programs</a></span></li>\n");
      out.write("                        <br><br>\n");
      out.write("                        <hr>\n");
      out.write("\n");
      out.write("                    </ul>    \n");
      out.write("                  <!--  <form action=\"#\" id=\"newsletter-form\">\n");
      out.write("                        <fieldset>\n");
      out.write("                            <div class=\"rowElem\">\n");
      out.write("                                <h2>View Queries</h2>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </fieldset>\n");
      out.write("                    </form>\n");
      out.write("                    <ul class=\"news\">\n");
      out.write("                        <li><strong>June 30, 2010</strong>\n");
      out.write("                            <h4><a href=\"#\">Sed ut perspiciatis unde</a></h4>\n");
      out.write("                            Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque. </li>\n");
      out.write("                        <li><strong>June 14, 2010</strong>\n");
      out.write("                            <h4><a href=\"#\">Neque porro quisquam est</a></h4>\n");
      out.write("                            Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit consequuntur magni. </li>\n");
      out.write("                        <li><strong>May 29, 2010</strong>\n");
      out.write("                            <h4><a href=\"#\">Minima veniam, quis nostrum</a></h4>\n");
      out.write("                            Uis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae. </li>\n");
      out.write("                    </ul>-->\n");
      out.write("                </aside>\n");
      out.write("                <section id=\"content\">\n");
      out.write("                    <div id=\"banner\">\n");
      out.write("                        <!--<h4>Health Care Solutions<span>Delhi <span>Since 2012</span></span></h4>-->\n");
      out.write("                    </div>\n");
      out.write("                    <!--<div class=\"inside\">\n");
      out.write("                        <h2>Add Student<span>/Faculty</span></h2><hr><br><br>\n");
      out.write("                        <form action=\"AdminAdd\" method =\"get\">\n");
      out.write("                           \n");
      out.write("                            <center>\n");
      out.write("                               \n");
      out.write("                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Add : <select  align=\"center\" name=\"Status\" style=\"font-size:14px; font-family:'Comic Sans MS';font-weight:bold;\" >\n");
      out.write("                                    <option value=\"null\" >---------Select---------</option>\n");
      out.write("                                    <option value=\"faclt\"  >Faculty</option>\n");
      out.write("                                    <option value=\"studn\" >Student</option>\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                                <br><br><br>\n");
      out.write("                                Enter Username :     <input type=\"text\" name=\"username\" style=\"font-size:14px; font-family:'Comic Sans MS';font-weight:bold;\"/><br><br><br>\n");
      out.write("                                Enter Password :     <input type=\"password\" name=\"pwd\" style=\"font-size:14px; font-family:'Comic Sans MS';font-weight:bold;\"/><br><br><br>\n");
      out.write("                                \n");
      out.write("                                <input type=\"submit\" class=\"black button\" value=\"ADD\"></input>\n");
      out.write("                                <br><br>\n");
      out.write("                                ");
 
        String e= (String)request.getAttribute("errmsg");
        if(e instanceof String){ 
         
      out.write("   \n");
      out.write("         ");
      out.print(e);
      out.write("\n");
      out.write("         ");
}
      out.write("\n");
      out.write("                               \n");
      out.write("         </center>\n");
      out.write("                      </form>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("         <br><br><br><br><br><br><br><br><br>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footerlink\">\n");
      out.write("                <p class=\"lf\">Copyright &copy; 2014 &nbsp;  <a href=\"www.healthcare.com\">HealthCare Solutions</a> - All Rights Reserved</p>\n");
      out.write("                <p class=\"rf\"> Health Department</p>\n");
      out.write("                <div style=\"clear:both;\"></div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"text/javascript\"> Cufon.now(); </script>\n");
      out.write("        <!-- END PAGE SOURCE -->\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("mata");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rss.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <h3>welcome &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mata.Name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3><hr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
