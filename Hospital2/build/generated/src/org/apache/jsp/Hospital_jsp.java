package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;

public final class Hospital_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_query_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_query_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_setDataSource_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
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
      out.write("\n");
      if (_jspx_meth_s_setDataSource_0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_s_query_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\n");
      out.write("         ");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"EN\" lang=\"EN\" dir=\"ltr\">\n");
      out.write("<head profile=\"http://gmpg.org/xfn/11\">\n");
      out.write("<title>Elegant Typo</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/layout.css\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body id=\"top\">\n");
      out.write("<div id=\"container\">\n");
      out.write("  <div id=\"head\">\n");
      out.write("    <span id=\"logo\">\n");
      out.write("      <h1><a href=\"#\"><strong><span>E</span>Hea</strong><span>lthCare</span></a></h1>\n");
      out.write("    </span>\n");
      out.write("    <img src=\"images/demo/logo1.png\" height=\"120\" width=\"140\"/>\n");
      out.write("    <!--<div id=\"social\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\"><img src=\"images/bookmarks/rss.jpg\" alt=\"RSS\" /></a></li>\n");
      out.write("        <li><a href=\"#\"><img src=\"images/bookmarks/twitter.jpg\" alt=\"Twitter\" /></a></li>\n");
      out.write("        <li onclick=\"window.open('http://del.icio.us/post?v=2&amp;url='+encodeURIComponent(location.href)+'&amp;notes=&amp;tags=&amp;title='+encodeURIComponent(document.title));return false;\"><img src=\"images/bookmarks/delicious.jpg\" alt=\"Del.icio.us\" /></li>\n");
      out.write("        <li onclick=\"window.open('http://reddit.com/submit?url='+encodeURIComponent(location.href)+'&amp;title='+encodeURIComponent(document.title));return false;\"><img src=\"images/bookmarks/reddit.jpg\" alt=\"reddit\" /></li>\n");
      out.write("        <li onclick=\"window.open('http://www.stumbleupon.com/submit?url='+encodeURIComponent(location.href)+'&amp;title='+encodeURIComponent(document.title));return false;\"><img src=\"images/bookmarks/stumbleupon.jpg\" alt=\"Stumbleupon\" /></li>\n");
      out.write("        <li onclick=\"window.open('http://www.facebook.com/share.php?u='+encodeURIComponent(location.href)+'&amp;t=');return false;\"><img src=\"images/bookmarks/facebook.jpg\" alt=\"Add to: Facebook\" /></li>\n");
      out.write("        <li onclick=\"window.open('http://digg.com/submit?phase=2&amp;url='+encodeURIComponent(location.href)+'&amp;bodytext=&amp;tags=&amp;title='+encodeURIComponent(document.title));return false;\"> <img src=\"images/bookmarks/digg.jpg\" alt=\"Digg\" /></li>\n");
      out.write("        <li class=\"last\" onclick=\"window.open('http://myweb2.search.yahoo.com/myresults/bookmarklet?t='+encodeURIComponent(document.title)+'&amp;d=&amp;tag=&amp;u='+encodeURIComponent(location.href));return false;\"><img src=\"images/bookmarks/yahoo.jpg\" alt=\"Y! MyWeb\" /></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"search\">\n");
      out.write("      <form action=\"#\" method=\"post\">\n");
      out.write("        <fieldset>\n");
      out.write("          <legend>Site Search</legend>\n");
      out.write("          <input type=\"submit\" name=\"go\" id=\"go\" value=\"GO\" />\n");
      out.write("          <input type=\"text\" value=\"Search the site&hellip;\"  onfocus=\"this.value=(this.value=='Search the site&hellip;')? '' : this.value ;\" />\n");
      out.write("        </fieldset>\n");
      out.write("      </form>\n");
      out.write("    </div>-->\n");
      out.write("   <!-- <div id=\"quicklinks\">\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"#\">About Us</a></li>\n");
      out.write("        <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("        <li class=\"last\"><a href=\"#\">E-Newsletter</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>-->\n");
      out.write("  </div>\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("    <div id=\"content\">\n");
      out.write("      <div id=\"introbox\">\n");
      out.write("        <div>{</div>\n");
      out.write("        <h2>Dedicated To Provide the best In Home HeathCare Online Services.</h2>\n");
      out.write("        <!--<p>Elegant Typo is an imageless Open Source website template that only uses CSS for layout styling.</p>-->\n");
      out.write("      </div>\n");
      out.write("      <!-- Content Box -->\n");
      out.write("      <div class=\"homecontent\">\n");
      out.write("        <ul>\n");
      out.write("          <li>\n");
      out.write("            <p class=\"imgholder\"><img src=\"images/demo/health3.jpg\" alt=\"\"  height=\"100\" width=\"280\"/></p>\n");
      out.write("            <h2>Equipped with Modern Techniques</h2>\n");
      out.write("            <p>In India, <span style=\"text-decoration: underline;\">EHealthCare Solutions</span> are on top providing the modern healthcare services to their patients? In this post, I am gonna tell you about the modern healthcare services provided by <em>EHealth Care Solutions</em>? </p>\n");
      out.write("            <p class=\"readmore\"><a href=\"mordern.html\">Read More &raquo;</a></p>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"last\">\n");
      out.write("            <p class=\"imgholder\"><img src=\"images/demo/health2.jpg\" alt=\"\"  height=\"100\" width=\"280\"/></p>\n");
      out.write("            <h2>Health Awareness and Vaccination Camp</h2>\n");
      out.write("            <p>UNICEF-supported mass vaccination campaign in Ethiopian refugee camp continues</p>\n");
      out.write("            <p class=\"readmore\"><a href=\"immunization.html\">Read More &raquo;</a></p>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Content Box -->\n");
      out.write("     <!-- <div class=\"homecontent\">\n");
      out.write("        <ul>\n");
      out.write("          <li>\n");
      out.write("            <h2 class=\"title\"><img src=\"images/demo/64x64.gif\" alt=\"\" />Nullamlacus dui ipsum conseque loborttis</h2>\n");
      out.write("            <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\n");
      out.write("            <p class=\"readmore2\"><a href=\"#\">Read More &raquo;</a></p>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"last\">\n");
      out.write("            <h2 class=\"title\"><img src=\"images/demo/64x64.gif\" alt=\"\" />Nullamlacus dui ipsum conseque loborttis</h2>\n");
      out.write("            <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\n");
      out.write("            <p class=\"readmore2\"><a href=\"#\">Read More &raquo;</a></p>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("      </div>-->\n");
      out.write("      <!-- /Box -->\n");
      out.write("      <!--<h2>About This Free CSS Template</h2>\n");
      out.write("      <p>This is a W3C standards compliant free website template from <a href=\"http://www.os-templates.com/\">OS Templates</a>.</p>\n");
      out.write("      <p>This template is distributed using a <a href=\"http://www.os-templates.com/template-terms\">Website Template Licence</a>, which allows you to use and modify the template for both personal and commercial use when you keep the provided credit links in the footer.</p>\n");
      out.write("      <p>For more CSS templates visit <a href=\"http://www.os-templates.com/\">Free Website Templates</a>.</p>-->\n");
      out.write("    </div>\n");
      out.write("    <div id=\"rightblock\">\n");
      out.write("      <div id=\"navi\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a class=\"active\" href=\"index.html\">HomeCare</a></li>\n");
      out.write("          <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("          <li><a href=\"services.html\">Our Online Services </a></li>\n");
      out.write("          <li><a href=\"login.jsp\">Log In</a></li>\n");
      out.write("          <li><a href=\"DoctorSelect.jsp\">Know Our Doctors</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"holder\">\n");
      out.write("        <h2>Daily HealthCare Tips </h2>\n");
      out.write("        <p>?Health is a state of complete physical, mental and social well being, and not merely the absence of disease or infirmity.? - WHO</p>\n");
      out.write("        <div class=\"readmore\"><a href=\"style-demo.html\">Read More &raquo;</a></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"holder\"><img src=\"images/demo/health4.jpg\" alt=\"\" width=\"230\" height=\"100\" />\n");
      out.write("        <p>Smoking kills. If you're killed, you've lost a very important part of your life.\n");
      out.write("</p>\n");
      out.write("        <div class=\"readmore\"><a href=\"smoking.html\">Read More &raquo;</a></div>\n");
      out.write("      </div>\n");
      out.write("      <!--<div class=\"holder\">\n");
      out.write("        <h2>Lorem ipsum dolor</h2>\n");
      out.write("        <p>Nuncsed sed conseque a at quismodo tris mauristibus sed habiturpiscinia sed.</p>\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"#\">Lorem ipsum dolor sit</a></li>\n");
      out.write("          <li>Etiam vel sapien et</li>\n");
      out.write("          <li><a href=\"#\">Etiam vel sapien et</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <p>Nuncsed sed conseque a at quismodo tris mauristibus sed habiturpiscinia sed. Condimentumsantincidunt dui mattis magna intesque purus orci augue lor nibh.</p>\n");
      out.write("        <div class=\"readmore\"><a href=\"#\">Read More &raquo;</a></div>\n");
      out.write("      </div>-->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("  <div id=\"footer\">\n");
      out.write("    <div id=\"contactform\">\n");
      out.write("      <h2>We Will Call You !</h2>\n");
      out.write("      <form action=\"#\" method=\"post\">\n");
      out.write("        <fieldset>\n");
      out.write("          <legend>Contact Form</legend>\n");
      out.write("          <label for=\"fullname\">Name:\n");
      out.write("            <input id=\"fullname\" name=\"fullname\" type=\"text\" value=\"\" />\n");
      out.write("          </label>\n");
      out.write("          <label for=\"emailaddress\" class=\"margin\">Email:\n");
      out.write("            <input id=\"emailaddress\" name=\"emailaddress\" type=\"text\" value=\"\" />\n");
      out.write("          </label>\n");
      out.write("          <label for=\"phone\">Telephone:\n");
      out.write("            <input id=\"phone\" name=\"phone\" type=\"text\" value=\"\" />\n");
      out.write("          </label>\n");
      out.write("          <label for=\"subject\" class=\"margin\">Subject:\n");
      out.write("            <input id=\"subject\" name=\"subject\" type=\"text\" value=\"\" />\n");
      out.write("          </label>\n");
      out.write("          <label for=\"message\">Message:<br />\n");
      out.write("            <textarea id=\"message\" name=\"message\" cols=\"40\" rows=\"4\"></textarea>\n");
      out.write("          </label>\n");
      out.write("          <p>\n");
      out.write("            <input id=\"submitform\" name=\"submitform\" type=\"submit\" value=\"Submit\" />\n");
      out.write("            &nbsp;\n");
      out.write("            <input id=\"resetform\" name=\"resetform\" type=\"reset\" value=\"Reset\" />\n");
      out.write("          </p>\n");
      out.write("        </fieldset>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Contact Form -->\n");
      out.write("    <div id=\"compdetails\">\n");
      out.write("      <div id=\"officialdetails\">\n");
      out.write("        <h2>Company Information !</h2>\n");
      out.write("        <ul>\n");
      out.write("          <li>E HealthCare Services Ltd</li>\n");
      out.write("          <li>Registered in India &amp; Delhi</li>\n");
      out.write("          <li>Company No. 201002</li>\n");
      out.write("          <li class=\"last\">VAT No. 565656</li>\n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("      <div id=\"contactdetails\">\n");
      out.write("        <h2>Our Contact Details !</h2>\n");
      out.write("        <ul>\n");
      out.write("          <li>E HealthCare Services Ltd</li>\n");
      out.write("          <li>Vasant Kunj ,C-29 ,Delhi ,India</li>\n");
      out.write("          <li>Delhi</li>\n");
      out.write("          <li>147004/Zip</li>\n");
      out.write("          <li>Tel: 0120-4160865</li>\n");
      out.write("          <li>Fax: 022 4546486252</li>\n");
      out.write("          <li>Email: nmngarg174@gmail.com</li>\n");
      out.write("          <li class=\"last\">Facebook : <a href=\"#\">Company Profile</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <!-- End Company Details -->\n");
      out.write("    <div id=\"copyright\">\n");
      out.write("      <p class=\"fl_left\">Copyright &copy; 2011 - All Rights Reserved - <a href=\"#\">HealthCare Solutions</a></p>\n");
      out.write("      <!--p class=\"fl_right\">Template by <a href=\"http://www.os-templates.com/\" title=\"Free Website Templates\">OS Templates</a></p>-->\n");
      out.write("      <br class=\"clear\" />\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
    _jspx_th_s_setDataSource_0.setPassword("initParam.pwd");
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
          out.write("    select count from visits\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("count");
    _jspx_th_c_set_0.setScope("session");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rs.count}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
