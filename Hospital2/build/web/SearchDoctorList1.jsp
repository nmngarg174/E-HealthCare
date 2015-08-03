<% 
    if(session.getAttribute("role").equals("admin")){  
%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="EN" lang="EN" dir="ltr">
    <head profile="http://gmpg.org/xfn/11">
        <title>Elegant Typo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <meta http-equiv="imagetoolbar" content="no" />
        <link rel="stylesheet" href="styles/layout.css" type="text/css" />
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
    <body id="top">
        <div id="container">
            <div id="head">
                <div id="logo">
                    <h1><a href="#"><strong><span>E</span>Hea</strong><span>lthCare</span></a></h1>
                </div>
                <!--<div id="social">
                  <ul>
                    <li><a href="#"><img src="images/bookmarks/rss.jpg" alt="RSS" /></a></li>
                    <li><a href="#"><img src="images/bookmarks/twitter.jpg" alt="Twitter" /></a></li>
                    <li onclick="window.open('http://del.icio.us/post?v=2&amp;url='+encodeURIComponent(location.href)+'&amp;notes=&amp;tags=&amp;title='+encodeURIComponent(document.title));return false;"><img src="images/bookmarks/delicious.jpg" alt="Del.icio.us" /></li>
                    <li onclick="window.open('http://reddit.com/submit?url='+encodeURIComponent(location.href)+'&amp;title='+encodeURIComponent(document.title));return false;"><img src="images/bookmarks/reddit.jpg" alt="reddit" /></li>
                    <li onclick="window.open('http://www.stumbleupon.com/submit?url='+encodeURIComponent(location.href)+'&amp;title='+encodeURIComponent(document.title));return false;"><img src="images/bookmarks/stumbleupon.jpg" alt="Stumbleupon" /></li>
                    <li onclick="window.open('http://www.facebook.com/share.php?u='+encodeURIComponent(location.href)+'&amp;t=');return false;"><img src="images/bookmarks/facebook.jpg" alt="Add to: Facebook" /></li>
                    <li onclick="window.open('http://digg.com/submit?phase=2&amp;url='+encodeURIComponent(location.href)+'&amp;bodytext=&amp;tags=&amp;title='+encodeURIComponent(document.title));return false;"> <img src="images/bookmarks/digg.jpg" alt="Digg" /></li>
                    <li class="last" onclick="window.open('http://myweb2.search.yahoo.com/myresults/bookmarklet?t='+encodeURIComponent(document.title)+'&amp;d=&amp;tag=&amp;u='+encodeURIComponent(location.href));return false;"><img src="images/bookmarks/yahoo.jpg" alt="Y! MyWeb" /></li>
                  </ul>
                </div>
                <div id="search">
                  <form action="#" method="post">
                    <fieldset>
                      <legend>Site Search</legend>
                      <input type="submit" name="go" id="go" value="GO" />
                      <input type="text" value="Search the site&hellip;"  onfocus="this.value=(this.value=='Search the site&hellip;')? '' : this.value ;" />
                    </fieldset>
                  </form>
                </div>-->
                <!-- <div id="quicklinks">
                   <ul>
                     <li><a href="#">About Us</a></li>
                     <li><a href="#">Contact Us</a></li>
                     <li class="last"><a href="#">E-Newsletter</a></li>
                   </ul>
                 </div>-->
            </div>
            <div id="wrapper">
                <div id="content">
                    <div id="introbox">
                        <div>{</div>
                       <!-- <h2>Dedicated To Provide the best In Home HeathCare Online Services.</h2>
                        <p>Elegant Typo is an imageless Open Source website template that only uses CSS for layout styling.</p>-->
        <s:setDataSource driver="${initParam.driver}"
                         url="${initParam.url}"
                         user="${initParam.user}" password="${initParam.pwd}"/>

        <s:query var="rs">
            select *from doctor
        </s:query>
            <p>Search A Doctor</p>

                
                <jsp:include page="searchBarDoctor.jsp"/>
                <%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
                <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

                <s:setDataSource driver="${initParam.driver}"
                                 url="${initParam.url}"
                                 user="${initParam.user}" password="${initParam.pwd}"/>

                <c:if test="${param.flag eq null}">
                    <s:query var="rs">
                        select *from doctor
                    </s:query>
                </c:if>  
                <c:if test="${param.flag ne null}">
                    <s:query var="rs">
                        ${requestScope.searchQuery}
                    </s:query>
                </c:if>     
                <c:set var="src" value="0"/>   
                <table align="center" border="0" bgcolor=transparent class="bordered">
                <tr class="gridheader" bgcolor=transparent>
                    <th>S.No.&nbsp;&nbsp;&nbsp;</th>
                    <th>  NAME &nbsp;&nbsp;&nbsp;</th>
                    <th>  GENDER &nbsp;&nbsp;&nbsp;</th>
                    <th>  EMAIL &nbsp;&nbsp;&nbsp;</th>
                    <!--<th>  LOCATION &nbsp;&nbsp;&nbsp;</th>-->
                    <th>  CONTACT &nbsp;&nbsp;&nbsp;</th>
                    <th>  DEPARTMENT &nbsp;&nbsp;&nbsp;</th>
                    <!--<th>  IMAGE</th>-->
                    <th>  ACTION </th>
                </tr>
                <c:forEach var="data" items="${rs.rows}" varStatus="s">
                    <c:if test="${s.count mod 2 eq 0}">
                        <tr class="gridrow" >
                            <td>${s.count}</td>
                            <td>${data.name}</td>
                            <td>${data.gender}</td>
                            <td>${data.email}</td>
                            <!--<td>${data.location}</td>-->
                            <td>${data.contact}</td>
                            <td>${data.dept}</td>
                            <!--<td><a href="${data.location}"><img src="${data.image}" ></td>-->
                                    <td >
                                        <!--<a href="editpatientform.jsp?id=${data.sno}">
                                            <img title="EDIT Patient" src="images/edit.png"/>
                                        </a>--> 
                                        <a onclick="return deleteConfirmation()" href="deleteDoctor.jsp?id=${data.id}&name=${data.name}">
                                            <img title="DELETE Patient" src="images/delete.png"/>
                                        </a>
                                    </td>
                        </tr>
                    </c:if>
                    <c:if test="${s.count mod 2 ne 0}">
                        <tr class="gridalter" >
                            <td>${s.count}</td>
                            <td>${data.name}</td>
                            <td>${data.gender}</td>
                            <td>${data.email}</td>
                            <!--<td>${data.location}</td>-->
                            <td>${data.contact}</td>
                            <td>${data.dept}</td>
                           <!-- <td><a href="${data.location}"><img src="${data.image}" ></td>-->
                                    <td>
                                        <!--<a href="editpatientform.jsp?id=${data.sno}">
                                            <img title="EDIT Patient" src="images/edit.png"/>
                                        </a> 
                                        | --><a onclick="return deleteConfirmation()" href="deleteDoctor.jsp?id=${data.id}&name=${data.name}">
                                            <img title="DELETE Patient" src="images/delete.png"/>
                                        </a>
                                    </td>
                        </tr>
                    </c:if> 
                </c:forEach>     
            </table> 
                                                                     </div>
                                                            <!-- Content Box -->

                                                            <div class="homecontent">
                                                                <ul>
                                                                    <li>
                                                                        <!--<p class="imgholder"><img src="images/demo/health3.jpg" alt=""  height="100" width="280"/></p>
                                                                        <h2>Equipped with Modern Techniques</h2>
                                                                        <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>
                                                                        <p class="readmore"><a href="#">Read More &raquo;</a></p>-->
                                                                    </li>
                                                                    <li class="last">
                                                                        <!--<p class="imgholder"><img src="images/demo/health2.jpg" alt=""  height="100" width="280"/></p>
                                                                        <h2>Health Awareness and Vaccination Camp</h2>
                                                                        <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>
                                                                        <p class="readmore"><a href="#">Read More &raquo;</a></p>-->
                                                                    </li>
                                                                </ul>
                                                             <!--   <div class="clear"></div>-->
                                                            </div>
                                                            <!-- Content Box -->
                                                            <!-- <div class="homecontent">
                                                               <ul>
                                                                 <li>
                                                                   <h2 class="title"><img src="images/demo/64x64.gif" alt="" />Nullamlacus dui ipsum conseque loborttis</h2>
                                                                   <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>
                                                                   <p class="readmore2"><a href="#">Read More &raquo;</a></p>
                                                                 </li>
                                                                 <li class="last">
                                                                   <h2 class="title"><img src="images/demo/64x64.gif" alt="" />Nullamlacus dui ipsum conseque loborttis</h2>
                                                                   <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. Urnaultrices quis curabitur phasellentesque congue magnis vestibulum quismodo nulla et feugiat. Adipisciniapellentum leo ut consequam ris felit elit id nibh sociis malesuada.</p>
                                                                   <p class="readmore2"><a href="#">Read More &raquo;</a></p>
                                                                 </li>
                                                               </ul>
                                                               <div class="clear"></div>
                                                             </div>-->
                                                            <!-- /Box -->
                                                            <!--<h2>About This Free CSS Template</h2>
                                                            <p>This is a W3C standards compliant free website template from <a href="http://www.os-templates.com/">OS Templates</a>.</p>
                                                            <p>This template is distributed using a <a href="http://www.os-templates.com/template-terms">Website Template Licence</a>, which allows you to use and modify the template for both personal and commercial use when you keep the provided credit links in the footer.</p>
                                                            <p>For more CSS templates visit <a href="http://www.os-templates.com/">Free Website Templates</a>.</p>-->
                                                            </div>
                                                            <div id="rightblock">
                                                                <div id="navi">
                                                                    <ul>
                                                                        <li><a class="active" href="#">Welcome ${sessionScope.name}</a></li>
                                                                        <!--<li><a class="active" href="#">Last Login  <%=session.getAttribute("date")%></a></li>-->	
                                                                        <li><a class="active" href="index.html">HealthCare</a></li>
                                                                        <li><a href="doctorAdmin1.jsp">Doctor List</a></li>
                                                                        <li><a href="SearchDoctorList.jsp">Search Doctor </a></li>
                                                                        <!--<li><a href="uploadNotice1.jsp">Upload A Notice</a></li>-->
                                                                        <li><a href="changePassword.jsp">Change Password</a></li>
                                                                        <li><a href="logout">Log Out</a></li>
                                                                        <!--<li><a href="#">Know Our Doctors</a></li>-->
                                                                    </ul>
                                                                </div>
                                                                <!--<div class="holder">
                                                                  <h2>Daily HealthCare Tips </h2>
                                                                  <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna. </p>
                                                                  <div class="readmore"><a href="#">Read More &raquo;</a></div>
                                                                </div>-->
                                                                <!--<div class="holder"><img src="images/demo/health4.jpg" alt="" width="230" height="100" />
                                                                  <p>Nullamlacus dui ipsum conseque loborttis non euisque morbi penas dapibulum orna.</p>
                                                                  <div class="readmore"><a href="#">Read More &raquo;</a></div>
                                                                </div>-->
                                                                <!--<div class="holder">
                                                                  <h2>Lorem ipsum dolor</h2>
                                                                  <p>Nuncsed sed conseque a at quismodo tris mauristibus sed habiturpiscinia sed.</p>
                                                                  <ul>
                                                                    <li><a href="#">Lorem ipsum dolor sit</a></li>
                                                                    <li>Etiam vel sapien et</li>
                                                                    <li><a href="#">Etiam vel sapien et</a></li>
                                                                  </ul>
                                                                  <p>Nuncsed sed conseque a at quismodo tris mauristibus sed habiturpiscinia sed. Condimentumsantincidunt dui mattis magna intesque purus orci augue lor nibh.</p>
                                                                  <div class="readmore"><a href="#">Read More &raquo;</a></div>
                                                                </div>-->
                                                            </div>
                                                          <!--  <div class="clear"></div>-->
                                                            </div>
                                                            <!--<div id="footer">
                                                                <div id="contactform">
                                                                    <h2>We Will Call You !</h2>
                                                                    <form action="#" method="post">
                                                                        <fieldset>
                                                                            <legend>Contact Form</legend>
                                                                            <label for="fullname">Name:
                                                                                <input id="fullname" name="fullname" type="text" value="" />
                                                                            </label>
                                                                            <label for="emailaddress" class="margin">Email:
                                                                                <input id="emailaddress" name="emailaddress" type="text" value="" />
                                                                            </label>
                                                                            <label for="phone">Telephone:
                                                                                <input id="phone" name="phone" type="text" value="" />
                                                                            </label>
                                                                            <label for="subject" class="margin">Subject:
                                                                                <input id="subject" name="subject" type="text" value="" />
                                                                            </label>
                                                                            <label for="message">Message:<br />
                                                                                <textarea id="message" name="message" cols="40" rows="4"></textarea>
                                                                            </label>
                                                                            <p>
                                                                                <input id="submitform" name="submitform" type="submit" value="Submit" />
                                                                                &nbsp;
                                                                                <input id="resetform" name="resetform" type="reset" value="Reset" />
                                                                            </p>
                                                                        </fieldset>
                                                                    </form>
                                                                </div>-->
                                                                <!-- End Contact Form -->
                                                                <!--<div id="compdetails">
                                                                    <div id="officialdetails">
                                                                        <h2>Company Information !</h2>
                                                                        <ul>
                                                                            <li>E HealthCare Services Ltd</li>
                                                                            <li>Registered in India &amp; Delhi</li>
                                                                            <li>Company No. 201002</li>
                                                                            <li class="last">VAT No. 565656</li>
                                                                        </ul>
                                                                    </div>
                                                                    <div id="contactdetails">
                                                                        <h2>Our Contact Details !</h2>
                                                                        <ul>
                                                                            <li>E HealthCare Services Ltd</li>
                                                                            <li>Vasant Kunj ,C-29 ,Delhi ,India</li>
                                                                            <li>Delhi</li>
                                                                            <li>147004/Zip</li>
                                                                            <li>Tel: 0120-4160865</li>
                                                                            <li>Fax: 022 4546486252</li>
                                                                            <li>Email: nmngarg174@gmail.com</li>
                                                                            <li class="last">Facebook : <a href="#">Company Profile</a></li>
                                                                        </ul>
                                                                    </div>
                                                                    <div class="clear"></div>
                                                                </div>-->
                                                                <!-- End Company Details -->
                                                                <!--<div id="copyright">
                                                                    <p class="fl_left">Copyright &copy; 2011 - All Rights Reserved - <a href="#">HealthCare Solutions</a></p>
                                                                    <!--p class="fl_right">Template by <a href="http://www.os-templates.com/" title="Free Website Templates">OS Templates</a></p>-->
                                                                    <br class="clear" />
                                                                </div>
                                                                <div class="clear"></div>
                                                            </div>
                                                            </div>
                                                            </body>
                                                            </html>
<%
}else{
    response.sendRedirect("login.jsp");
}

%>
