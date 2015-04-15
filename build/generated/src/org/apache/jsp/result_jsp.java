package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class result_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("   \n");
      out.write("    <title>购物功能实例</title>\n");
      out.write("   \n");
      out.write(" <meta http-equiv=\"pragma\" content=\"no-cache\">\n");
      out.write(" <meta http-equiv=\"cache-control\" content=\"no-cache\">\n");
      out.write(" <meta http-equiv=\"expires\" content=\"0\">   \n");
      out.write(" <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\n");
      out.write(" <meta http-equiv=\"description\" content=\"This is my page\">\n");
      out.write(" <!--\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\n");
      out.write(" -->\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write(" \n");
      out.write("  <body>\n");
      out.write("    ");
      out.print(session.getAttribute("sessionname") );
      out.write(",欢迎您的光临！\n");
      out.write("    <center>\n");
      out.write("    ");

      request.setCharacterEncoding("UTF-8");
      String drink = request.getParameter("drink");
      String ping = request.getParameter("ping"); 
     
      out.write("\n");
      out.write("     您购买的物品有：\n");
      out.write("     <h3>\n");
      out.write("     ");
      out.print(session.getAttribute("sessionfruit"));
      out.write(",\n");
      out.write("     ");
      out.print(session.getAttribute("sessionnum"));
      out.write("斤\n");
      out.write("      <br>\n");
      out.write("      ");
      out.print(drink );
      out.write(",\n");
      out.write("      ");
      out.print(ping );
      out.write("瓶\n");
      out.write("      </h3>\n");
      out.write("    </center>\n");
      out.write("  </body>\n");
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
