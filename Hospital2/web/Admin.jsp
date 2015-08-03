<head> 
    <title> 
        Admin's Page
    </title>
    <style>

        body{
            background-image: url("images/");

        }    
        .container {
            margin:60px auto;
            width:940px;
            overflow:hidden;
            font-size:.875em;
            padding-bottom:176px;
        }

        .container a {
            color: #006666;

        }
        .container a:hover {
            color: #088cc4;
        }
        h1,h2 {text-align:center}

        form{
            float:left;
            padding:50px;   
            margin:auto auto 20px auto;
        }
        .buttonHolder{ text-align: left;
                       width:250px;
                       margin:0 auto;
        }
        .buttonHolder1{ text-align: right; }
        
    </style>
    <link rel="stylesheet" href="Site.css"/>
</head>
<body>

    <div class="wrap">
        <header>
            <div class="container">
                <h1><a href="#">Welcome to the Admin Page <br><%=session.getAttribute("name")%>  </a></h1><br><br><br><br>
                        <%--${sessionScope.name}--%>
                <h2><a href="#">Choose the profile to Visit</a></h2>
                <form action='patientAdmin.jsp' method='post'>
                    <div class="buttonHolder">    
                        <input type='submit' class="button red" align="left" value="Patient's Profile"/>
                    </div>
                </form>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <form action='doctorAdmin1.jsp' method='post'>
                    <div class="buttonHolder1">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='submit' class="button blue" align="right" value="Doctor's Profile"/>
                    </div>
                </form>
                <form action='feedbackProfile.jsp' method='post'>
                    <div class="buttonHolder2">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type='submit' class="button blue" align="right" value="Feedback Profile"/>
                    </div>
                </form>
            </div>

        </header>

</body>