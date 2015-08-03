<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Login and Registration Form with HTML5 and CSS3</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="Login/css/demo.css" />
        <link rel="stylesheet" type="text/css" href="Login/css/style.css" />
        <link rel="stylesheet" type="text/css" href="Login/css/animate-custom.css" />
    </head>
    <body>
        <div class="container">
            <!-- Codrops top bar -->
            <div class="codrops-top">
                <!--  <a href="">
                <!-- <strong>&laquo; Previous Demo: </strong>Responsive Content Navigator>
             </a>-->
                <!--  <span class="right">
                      <a href=" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/">
                          <strong>Back to the Codrops Article</strong>
                      </a>
                  </span>-->
                <div class="clr"></div>
            </div><!--/ Codrops top bar -->
            <!--<header>
                <h1>Login and Registration Form <span>with HTML5 and CSS3</span></h1>
                                <nav class="codrops-demos">
                                        
                                </nav>
            </header>-->
            <img src="images/logo1.png" width="432" height="210" alt="s">
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="authentication1" autocomplete="on" method="post"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u" > Your email or username </label>
                                    <input id="username" name="username" required type="text" placeholder="Enter your username"/>
                                </p>
                                <%
                                        String e = (String) request.getAttribute("errmsg");
                                        if (e instanceof String) {

                                    %> 
                                    <%=e%>
                                    <%

                                        }


                                    %>

                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <input id="password" name="password" required type="password" placeholder="Enter your password" /> 
                                </p>
                                <p class="keeplogin"> 
                                    <input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
                                    <label for="loginkeeping">Keep me logged in</label>
                                </p>
                                <p class="login button"> 
                                    <input type="submit" value="Login" /> 
                                </p>
                                <p class="change_link">

                                    <a href="#toregister" class="to_register">Join us as patient</a>
                                    <a href="imageUpload.jsp" class="to_register">Join us as doctor</a>

                                </p>
                            </form>
                        </div>

                        <div id="register" class="animate form">
                            <form  method="post" action="verifyUserPatient"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="name" required type="text" placeholder="mysuperusername690" />
                                    <%
                                        String l = (String) request.getAttribute("errmsg");
                                        if (l instanceof String) {

                                    %> 
                                    <%=l%>
                                    <%

                                        }


                                    %>
                                </p>

                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your location</label>
                                    <input id="usernamesignup" name="location" required type="text" placeholder="mysuperusername690" />
                                </p>
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your gender</label>
                                    <input id="usernamesignup" name="gender" required type="text" placeholder="mysuperusername690" />
                                </p>
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u" > Your Phone No.</label>
                                    <input id="emailsignup" name="phone" required type="text" placeholder="mysupermail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u" > Your age</label>
                                    <input id="emailsignup" name="age" required type="text" placeholder="mysupermail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                    <input id="emailsignup" name="email" required type="email" placeholder="mysupermail@mail.com"/> 
                                </p>

                                <p> 


                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="password" required type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="password" required type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p class="signin button"> 
                                    <input type="submit" value="Sign up"/> 
                                </p>
                                <p class="change_link">  
                                    Already a member ?
                                    <a href="#tologin" class="to_register"> Go and log in </a>
                                </p>
                            </form>
                        </div>

                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>