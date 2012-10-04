package org.apache.jsp.UserPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Css/nivo-slider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Css/nivo.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\t\t#wrapper{\n");
      out.write("                    float:left;\n");
      out.write("                    width:400px;\n");
      out.write("\t\t}\n");
      out.write("\t</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">            \n");
      out.write("            <div class=\"slider-wrapper theme-default\">\n");
      out.write("                <div id=\"slider\" class=\"nivoSlider\">\n");
      out.write("                    <img src=\"../Images/mothers-day-cards-banner.jpg\" alt=\"\" />\n");
      out.write("                    <img src=\"../Images/mobile-commerce-banner.jpg\" alt=\"\" />\n");
      out.write("                    <img src=\"../Images/express-mail-frb-banner.jpg\" alt=\"\" />\n");
      out.write("                    <img src=\"../Images/free-package-pickup-banner.jpg\" alt=\"\" />\n");
      out.write("                    <img src=\"../Images/mobile-commerce-banner.jpg\" alt=\"\" />      \n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"../Javascript/jquery-1.7.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../Javascript/jquery.nivo.slider.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        $(window).load(function() {\n");
      out.write("                $('#slider').nivoSlider({\n");
      out.write("                    effect: 'random',\n");
      out.write("                    slices:8,\n");
      out.write("                    animSpeed:900, //Slide transition speed\n");
      out.write("                    pauseTime:2000,\n");
      out.write("                    startSlide:0, //Set starting Slide (0 index)\n");
      out.write("                    directionNav:true\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("       \n");
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
