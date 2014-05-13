package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bilgiFormu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("        <title>Bilgi Formu</title>\n");
      out.write("    </head>\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h3><font face=verdana color=green><p align=\"left\"><b>Bilgi Formu</b></p></font></h3>\n");
      out.write("\n");
      out.write("<form name=\"bilgiFormu\" method=\"post\" action=\"bilgiFormunuKontrolEt.jsp\">\n");
      out.write("\n");
      out.write("<table border=\"5\" id=\"bilgiTablosu\" >\n");

    String eksikAlanlariAlGoster=(String)request.getAttribute("eksikAlanlar");

    if(eksikAlanlariAlGoster != null && eksikAlanlariAlGoster.trim().length()>0){
           out.println("<tr><td colspan='2'>" +
                       "<h3><font face=verdana color=red>"+eksikAlanlariAlGoster+"</font></h3></td></tr>");

    }

      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"30%\">Adı</td>\n");
      out.write("<td><input type=\"text\"   name=\"adi\" size=\"20\" value=\"");
      out.print(request.getParameter("adi")!=null?request.getParameter("adi"):"  ");
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"30%\">Parola</td>\n");
      out.write("<td><input type=\"password\" name=\"parola\" size=\"20\" value=\"");
      out.print(request.getParameter("parola")!=null?request.getParameter("parola"):"");
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"30%\">Adres</td>\n");
      out.write("<td><textarea name=\"adres\" cols=\"15\" rows=\"3\">");
      out.print(request.getParameter("adres")!=null?request.getParameter("adres"):"");
      out.write("</textarea></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"30%\">Telefon</td>\n");
      out.write("<td><input type=\"text\" name=\"telefon\" size=\"20\" value=\"");
      out.print(request.getParameter("telefon")!=null?request.getParameter("telefon"):"");
      out.write("\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"30%\" >Ülke</td>\n");
      out.write("<td><select size=\"1\"  name=\"ulke\">\n");
      out.write(" <option selected value=\"");
      out.print(request.getParameter("ulke")!=null?request.getParameter("ulke"):"");
      out.write('"');
      out.write('>');
      out.print(request.getParameter("ulke")!=null?request.getParameter("ulke"):"");
      out.write("</option>\n");
      out.write("\n");
      out.write("<option style=\"background-color: aqua\" value=\"Turkiye\">Türkiye</option>\n");
      out.write("<option style=\"background-color: yellow\"value=\"Ukrayna\">Ukrayna</option>\n");
      out.write("<option style=\"background-color: red\"value=\"Rusya\">Rusya</option>\n");
      out.write("<option style=\"background-color: orange\"value=\"Ingiltere\">İngiltere</option>\n");
      out.write("<option value=\"Diger\">Diğer</option>\n");
      out.write("\n");
      out.write("</select></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td width=\"30%\">Şehir</td>\n");
      out.write("\n");
      out.write("<td><input type=\"text\" name=\"sehir\" size=\"20\" value=\"");
      out.print(request.getParameter("sehir")!=null?request.getParameter("sehir"):"");
      out.write("\"></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p><input type=\"submit\" value=\"Gönder\" name=\"Gönder\">\n");
      out.write("    <input type=\"reset\" value=\"Temizle\" name=\"Temizle\"></p>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
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
