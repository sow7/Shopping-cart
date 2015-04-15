package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class fruit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(",欢迎您选购水果！\n");
      out.write("    <center>\n");
      out.write("    <h1>购买水果页面</h1>\n");
      out.write("    <form action=\"session/Cart/drink.jsp\" method=\"post\">\n");
      out.write("    水果：\n");
      out.write("    <select name=\"fruit\">\n");
      out.write("       <option value=\"梨\">梨</option>\n");
      out.write("       <option value=\"苹果\">苹果</option>\n");
      out.write("       <option value=\"香蕉\">香蕉</option>\n");
      out.write("       <option value=\"橘子\">橘子</option>\n");
      out.write("       <option value=\"柚子\">柚子</option>\n");
      out.write("       <option value=\"西红柿\" selected>西红柿</option>\n");
      out.write("    </select><br>\n");
      out.write("    购买斤数：<input type=\"text\" name=\"jin\">斤<br>\n");
      out.write("    <input type=\"submit\" name=\"submit\" value=\"下一页\"><br>\n");
      out.write("    </form>\n");
      out.write("    </center>\n");
      out.write("  </body>\n");
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
