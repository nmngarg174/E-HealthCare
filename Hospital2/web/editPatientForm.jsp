
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Admin</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/Site.css" type="text/css" media="all">
        <link rel="stylesheet" href="css/adminstyle.css" type="text/css" media="all">
        <script type="text/javascript" src="js/jquery-1.4.2.min.js" ></script>
        <script type="text/javascript" src="js/cufon-yui.js"></script>
        <script type="text/javascript" src="js/cufon-replace.js"></script>
        <script type="text/javascript" src="js/Myriad_Pro_300.font.js"></script>
        <script type="text/javascript" src="js/Myriad_Pro_400.font.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
        <!--[if lt IE 7]>
        <link rel="stylesheet" href="css/ie6.css" type="text/css" media="screen">
        <script type="text/javascript" src="js/ie_png.js"></script>
        <script type="text/javascript">ie_png.fix('.png, footer, header nav ul li a, .nav-bg, .list li img');</script>
        <![endif]-->
        <!--[if lt IE 9]><script type="text/javascript" src="js/html5.js"></script><![endif]-->
        <style>


            table {
                *border-collapse: collapse; /* IE7 and lower */
                border-spacing: 0;
                width:auto;    
            }

            .bordered {
                border: solid #ccc 1px;
                -moz-border-radius: 6px;
                -webkit-border-radius: 6px;
                border-radius: 6px;
                -webkit-box-shadow: 0 1px 1px #ccc; 
                -moz-box-shadow: 0 1px 1px #ccc; 
                box-shadow: 0 1px 1px #ccc;         
            }

            .bordered tr:hover {
                background: #fbf8e9;
                -o-transition: all 0.1s ease-in-out;
                -webkit-transition: all 0.1s ease-in-out;
                -moz-transition: all 0.1s ease-in-out;
                -ms-transition: all 0.1s ease-in-out;
                transition: all 0.1s ease-in-out;     
            }    

            .bordered td, .bordered th {
                border-left: 1px solid #ccc;
                border-top: 1px solid #ccc;
                padding: 10px;
                text-align: left;    
            }

            .bordered th {
                background-color: #dce9f9;
                background-image: -webkit-gradient(linear, left top, left bottom, from(#ebf3fc), to(#dce9f9));
                background-image: -webkit-linear-gradient(top, #ebf3fc, #dce9f9);
                background-image:    -moz-linear-gradient(top, #ebf3fc, #dce9f9);
                background-image:     -ms-linear-gradient(top, #ebf3fc, #dce9f9);
                background-image:      -o-linear-gradient(top, #ebf3fc, #dce9f9);
                background-image:         linear-gradient(top, #ebf3fc, #dce9f9);
                -webkit-box-shadow: 0 1px 0 rgba(255,255,255,.8) inset; 
                -moz-box-shadow:0 1px 0 rgba(255,255,255,.8) inset;  
                box-shadow: 0 1px 0 rgba(255,255,255,.8) inset;        
                border-top: none;
                text-shadow: 0 1px 0 rgba(255,255,255,.5); 
            }

            .bordered td:first-child, .bordered th:first-child {
                border-left: none;
            }

            .bordered th:first-child {
                -moz-border-radius: 6px 0 0 0;
                -webkit-border-radius: 6px 0 0 0;
                border-radius: 6px 0 0 0;
            }

            .bordered th:last-child {
                -moz-border-radius: 0 6px 0 0;
                -webkit-border-radius: 0 6px 0 0;
                border-radius: 0 6px 0 0;
            }

            .bordered th:only-child{
                -moz-border-radius: 6px 6px 0 0;
                -webkit-border-radius: 6px 6px 0 0;
                border-radius: 6px 6px 0 0;
            }

            .bordered tr:last-child td:first-child {
                -moz-border-radius: 0 0 0 6px;
                -webkit-border-radius: 0 0 0 6px;
                border-radius: 0 0 0 6px;
            }

            .bordered tr:last-child td:last-child {
                -moz-border-radius: 0 0 6px 0;
                -webkit-border-radius: 0 0 6px 0;
                border-radius: 0 0 6px 0;
            }
        </style>
    </head>

    <body id="page1">
        <!-- START PAGE SOURCE -->
        <div class="wrap">
            <header>
                <div class="container">
                    <!--<a href="#">Admin's site</a>-->
                    <nav>
                        <ul>
                            <li class="current"><a href="patient.jsp" class="m1">Go Back</a></li>

                        </ul>
                    </nav>
                    <!--<form action="#" id="search-form">
                        <fieldset>
                            <div class="rowElem">
                                
                                <a href="AdminSearch.jsp">Search Faculty/Student</a></div>
                        </fieldset>
                    </form>-->
                </div>
            </header>

            <div class="container">
                <aside>
                    <font color=red>Last Login :&nbsp;<%=session.getAttribute("date")%></font>
                    <br><br>
                    <!--<c:forEach var="mata" items="${rss.rows}">
                        <h3>welcome &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${mata.Name}</h3><hr>
                    </c:forEach>-->
                    <!--<h3>Welcome &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.name}</h3>-->
                    <h3>userid &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${sessionScope.name} </h3><hr>
                    <!--<h3><a href="#">Calendar</a></h3>
                    <hr>--><h3><a href="changepwd.jsp">change password</a></h3><hr>
                    <br>
                    <!-- <h3>Online Students</h3>
                     <ul class="categories">
                         <li><span><a href="#">Programs</a></span></li>
                         <li><span><a href="#">Programs</a></span></li>
 
                     </ul>
                     <hr>
                     <h3>Online Faculties</h3>
                     <ul class="categories">
                         <li><span><a href="#">Administrators</a></span></li>
                         <li><span><a href="#">Programs</a></span></li>
                         <br><br>
                         <hr>
 
                     </ul>-->    
                    <!--  <form action="#" id="newsletter-form">
                          <fieldset>
                              <div class="rowElem">
                                  <h2>View Queries</h2>
  
                              </div>
                          </fieldset>
                      </form>
                      <ul class="news">
                          <li><strong>June 30, 2010</strong>
                              <h4><a href="#">Sed ut perspiciatis unde</a></h4>
                              Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque. </li>
                          <li><strong>June 14, 2010</strong>
                              <h4><a href="#">Neque porro quisquam est</a></h4>
                              Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit consequuntur magni. </li>
                          <li><strong>May 29, 2010</strong>
                              <h4><a href="#">Minima veniam, quis nostrum</a></h4>
                              Uis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae. </li>
                      </ul>-->
                </aside>
                <section id="content">
                    <div id="banner">
                        <!--<h4>Health Care Solutions<span>Delhi <span>Since 2012</span></span></h4>-->
                    </div>
                    <!--<div class="inside">
                        <h2>Add Student<span>/Faculty</span></h2><hr><br><br>
                        <form action="AdminAdd" method ="get">
                           
                            <center>
                               
                               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Add : <select  align="center" name="Status" style="font-size:14px; font-family:'Comic Sans MS';font-weight:bold;" >
                                    <option value="null" >---------Select---------</option>
                                    <option value="faclt"  >Faculty</option>
                                    <option value="studn" >Student</option>													

                                </select>
                                <br><br><br>
                                Enter Username :     <input type="text" name="username" style="font-size:14px; font-family:'Comic Sans MS';font-weight:bold;"/><br><br><br>
                                Enter Password :     <input type="password" name="pwd" style="font-size:14px; font-family:'Comic Sans MS';font-weight:bold;"/><br><br><br>
                                
                                <input type="submit" class="black button" value="ADD"></input>
                                <br><br>
                   
                   
                    <%
                        String e = (String) request.getAttribute("errmsg");
                        if (e instanceof String) {
                    %>   
                    <%=e%>
                    <%}%>
                                          
                    </center>
                                 </form>
                                   
                               </div>-->
                </section>
            </div>
        </div>
        <s:setDataSource driver="${initParam.driver}"
                         url="${initParam.url}"
                         user="${initParam.user}" password="${initParam.pwd}"/>

        <s:query var="rs">
            select *from patient where name='${sessionScope.name}'
        </s:query>
        <div class="inside" align="center">
            <div class="inside">
                <h2>Edit <span>Profile</span></h2><hr>

                <br><font size="5">
                <form action="editPatient.jsp" method='post'>
                    <c:forEach var="data" items="${rs.rows}">
                    
                    <table>
                        <tr><td colspan="2"><h3>EDIT DOCTOR FORM</h3></td></tr>
                        <!--<tr>
                            <td>DOCTOR IMAGE</td>
                            <td><a href="${data.location}"><img src="${data.image}" ></td>
                                    </tr>-->
                                    
                                    
                                    <tr>
                                        <td>PATIENT ID</td>
                                        <td><input type="text" name="id" value=${data.id} readonly /></td>
                                    </tr>
                                    <tr>
                                        <td>PATIENT NAME</td>
                                        <td><input type="text" name="name" value="${data.name}" readonly/></td>
                                    </tr>
                                    <tr>
                                        <td>PATIENT AGE</td>
                                        <td><input type="text" name="age" value="${data.age}"/></td>
                                    </tr>
                                    <tr>
                                        <td>PATIENT CONTACT</td>
                                        <td><input type="text" name="contact" value="${data.contact}"/></td>
                                    </tr>
                                    <tr>
                                        <!--    <td>RELEASE DATE</td>
                                            <td><input type="date" name="rd" value="${data.rdate}"/></td>
                                        </tr>
                                        <tr>-->
                                    <tr>
                                        <td>PATIENT EMAIL</td>
                                        <td><input type="text" name="email" value="${data.email}"/></td>
                                    </tr>
                                    <tr>
                                        <td>PATIENT GENDER</td>
                                        <td><input type="text" name="gender" value="${data.gender}"/></td>
                                    </tr>
                                    <tr>
                                        <td>PATIENT LOAN STATUS</td>
                                        <td><input type="text" name="cd" value="${data.loanStatus}"/></td>
                                    </tr>
                                    
                                    <!--<tr>
                                        <td>DOCTOR GENDER</td>
                                        <td><input type="text" name="cd" value="${data.gender}"/></td>
                                    </tr>-->
                                    <td><br><br><br><input type="submit" value="SAVE DOCTOR"/></td>
                                    <td><br><br><br><input type="reset"/></td>
                        </tr>    
                        <tr>
                            <td colspan="2" align="center">
                                <font color="green" size="4">
                                ${requestScope.sm}
                                </font>
                            </td>
                        </tr>    
                    </table>
                    </c:forEach>               
                </form>    
            </div>
            <br><br><br><br><br><br><br><br><br>

            <footer>
                <div class="footerlink">
                    <p class="lf">Copyright &copy; 2014 &nbsp;  <a href="www.healthcare.com">HealthCare Solutions</a> - All Rights Reserved</p>
                    <p class="rf"> Health Department</p>
                    <div style="clear:both;"></div>
                </div>
            </footer>
            <script type="text/javascript"> Cufon.now();</script>
            <!-- END PAGE SOURCE -->
    </body>
</html>
