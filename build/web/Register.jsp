<%-- 
    Document   : Register1
    Created on : Nov 29, 2014, 10:35:50 PM
    Author     : SONGSONG
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link rel="stylesheet" type="text/css" href="CSS/Register.css" />
        <title>Register</title>
        <script type="text/javascript" src="jquery.idTabs.min.js"></script>
        <script type="text/javascript" src="jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <div class="header">
            <a href="index.jsp" alt="Home page"><img alt="X-Learning" src="icon/xl-13.png" height="80%" style="margin-top: 0.4em; margin-left:44%;" /></a>
        </div>
        <main>
            <form action="Register" method="post" accept-charset="UTF-8" target="_parent">
                <nav class="navigate-bar">	
                </nav>
                <div id="page1" style="visibility:true; display:inline">
                    <div class="contain">
                        <div class="row">
                            <div class="box" id="left">
                                <p>USERNAME</p>
                            </div>
                            <div class="box" id="right">
                                <input type="text" name="user_name" id="user_name" placeholder="    Username" size="35"
                                       maxlength="40" style="height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em" autofocus="autofocus" />
                                <label for="user_name"></label>     
                            </div>
                        </div>
                        <div class="row">
                            <div class="box" id="left">
                                <p>GENDER</p>
                            </div>
                            <div class="box" id="right">
                                <input type="radio" name="gender" id="male" value="male" />
                                <label for="male"><img src="icon/boy_icon.png" alt="Male" width="40" height="40" /></label>
                                <input type="radio" name="gender" id="male" value="female" />
                                <label for="female"><img src="icon/girl_icon.png" alt="Female" width="50" height="40" /></label>      
                            </div>
                        </div>
                        <div class="row">
                            <div class="box" id="left">
                                <p>EMAIL</p>
                            </div>
                            <div class="box" id="right">
                                <input type="email" name="eMail" id="eMail" placeholder="    ****@EMAIL.COM" size="35"
                                       maxlength="40" style="height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em" autofocus="autofocus" />
                                <label for="eMail"></label>     
                            </div>
                        </div>
                        <div class="row">
                            <div class="box" id="left">
                                <p>PASSWORD</p>
                            </div>
                            <div class="box" id="right">
                                <input type="password" name="password" id="password" placeholder="    8 characters" size="35"
                                       maxlength="8" style="height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em" autofocus="autofocus" />
                                <label for="password"></label>     
                            </div>
                        </div>
                        <div class="nextbutton">
                            <input type="image" src="icon/button_signup.png" width="110" alt="SignUp"/>
                            <p class="small">Already have an <b><a href="Signin.html">Account</a></b>.</p>
                        </div>
                    </div>    
                </div>
            </form>
        </main>
    </body>
</html>
