package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formdakiDegerler_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Form Kullanımı</title>\n");
      out.write("    </head>\n");
      out.write("   <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<p align=\"left\"><b>JSP Sayfamızda Form Kullanımı Örnek Form\n");
      out.write("\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write("\n");
      out.write("</b></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<form method=\"Post\" action=\"formdakiDegerleriKontrolEt.jsp\" name=\"bilgiFormu\" accept-charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("<table width=\"345\" border=\"2\" cellpadding=\"0\" cellspacing=\"1\" id=\"ornekTablomuz\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"98\"><strong>Adı</strong></td>\n");
      out.write("<td width=\"254\"><input type=\"text\" name=\"adi\" size=\"40\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><strong>Soyadı</strong></td>\n");
      out.write("<td><input type=\"text\" name=\"soyadi\" size=\"40\" /></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><strong>Parola</strong></td>\n");
      out.write("<td><input type=\"password\" name=\"parola\" size=\"40\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><strong>Cümle</strong></td>\n");
      out.write("<td><textarea name=\"cumle\" id=\"cumle\" cols=\"30\" rows=\"3\"></textarea></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p><input type=\"submit\" value=\"Değerleri Gönder\" name=\"GonderDugmesi\">\n");
      out.write("   <input type=\"reset\" value=\"Formu Temizle\" name=\"YenilemeDugmesi\"></p>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
