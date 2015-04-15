package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS/Register.css\" />\n");
      out.write("        <title>Register</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery.idTabs.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"jquery-1.11.1.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <a href=\"index.jsp\" alt=\"Home page\"><img alt=\"X-Learning\" src=\"icon/xl-13.png\" height=\"80%\" style=\"margin-top: 0.4em; margin-left:44%;\" /></a>\n");
      out.write("        </div>\n");
      out.write("        <main>\n");
      out.write("            <form action=\"Register\" method=\"post\" accept-charset=\"UTF-8\" target=\"_parent\">\n");
      out.write("                <nav class=\"navigate-bar\">\t\n");
      out.write("                </nav>\n");
      out.write("                <div id=\"page1\" style=\"visibility:true; display:inline\">\n");
      out.write("                    <div class=\"contain\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"box\" id=\"left\">\n");
      out.write("                                <p>USERNAME</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"box\" id=\"right\">\n");
      out.write("                                <input type=\"text\" name=\"user_name\" id=\"user_name\" placeholder=\"    Username\" size=\"35\"\n");
      out.write("                                       maxlength=\"40\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n");
      out.write("                                <label for=\"user_name\"></label>     \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"box\" id=\"left\">\n");
      out.write("                                <p>GENDER</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"box\" id=\"right\">\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"male\" value=\"male\" />\n");
      out.write("                                <label for=\"male\"><img src=\"icon/boy_icon.png\" alt=\"Male\" width=\"40\" height=\"40\" /></label>\n");
      out.write("                                <input type=\"radio\" name=\"gender\" id=\"male\" value=\"female\" />\n");
      out.write("                                <label for=\"female\"><img src=\"icon/girl_icon.png\" alt=\"Female\" width=\"50\" height=\"40\" /></label>      \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"box\" id=\"left\">\n");
      out.write("                                <p>EMAIL</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"box\" id=\"right\">\n");
      out.write("                                <input type=\"email\" name=\"eMail\" id=\"eMail\" placeholder=\"    ****@EMAIL.COM\" size=\"35\"\n");
      out.write("                                       maxlength=\"40\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n");
      out.write("                                <label for=\"eMail\"></label>     \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"box\" id=\"left\">\n");
      out.write("                                <p>PASSWORD</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"box\" id=\"right\">\n");
      out.write("                                <input type=\"password\" name=\"password\" id=\"password\" placeholder=\"    8 characters\" size=\"35\"\n");
      out.write("                                       maxlength=\"8\" style=\"height:2em; font-family:'Courier New', Courier, monospace; font-size:0.7em\" autofocus=\"autofocus\" />\n");
      out.write("                                <label for=\"password\"></label>     \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"nextbutton\">\n");
      out.write("                            <input type=\"image\" src=\"icon/button_signup.png\" width=\"110\" alt=\"SignUp\"/>\n");
      out.write("                            <p class=\"small\">Already have an <b><a href=\"Signin.html\">Account</a></b>.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>    \n");
      out.write("                </div>\n");
      out.write("            </form>\t\n");
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
