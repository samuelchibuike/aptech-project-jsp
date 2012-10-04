package org.apache.jsp.Administrator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Form</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/Css/Login.css\"/>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function checkData(){\n");
      out.write("                //alert(\"fuck\");\n");
      out.write("                //return window.location = \"AdminForm.jsp\";                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        <h1>Chạy Dân Đi Em</h1> \n");
      out.write("        <div id=\"container_header\">\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"header_icon\">\n");
      out.write("                    <img src=\"../resources/Images/admin_icon.jpg\" alt=\"\" />\n");
      out.write("                </div> <!-- end header_icon-->                \n");
      out.write("                <div id=\"header_text\">\n");
      out.write("                    Manager System\n");
      out.write("                </div> <!-- end header_text-->                \n");
      out.write("            </div> <!-- end header-->           \n");
      out.write("        </div> <!-- end container_header-->     \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        <div id=\"container_main\">\n");
      out.write("            <div id=\"main\">\n");
      out.write("                <div id=\"icon_left\">\n");
      out.write("                    <img src=\"../resources/Images/login_icon.jpg\" width=\"100%\" height=\"100%\" alt=\"\" />\n");
      out.write("                </div> <!-- end icon_left-->\n");
      out.write("                <div id=\"right_login_form\">        \n");
      out.write("                    <div style=\"margin-top:95px;margin-left:20px;\">                        \n");
      out.write("                        <form action=\"\">                            \n");
      out.write("                            <table width=\"100%\" align=\"center\" border=\"0\" cellpadding=\"5\" cellspacing=\"5\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td width=\"100px\" align=\"right\"><div id=\"font1\">User Name</div></td>\n");
      out.write("                                    <td width=\"100px\"><input type=\"text\" id=\"tbx_uName\" class=\"tbx_uName\" /></td>\n");
      out.write("                                    <td>                                           </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td align=\"right\"><div id=\"font1\">Password</div></td>\n");
      out.write("                                    <td><input type=\"text\" id=\"tbx_uPass\" class=\"tbx_uPass\" /></asp:TextBox></td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                </tr>                             \n");
      out.write("                                <tr> \n");
      out.write("                                    <td></td>                                \n");
      out.write("                                    <td align=\"right\"><input type=\"checkbox\" id=\"cbx_save\" class=\"cbx_save\" /> </td>\n");
      out.write("                                    <td></td>\n");
      out.write("                                </tr>                               \n");
      out.write("                                <tr>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td colspan=\"2\">\n");
      out.write("                                        <input type=\"submit\" value=\"Login\" onclick=\"return checkData();\" />                                      \n");
      out.write("                                        <input type=\"reset\" value=\"Cancel\" />\n");
      out.write("                                    </td>                             \n");
      out.write("                                </tr>\n");
      out.write("                            </table>  \n");
      out.write("                        </form>      \n");
      out.write("                    </div>                                           \n");
      out.write("                </div> <!-- end right_login_form-->\n");
      out.write("            </div> <!-- end main-->               \n");
      out.write("        </div> <!-- end container_main-->\n");
      out.write("\n");
      out.write("         <div id=\"container_footer\">\n");
      out.write("         </div> <!-- end container_footer-->\n");
      out.write("        \n");
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
