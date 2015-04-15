/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import bean.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SONGSONG
 */
@WebServlet(name = "Signin", urlPatterns = {"/Signin"})
public class Signin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     */
    @SuppressWarnings("empty-statement")
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, InstantiationException, IllegalAccessException {
        response.setContentType("text/html;charset=UTF-8");
        String eMail = request.getParameter("eMail");
        String password = request.getParameter("password");
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
            try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Shoppingcart", "wss", "wss")) {
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("SELECT PASSWORD,USER_NAME,GENDER FROM USER_INFO WHERE EMAIL='" + eMail + "'");
                if (rs.next()) {
                    if (rs.getString(1).equals(password)) {
                        User u = new User(rs.getString(2), eMail, rs.getString(3));
                        request.getSession().setAttribute("user", u);
                        RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
                        rd.forward(request, response);
                    } else {
                        PrintWriter pw = response.getWriter();
                        pw.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                                + "<head>\n"
                                + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"
                                + "<link href=\"CSS/Signin.css\" rel=\"stylesheet\" type=\"text/css\" />\n"
                                + "<title>Login</title>\n"
                                + "<script language=\"javascript\">\n"
                                + "function doCheck(){\n"
                                + "    if(document.form1.eMail.value===\"\"){\n"
                                + "        alert('Please input your e-Mail！');\n"
                                + "        return false;\n"
                                + "    }\n"
                                + "    if(document.form1.password.value===\"\"){\n"
                                + "        alert('Please input your password');\n"
                                + "        return false;\n"
                                + "    }\n"
                                + "    return falese;\n"
                                + "}\n"
                                + "</script>\n"
                                + "</head>\n"
                                + "\n"
                                + "<body><script language='javascript'>alert('Your password is wrong')</script>\n"
                                + "<div class=\"header\">\n"
                                + "	<div class=\"logo\">\n"
                                + "		<a href=\"index.jsp\" alt=\"Home page\"><img alt=\"X-Learning\" src=\"icon/xl-13.png\" height=\"80%\" style=\"margin-top: 0.4em;\" /></a>\n"
                                + "    </div>\n"
                                + "</div>\n"
                                + "<main>\n"
                                + "<div class=\"contain\">\n"
                                + "<form action=\"Signin\" method=\"post\" name=\"signin\" id=\"form1\" onSubmit=\"return doCheck();\">\n"
                                + "<div class=\"row\">\n"
                                + "    <div class=\"box\" id=\"left\">\n"
                                + "    <p>EMAIL</p>\n"
                                + "    </div>\n"
                                + "    <div class=\"box\" id=\"right\">\n"
                                + "        <input type=\"email\" name=\"eMail\" id=\"eMail\" placeholder=\"   ****@EMAIL.COM\" size=\"35\"\n"
                                + "            maxlength=\"40\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n"
                                + "        <label for=\"eMail\"></label>       \n"
                                + "    </div>\n"
                                + "</div>\n"
                                + "<div class=\"row\">\n"
                                + "    <div class=\"box\" id=\"left\">\n"
                                + "    <p>PASSWORD</p>\n"
                                + "    </div>\n"
                                + "    <div class=\"box\" id=\"right\">\n"
                                + "    	<input type=\"password\" name=\"password\" id=\"password\" placeholder=\"   8 characters\" size=\"35\"\n"
                                + "                maxlength=\"8\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n"
                                + "        <label for=\"password\"></label>     \n"
                                + "    </div>\n"
                                + "</div>\n"
                                + "<div class=\"submitbn\">\n"
                                + "    	<input name=\"singin\" type=\"image\" id=\"singin\" src=\"icon/button_signin.png\" width=\"110px\" onClick=\"return doCheck();\"/>\n"
                                + "        	\n"
                                + "</div>\n"
                                + "</form>\n"
                                + "<p class=\"small\">Haven't  <b><a href=\"Register.jsp\">Registered</a></b> ?</p>\n"
                                + "</div>\n"
                                + "</main>\n"
                                + "</body>\n"
                                + "</html>\n"
                                + "");
                        pw.close();
                    }
                } else {
                    PrintWriter pw = response.getWriter();
                    pw.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                            + "<head>\n"
                            + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"
                            + "<link href=\"CSS/Signin.css\" rel=\"stylesheet\" type=\"text/css\" />\n"
                            + "<title>Login</title>\n"
                            + "<script language=\"javascript\">\n"
                            + "function doCheck(){\n"
                            + "    if(document.form1.eMail.value===\"\"){\n"
                            + "        alert('Please input your e-Mail！');\n"
                            + "        return false;\n"
                            + "    }\n"
                            + "    if(document.form1.password.value===\"\"){\n"
                            + "        alert('Please input your password');\n"
                            + "        return false;\n"
                            + "    }\n"
                            + "    return falese;\n"
                            + "}\n"
                            + "</script>\n"
                            + "</head>\n"
                            + "\n"
                            + "<body><script language='javascript'>alert('Your e-mail is not registered')</script>\n"
                            + "<div class=\"header\">\n"
                            + "	<div class=\"logo\">\n"
                            + "		<a href=\"index.jsp\" alt=\"Home page\"><img alt=\"X-Learning\" src=\"icon/xl-13.png\" height=\"80%\" style=\"margin-top: 0.4em;\" /></a>\n"
                            + "    </div>\n"
                            + "</div>\n"
                            + "<main>\n"
                            + "<div class=\"contain\">\n"
                            + "<form action=\"Signin\" method=\"post\" name=\"signin\" id=\"form1\" onSubmit=\"return doCheck();\">\n"
                            + "<div class=\"row\">\n"
                            + "    <div class=\"box\" id=\"left\">\n"
                            + "    <p>EMAIL</p>\n"
                            + "    </div>\n"
                            + "    <div class=\"box\" id=\"right\">\n"
                            + "        <input type=\"email\" name=\"eMail\" id=\"eMail\" placeholder=\"   ****@EMAIL.COM\" size=\"35\"\n"
                            + "            maxlength=\"40\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n"
                            + "        <label for=\"eMail\"></label>       \n"
                            + "    </div>\n"
                            + "</div>\n"
                            + "<div class=\"row\">\n"
                            + "    <div class=\"box\" id=\"left\">\n"
                            + "    <p>PASSWORD</p>\n"
                            + "    </div>\n"
                            + "    <div class=\"box\" id=\"right\">\n"
                            + "    	<input type=\"password\" name=\"password\" id=\"password\" placeholder=\"   8 characters\" size=\"35\"\n"
                            + "                maxlength=\"8\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n"
                            + "        <label for=\"password\"></label>     \n"
                            + "    </div>\n"
                            + "</div>\n"
                            + "<div class=\"submitbn\">\n"
                            + "    	<input name=\"singin\" type=\"image\" id=\"singin\" src=\"icon/button_signin.png\" width=\"110px\" onClick=\"return doCheck();\"/>\n"
                            + "        	\n"
                            + "</div>\n"
                            + "</form>\n"
                            + "<p class=\"small\">Haven't  <b><a href=\"Register.jsp\">Registered</a></b> ?</p>\n"
                            + "</div>\n"
                            + "</main>\n"
                            + "</body>\n"
                            + "</html>\n"
                            + "");
                    pw.close();
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            //e.printStackTrace();
            System.out.println("connect fail");
        }
    }
    /*  catch (InstantiationException | IllegalAccessException ex) {
     Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
     }*/

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
