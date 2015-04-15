package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import bean.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link href=\"CSS/Index_bn.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Index</title>\n");
      out.write("        <script src='js/cart.js'></script>\n");
      out.write("        <script src='js/items.js'></script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"show_cart()\">\n");
      out.write("        <main>\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"index.jsp\" alt=\"Home page\"><img alt=\"Shopping-Cart\" src=\"icon/xl-13.png\" height=\"80%\" style=\"margin-top: 0.4em;\" /></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"welcome\">\n");
      out.write("                    <div id=\"personal\">\n");
      out.write("                        ");

                            User current = (User) request.getSession().getAttribute("user");
                            if (current == null) {
                        
      out.write("      <h5><a href=\"Signin.html\" alt=\"Personal page\">\n");
      out.write("                                SIGN IN  /</a>\n");
      out.write("                            <a href=\"Register.jsp\" alt=\"Personal page\">\n");
      out.write("                                SIGN UP</a></h5>\n");
      out.write("                                ");
 } else {
                                    if (current.getGender().equals("male")) {
      out.write("\n");
      out.write("                        <a href=\"Shophistory.jsp\" alt=\"Shophistory\">\n");
      out.write("                            <img src=\"icon/boy_icon.png\" width=\"50\" height=\"50\" alt=\"\"/> </a>\n");
      out.write("                        <div class=\"signout\">   \n");
      out.write("                            <form action=\"Signout\" method=\"post\" name=\"signout\" id=\"form1\">\n");
      out.write("                                <input type=\"image\" src=\"icon/button_signout.png\" width=\"80\" height=\"16\" alt=\"SIGN OUT\" />   \n");
      out.write("                            </form></div>\n");
      out.write("                            ");
} else {
      out.write("\n");
      out.write("                        <a href=\"Shophistory.jsp\" alt=\"Shophistory\">\n");
      out.write("                            <img src=\"icon/girl_icon.png\" width=\"60\" height=\"50\" alt=\"\"/> </a>\n");
      out.write("                        <div class=\"signout\">   \n");
      out.write("                            <form action=\"Signout\" method=\"post\" name=\"signout\" id=\"form1\">\n");
      out.write("                                <input type=\"image\" src=\"icon/button_signout.png\" width=\"80\" height=\"16\" alt=\"SIGN OUT\" />   \n");
      out.write("                            </form></div>\n");
      out.write("                            ");
}
                                }
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"contain\">\n");
      out.write("                <div class='col-left'> \n");
      out.write("                    <ul id=\"miSider\">\n");
      out.write("                        <li class=\"item\" >\n");
      out.write("                            <a data-toggle=\"collapse\" data-parent=\"#miSider\"><b>Order Detail: </b></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul id=\"product-lists\"></ul>\n");
      out.write("                    <ul id=\"miSider\">\n");
      out.write("                        <li class=\"item\">\n");
      out.write("                            <a>Total Amount:$<span id=\"totalMoney\">0</span></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul id=\"miSider\">\n");
      out.write("                        <li class=\"panel\">\t\n");
      out.write("                            <a data-toggle=\"collapse\" data-parent=\"#miSider\" onclick=\"checkout()\"><b>Check out</b></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>            \n");
      out.write("                </div>\n");
      out.write("                <div class='col-remaining' id=\"pro-item-container\">\n");
      out.write("                    <div class=\"product-list\">\n");
      out.write("                        ");

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
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
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
}
