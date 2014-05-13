package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;

public final class fasulyeFormu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Beans(Fasulyeler) ve Form İşlemi</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("  <h1>Beans(Fasulyeler) ve Form İşlemi </h1>\n");
      out.write("\n");
      out.write("<form name=\"fasulyeFormu\" method=\"POST\" action=\"fasulyeFormunuAlanForm.jsp\">\n");
      out.write("\n");
      out.write("<table border=\"1\" width=\"41%\" cellspacing=\"1\" cellpadding=\"0\" id=\"fasulyetablosu\">\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"33%\">Adı</td>\n");
      out.write("<td width=\"67%\"><input type=\"text\" name=\"adi\" size=\"30\" id=\"adi\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"33%\">Soyadı</td>\n");
      out.write("<td><input type=\"text\" name=\"soyadi\" size=\"30\" id=\"soyadi\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"33%\">Telefonu</td>\n");
      out.write("<td><input type=\"text\" name=\"telefon\" size=\"30\" id=\"telefon\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"33%\">Cinsiyeti</td>\n");
      out.write("<td><input name=\"cinsiyet\" type=\"radio\" value=\"Bayan\" >Bayan\n");
      out.write("    <input name=\"cinsiyet\" type=\"radio\" value=\"Erkek\" checked>Erkek\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"33%\">Adres</td>\n");
      out.write("<td><textarea name=\"adres\" cols=\"20\" rows=\"2\" id=\"adres\"></textarea></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("  <td width=\"33%\">Ülke</td>\n");
      out.write("  <td><select name=\"ulke\" size=\"1\" id=\"ulke\">\n");
      out.write("    <option value=\"\" selected>Lütfen ülkenizi seçiniz.</option>\n");
      out.write("    <option value=\"Turkiye\">Türkiye </option>\n");
      out.write("    <option value=\"Ukrayna\">Ukrayna</option>\n");
      out.write("    <option value=\"Norvec\">Norveç</option>\n");
      out.write("    <option value=\"Kanada\">Kanada</option>\n");
      out.write("    <option value=\"Rusya\">Rusya</option>\n");
      out.write("  </select></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("  <td>Meslek</td>\n");
      out.write("  <td><select name=\"meslek\" size=\"1\" id=\"meslek\">\n");
      out.write("    <option value=\"\" selected>Lütfen mesleğinizi seçiniz.</option>\n");
      out.write("    <option value=\"Bilgisayar Muhendisi\">Bilgisayar Mühendisi</option>\n");
      out.write("    <option value=\"Hakim\">Hakim</option>\n");
      out.write("    <option value=\"Ogretmen\">Öğretmen</option>\n");
      out.write("    <option value=\"Doktor\">Doktor</option>\n");
      out.write("    <option value=\"Hemsire\">Hemşire</option>\n");
      out.write("    <option value=\"Ekomomist\">Ekomomist</option>\n");
      out.write("</select></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("  <td>Tecrübe Yılı</td>\n");
      out.write("  <td><select name=\"tecrube\" size=\"1\" id=\"tecrube\">\n");
      out.write("    <option value=\"\">Lütfen tecrübe yılızı seçiniz.</option>\n");
      out.write("    <option value=\"0  -  2  YIL\">0  -  2  YIL</option>\n");
      out.write("    <option value=\"2  -  5  YIL\">2  -  5  YIL</option>\n");
      out.write("    <option value=\"5  -  7  YIL\">5  -  7  YIL</option>\n");
      out.write("    <option value=\"7  -  9  YIL\">7  -  9  YIL</option>\n");
      out.write("    <option value=\"9  -  11 YIL\">9  -  11 YIL</option>\n");
      out.write("    <option value=\"11 -  ...\">11 -  ...</option>\n");
      out.write("  </select></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"33%\">Yaşı</td>\n");
      out.write("<td><input type=\"text\" name=\"yasi\" size=\"30\" id=\"yasi\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p><input type=\"submit\" value=\"Değerleri Gönder\" name=\"GonderDugmesi\">\n");
      out.write("    <input type=\"reset\" value=\"Sıfırla\" name=\"SifirlaDugmesi\"></p>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("    </body>\n");
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
