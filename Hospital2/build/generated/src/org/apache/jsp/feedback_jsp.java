package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"EN\" lang=\"EN\" dir=\"ltr\">\n");
      out.write("<head profile=\"http://gmpg.org/xfn/11\">\n");
      out.write("<title>Elegant Typo</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<meta http-equiv=\"imagetoolbar\" content=\"no\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/layout.css\" type=\"text/css\" />\n");
      out.write("<style>\n");
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
      out.write("\n");
      out.write("</head>\n");
      out.write("<body id=\"top\">\n");
      out.write("<div id=\"container\">\n");
      out.write("  <div id=\"head\">\n");
      out.write("    <div id=\"logo\">\n");
      out.write("      <h1><a href=\"#\"><strong><span>E</span>Hea</strong><span>lthCare</span></a></h1>\n");
      out.write("    </div>\n");
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
      out.write("     \t<p>Welcome Admin ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".</p>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("      <!-- Content Box -->\n");
      out.write("         <form action=\"sendFeedback.jsp\" method=\"post\">\n");
      out.write("            <h1>Feedback Form</h1> \n");
      out.write("            <div>\n");
      out.write("                As part of our work towards ensuring our customer's complete satisfaction, we invite you to take part in our short Customer Satisfaction Survey. We thank you for using our services and hope you will be confident to answer the survey. \n");
      out.write("            </div>\n");
      out.write("            <h2>For how long have you been using our website / service?</h2>\n");
      out.write("            <input type=\"radio\" name=\"m1\" value=\"1\">Less than a month<br>\n");
      out.write("            <input type=\"radio\" name=\"m1\" value=\"2\">1-12 months<br>\n");
      out.write("            <input type=\"radio\" name=\"m1\" value=\"3\">Over a year<br>\n");
      out.write("            <input type=\"radio\" name=\"m1\" value=\"0\">Never Used<br>\n");
      out.write("\n");
      out.write("            <h2>Are you satisfied with our website?</h2>\n");
      out.write("            <input type=\"radio\" name=\"m2\" value=\"4\">Very Satisfied<br>\n");
      out.write("            <input type=\"radio\" name=\"m2\" value=\"3\">Satified<br>\n");
      out.write("            <input type=\"radio\" name=\"m2\" value=\"2\">Neutral<br>\n");
      out.write("            <input type=\"radio\" name=\"m2\" value=\"1\">Unsatisfied<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h2>Will you use our product in website?</h2>\n");
      out.write("            <input type=\"radio\" name=\"m3\" value=\"4\">Definitely<br>\n");
      out.write("            <input type=\"radio\" name=\"m3\" value=\"3\">Probably yes<br>\n");
      out.write("            <input type=\"radio\" name=\"m3\" value=\"2\">Don't know<br>\n");
      out.write("            <input type=\"radio\" name=\"m3\" value=\"1\">No<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h2>Any Suggestions to improve the product ?</h2>\n");
      out.write("\n");
      out.write("            <textarea name=\"suggestion\" placeholder=\"Enter Suggestions\" \n");
      out.write("                      rows=\"10\" cols=\"80\" maxlength=\"100\" style=\"font-size:14px; font-family:'Comic Sans MS';font-weight:bold;\"></textarea><br><br><br>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("       \n");
      out.write("      <div class=\"homecontent\">\n");
      out.write("        <ul>\n");
      out.write("          <li>\n");
      out.write("            <!--<p class=\"imgholder\"><img src=\"images/demo/health3.jpg\" alt=\"\"  height=\"100\" width=\"280\"/></p>\n");
      out.write("            <h2>Equipped with Modern Techniques</h2>\n");
      out.write("            <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\n");
      out.write("            <p class=\"readmore\"><a href=\"#\">Read More &raquo;</a></p>-->\n");
      out.write("          </li>\n");
      out.write("          <li class=\"last\">\n");
      out.write("            <!--<p class=\"imgholder\"><img src=\"images/demo/health2.jpg\" alt=\"\"  height=\"100\" width=\"280\"/></p>\n");
      out.write("            <h2>Health Awareness and Vaccination Camp</h2>\n");
      out.write("            <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>\n");
      out.write("            <p class=\"readmore\"><a href=\"#\">Read More &raquo;</a></p>-->\n");
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
      out.write("          <!--<li><a class=\"active\" href=\"#\">Welcome ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>-->\n");
      out.write("          <li><a class=\"active\" href=\"#\">Last Login  ");
      out.print(session.getAttribute("date"));
      out.write("</a></li>\t\n");
      out.write("          <li><a class=\"active\" href=\"index.html\">HomeCare</a></li>\n");
      out.write("          <li><a href=\"style-demo.html\">Doctor Profile</a></li>\n");
      out.write("          <li><a href=\"full-width.html\">Patient Profile</a></li>\n");
      out.write("          <li><a href=\"login.jsp\">Change Password</a></li>\n");
      out.write("           <li><a href=\"login.jsp\">Feedback Profile</a></li>\n");
      out.write("          <!--<li><a href=\"#\">Know Our Doctors</a></li>-->\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <!--<div class=\"holder\">\n");
      out.write("        <h2>Daily HealthCare Tips </h2>\n");
      out.write("        <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. </p>\n");
      out.write("        <div class=\"readmore\"><a href=\"#\">Read More &raquo;</a></div>\n");
      out.write("      </div>-->\n");
      out.write("      <!--<div class=\"holder\"><img src=\"images/demo/health4.jpg\" alt=\"\" width=\"230\" height=\"100\" />\n");
      out.write("        <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna.</p>\n");
      out.write("        <div class=\"readmore\"><a href=\"#\">Read More &raquo;</a></div>\n");
      out.write("      </div>-->\n");
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
}
