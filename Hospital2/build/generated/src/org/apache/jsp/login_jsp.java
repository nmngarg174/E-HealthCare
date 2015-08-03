package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7 ]> <html lang=\"en\" class=\"no-js ie6 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 7 ]>    <html lang=\"en\" class=\"no-js ie7 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]>    <html lang=\"en\" class=\"no-js ie8 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 9 ]>    <html lang=\"en\" class=\"no-js ie9\"> <![endif]-->\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!--> <html lang=\"en\" class=\"no-js\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">  -->\n");
      out.write("        <title>Login and Registration Form with HTML5 and CSS3</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <meta name=\"description\" content=\"Login and Registration Form with HTML5 and CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"html5, css3, form, switch, animation, :target, pseudo-class\" />\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/css/demo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/css/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Login/css/animate-custom.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Codrops top bar -->\n");
      out.write("            <div class=\"codrops-top\">\n");
      out.write("                <!--  <a href=\"\">\n");
      out.write("                <!-- <strong>&laquo; Previous Demo: </strong>Responsive Content Navigator>\n");
      out.write("             </a>-->\n");
      out.write("                <!--  <span class=\"right\">\n");
      out.write("                      <a href=\" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/\">\n");
      out.write("                          <strong>Back to the Codrops Article</strong>\n");
      out.write("                      </a>\n");
      out.write("                  </span>-->\n");
      out.write("                <div class=\"clr\"></div>\n");
      out.write("            </div><!--/ Codrops top bar -->\n");
      out.write("            <!--<header>\n");
      out.write("                <h1>Login and Registration Form <span>with HTML5 and CSS3</span></h1>\n");
      out.write("                                <nav class=\"codrops-demos\">\n");
      out.write("                                        \n");
      out.write("                                </nav>\n");
      out.write("            </header>-->\n");
      out.write("            <img src=\"images/logo1.png\" width=\"432\" height=\"210\" alt=\"s\">\n");
      out.write("            <section>\t\t\t\t\n");
      out.write("                <div id=\"container_demo\" >\n");
      out.write("                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\n");
      out.write("                    <div id=\"wrapper\">\n");
      out.write("                        <div id=\"login\" class=\"animate form\">\n");
      out.write("                            <form  action=\"authentication1\" autocomplete=\"on\" method=\"post\"> \n");
      out.write("                                <h1>Log in</h1> \n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"username\" class=\"uname\" data-icon=\"u\" > Your email or username </label>\n");
      out.write("                                    <input id=\"username\" name=\"username\" required type=\"text\" placeholder=\"Enter your username\"/>\n");
      out.write("                                </p>\n");
      out.write("                                ");

                                        String e = (String) request.getAttribute("errmsg");
                                        if (e instanceof String) {

                                    
      out.write(" \n");
      out.write("                                    ");
      out.print(e);
      out.write("\n");
      out.write("                                    ");


                                        }


                                    
      out.write("\n");
      out.write("\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> Your password </label>\n");
      out.write("                                    <input id=\"password\" name=\"password\" required type=\"password\" placeholder=\"Enter your password\" /> \n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"keeplogin\"> \n");
      out.write("                                    <input type=\"checkbox\" name=\"loginkeeping\" id=\"loginkeeping\" value=\"loginkeeping\" /> \n");
      out.write("                                    <label for=\"loginkeeping\">Keep me logged in</label>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"login button\"> \n");
      out.write("                                    <input type=\"submit\" value=\"Login\" /> \n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"change_link\">\n");
      out.write("\n");
      out.write("                                    <a href=\"#toregister\" class=\"to_register\">Join us as patient</a>\n");
      out.write("                                    <a href=\"imageUpload.jsp\" class=\"to_register\">Join us as doctor</a>\n");
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"register\" class=\"animate form\">\n");
      out.write("                            <form  method=\"post\" action=\"verifyUserPatient.jsp\"> \n");
      out.write("                                <h1> Sign up </h1> \n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\">Your username</label>\n");
      out.write("                                    <input id=\"usernamesignup\" name=\"name\" required type=\"text\" placeholder=\"mysuperusername690\" />\n");
      out.write("\n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\">Your location</label>\n");
      out.write("                                    <input id=\"usernamesignup\" name=\"location\" required type=\"text\" placeholder=\"mysuperusername690\" />\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\">Your gender</label>\n");
      out.write("                                    <input id=\"usernamesignup\" name=\"gender\" required type=\"text\" placeholder=\"mysuperusername690\" />\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\" > Your Phone No.</label>\n");
      out.write("                                    <input id=\"emailsignup\" name=\"phone\" required type=\"text\" placeholder=\"mysupermail@mail.com\"/> \n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\" > Your age</label>\n");
      out.write("                                    <input id=\"emailsignup\" name=\"age\" required type=\"text\" placeholder=\"mysupermail@mail.com\"/> \n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"emailsignup\" class=\"youmail\" data-icon=\"e\" > Your email</label>\n");
      out.write("                                    <input id=\"emailsignup\" name=\"email\" required type=\"email\" placeholder=\"mysupermail@mail.com\"/> \n");
      out.write("                                </p>\n");
      out.write("\n");
      out.write("                                <p> \n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <label for=\"passwordsignup\" class=\"youpasswd\" data-icon=\"p\">Your password </label>\n");
      out.write("                                    <input id=\"passwordsignup\" name=\"password\" required type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"passwordsignup_confirm\" class=\"youpasswd\" data-icon=\"p\">Please confirm your password </label>\n");
      out.write("                                    <input id=\"passwordsignup_confirm\" name=\"password\" required type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"signin button\"> \n");
      out.write("                                    <input type=\"submit\" value=\"Sign up\"/> \n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"change_link\">  \n");
      out.write("                                    Already a member ?\n");
      out.write("                                    <a href=\"#tologin\" class=\"to_register\"> Go and log in </a>\n");
      out.write("                                </p>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
