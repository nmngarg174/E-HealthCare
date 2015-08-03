package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewNoticeDoctor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_query_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_query_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_s_query_var.release();
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.release();
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
      out.write("        <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("            table {\n");
      out.write("                *border-collapse: collapse; /* IE7 and lower */\n");
      out.write("                border-spacing: 0;\n");
      out.write("                width:auto;    \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bordered {\n");
      out.write("                border: solid #ccc 1px;\n");
      out.write("                -moz-border-radius: 6px;\n");
      out.write("                -webkit-border-radius: 6px;\n");
      out.write("                border-radius: 6px;\n");
      out.write("                -webkit-box-shadow: 0 1px 1px #ccc; \n");
      out.write("                -moz-box-shadow: 0 1px 1px #ccc; \n");
      out.write("                box-shadow: 0 1px 1px #ccc;         \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bordered tr:hover {\n");
      out.write("                background: #fbf8e9;\n");
      out.write("                -o-transition: all 0.1s ease-in-out;\n");
      out.write("                -webkit-transition: all 0.1s ease-in-out;\n");
      out.write("                -moz-transition: all 0.1s ease-in-out;\n");
      out.write("                -ms-transition: all 0.1s ease-in-out;\n");
      out.write("                transition: all 0.1s ease-in-out;     \n");
      out.write("            }    \n");
      out.write("\n");
      out.write("            .bordered td, .bordered th {\n");
      out.write("                border-left: 1px solid #ccc;\n");
      out.write("                border-top: 1px solid #ccc;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: left;    \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bordered th {\n");
      out.write("                background-color: #dce9f9;\n");
      out.write("                background-image: -webkit-gradient(linear, left top, left bottom, from(#ebf3fc), to(#dce9f9));\n");
      out.write("                background-image: -webkit-linear-gradient(top, #ebf3fc, #dce9f9);\n");
      out.write("                background-image:    -moz-linear-gradient(top, #ebf3fc, #dce9f9);\n");
      out.write("                background-image:     -ms-linear-gradient(top, #ebf3fc, #dce9f9);\n");
      out.write("                background-image:      -o-linear-gradient(top, #ebf3fc, #dce9f9);\n");
      out.write("                background-image:         linear-gradient(top, #ebf3fc, #dce9f9);\n");
      out.write("                -webkit-box-shadow: 0 1px 0 rgba(255,255,255,.8) inset; \n");
      out.write("                -moz-box-shadow:0 1px 0 rgba(255,255,255,.8) inset;  \n");
      out.write("                box-shadow: 0 1px 0 rgba(255,255,255,.8) inset;        \n");
      out.write("                border-top: none;\n");
      out.write("                text-shadow: 0 1px 0 rgba(255,255,255,.5); \n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bordered td:first-child, .bordered th:first-child {\n");
      out.write("                border-left: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bordered th:first-child {\n");
      out.write("                -moz-border-radius: 6px 0 0 0;\n");
      out.write("                -webkit-border-radius: 6px 0 0 0;\n");
      out.write("                border-radius: 6px 0 0 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bordered th:last-child {\n");
      out.write("                -moz-border-radius: 0 6px 0 0;\n");
      out.write("                -webkit-border-radius: 0 6px 0 0;\n");
      out.write("                border-radius: 0 6px 0 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bordered th:only-child{\n");
      out.write("                -moz-border-radius: 6px 6px 0 0;\n");
      out.write("                -webkit-border-radius: 6px 6px 0 0;\n");
      out.write("                border-radius: 6px 6px 0 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bordered tr:last-child td:first-child {\n");
      out.write("                -moz-border-radius: 0 0 0 6px;\n");
      out.write("                -webkit-border-radius: 0 0 0 6px;\n");
      out.write("                border-radius: 0 0 0 6px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bordered tr:last-child td:last-child {\n");
      out.write("                -moz-border-radius: 0 0 6px 0;\n");
      out.write("                -webkit-border-radius: 0 0 6px 0;\n");
      out.write("                border-radius: 0 0 6px 0;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body id=\"page1\">\n");
      out.write("        <!-- START PAGE SOURCE -->\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!--<a href=\"#\">Admin's site</a>-->\n");
      out.write("                    <nav>\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"current\"><a href=\"doctor.jsp\" class=\"m1\">Go Back</a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <aside>\n");
      out.write("                    <font color=red>Last Login :&nbsp;");
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
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </h3><hr>\n");
      out.write("                    <!--<h3><a href=\"#\">Calendar</a></h3>\n");
      out.write("                    <hr>--><h3><a href=\"changepwd.jsp\">change password</a></h3><hr>\n");
      out.write("                    <br>\n");
      out.write("                    \n");
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
      out.write("                   \n");
      out.write("                   \n");
      out.write("                    ");

                        String e = (String) request.getAttribute("errmsg");
                        if (e instanceof String) {
                    
      out.write("   \n");
      out.write("                    ");
      out.print(e);
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                                          \n");
      out.write("                    </center>\n");
      out.write("                                 </form>\n");
      out.write("                                   \n");
      out.write("                               </div>-->\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      if (_jspx_meth_s_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_s_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <div class=\"inside\" align=\"center\">\n");
      out.write("            <h2><span>Notice List</span></h2><hr><br><br>\n");
      out.write("            <table align=\"center\" border=\"0\" bgcolor=transparent class=\"bordered\">\n");
      out.write("                <tr class=\"gridheader\" bgcolor=transparent>\n");
      out.write("                    <th>  S.No.&nbsp;&nbsp;&nbsp;</th>\n");
      out.write("                    <th>  TITLE&nbsp;&nbsp;&nbsp;</th>\n");
      out.write("                    <th>  CONTENT &nbsp;&nbsp;&nbsp;</th>\n");
      out.write("                    <th>  TYPE &nbsp;&nbsp;&nbsp;</th>\n");
      out.write("                    <th>  DATE &nbsp;&nbsp;&nbsp;</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("     \n");
      out.write("            </table>   \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br><br><br><br><br><br><br><br><br>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footerlink\">\n");
      out.write("                <p class=\"lf\">Copyright &copy; 2014 &nbsp;  <a href=\"www.healthcare.com\">HealthCare Solutions</a> - All Rights Reserved</p>\n");
      out.write("                <p class=\"rf\"> Health Department</p>\n");
      out.write("                <div style=\"clear:both;\"></div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script type=\"text/javascript\"> Cufon.now();</script>\n");
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

  private boolean _jspx_meth_s_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_s_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_s_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_s_setDataSource_0.setParent(null);
    _jspx_th_s_setDataSource_0.setDriver((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.driver}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_setDataSource_0.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_setDataSource_0.setUser((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_s_setDataSource_0.setPassword((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.pwd}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_s_setDataSource_0 = _jspx_th_s_setDataSource_0.doStartTag();
    if (_jspx_th_s_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
      return true;
    }
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody.reuse(_jspx_th_s_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_s_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_s_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_s_query_var.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_s_query_0.setPageContext(_jspx_page_context);
    _jspx_th_s_query_0.setParent(null);
    _jspx_th_s_query_0.setVar("rs");
    int[] _jspx_push_body_count_s_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_s_query_0 = _jspx_th_s_query_0.doStartTag();
      if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_s_query_0[0]++;
          _jspx_th_s_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_query_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            select *from notice\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_s_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_s_query_0[0]--;
      }
      if (_jspx_th_s_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_s_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_s_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_s_query_0.doFinally();
      _jspx_tagPool_s_query_var.reuse(_jspx_th_s_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("data");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVarStatus("s");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                    ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write(" \n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.count mod 2 eq 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <tr class=\"gridrow\" >\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                        </tr>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.count mod 2 ne 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <tr class=\"gridalter\" >\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.content}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.type}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                            <td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${data.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>\n");
        out.write("                        </tr>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
