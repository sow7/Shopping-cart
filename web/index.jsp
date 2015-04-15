<%-- 
    Document   : index
    Created on : Nov 28, 2014, 10:12:54 PM
    Author     : SONGSONG
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="bean.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <link href="CSS/Index_bn.css" rel="stylesheet" type="text/css" />
        <title>Index</title>
        <script src='js/cart.js'></script>
        <script src='js/items.js'></script>
    </head>
    <body onload="show_cart()">
        <main>
            <div class="header">
                <div class="logo">
                    <a href="index.jsp" alt="Home page"><img alt="Shopping-Cart" src="icon/xl-13.png" height="80%" style="margin-top: 0.4em;" /></a>
                </div>
                <div class="welcome">
                    <div id="personal">
                        <%
                            User current = (User) request.getSession().getAttribute("user");
                            if (current == null) {
                        %>      <h5><a href="Signin.html" alt="Personal page">
                                SIGN IN  /</a>
                            <a href="Register.jsp" alt="Personal page">
                                SIGN UP</a></h5>
                                <% } else {
                                    if (current.getGender().equals("male")) {%>
                        <a href="Shophistory.jsp" alt="Shophistory">
                            <img src="icon/boy_icon.png" width="50" height="50" alt=""/> </a>
                        <div class="signout">   
                            <form action="Signout" method="post" name="signout" id="form1">
                                <input type="image" src="icon/button_signout.png" width="80" height="16" alt="SIGN OUT" />   
                            </form></div>
                            <%} else {%>
                        <a href="Shophistory.jsp" alt="Shophistory">
                            <img src="icon/girl_icon.png" width="60" height="50" alt=""/> </a>
                        <div class="signout">   
                            <form action="Signout" method="post" name="signout" id="form1">
                                <input type="image" src="icon/button_signout.png" width="80" height="16" alt="SIGN OUT" />   
                            </form></div>
                            <%}
                                }%>
                    </div>
                </div>
            </div>
            <div class="contain">
                <div class='col-left'> 
                    <ul id="miSider">
                        <li class="item" >
                            <a data-toggle="collapse" data-parent="#miSider"><b>Order Detail: </b></a>
                        </li>
                    </ul>
                    <ul id="product-lists"></ul>
                    <ul id="miSider">
                        <li class="item">
                            <a>Total Amount:$<span id="totalMoney">0</span></a>
                        </li>
                    </ul>
                    <ul id="miSider">
                        <li class="panel">	
                            <a data-toggle="collapse" data-parent="#miSider" onclick="checkout()"><b>Check out</b></a>
                        </li>
                    </ul>            
                </div>
                <div class='col-remaining' id="pro-item-container">
                    <div class="product-list">
                        <%
                            try {
                                Class.forName("org.apache.derby.jdbc.ClientDriver");
                                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Shoppingcart", "wss", "wss");
                                Statement st = conn.createStatement();
                                String q1 = new String("SELECT * from PRODUCTS");
                                ResultSet rs = st.executeQuery(q1);
                                while (rs.next()) {
                                    out.print("<dl class=\"list-item\">\n"
                                            + "<dt>\n"
                                            + "<a onclick=\"addToCart(" + rs.getInt("product_id") + ")\">\n"
                                            + "<img class=\"main-img\" src=\"" + rs.getString("img") + "\" width=\"260\" height=\"260\"></img>\n"
                                            + "</a>\n"
                                            + "</dt>\n"
                                            + "<dd class=\"product-name\" style=\"height: 20px;overflow: hidden;width: 60%\">\n"
                                            + "<a>" + rs.getString("product_name") + "</a>\n"
                                            + "</dd>\n"
                                            + "<dd class=\"product-price\">\n"
                                            + "<span>$" + rs.getString("price") + "</span>\n"
                                            + "</dd>\n"
                                            + "</dl>");
                                }
                                rs.close();
                                st.close();
                                conn.close();
                            } catch (Exception e) {
                                System.out.println(e.toString());
                            }
                        %>
                    </div>
                </div>
            </div>
        </main>
    </body>
</html>
