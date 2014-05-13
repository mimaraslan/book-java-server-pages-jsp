package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kayitFormunuKontrolEt_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\n");
      out.write("   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      kayitpaketi.GirilenDegerleriKontrolEdenSinif fasulye = null;
      synchronized (_jspx_page_context) {
        fasulye = (kayitpaketi.GirilenDegerleriKontrolEdenSinif) _jspx_page_context.getAttribute("fasulye", PageContext.PAGE_SCOPE);
        if (fasulye == null){
          fasulye = new kayitpaketi.GirilenDegerleriKontrolEdenSinif();
          _jspx_page_context.setAttribute("fasulye", fasulye, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("fasulye"), "kullaniciadimiz", request.getParameter("kullaniciadimiz"), request, "kullaniciadimiz", false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("fasulye"), "parolamiz", request.getParameter("parolamiz"), request, "parolamiz", false);
      out.write('\n');
      out.write('\n');

kayitpaketi.GirilenDegerleriKontrolEdenSinif denetlemeNesnesi=(kayitpaketi.GirilenDegerleriKontrolEdenSinif)pageContext.getAttribute("fasulye");

denetlemeNesnesi.hatalariKontrolEdenFonksiyon(request);

String hatalar= (String)request.getAttribute("hatalar");

if(hatalar !=null &&  hatalar.trim().length() >0){

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("kayitFormu.jsp");
        return;
      }
      out.write('\n');

}

      out.write("\n");
      out.write("\n");
      out.write("<h3><font face=verdana color=green>Girilen degerler gecerlidir.</font></h3>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"1\" width=\"20%\" >\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td width=\"30%\" >Adı</td>\n");
      out.write("  <td width=\"70%\"><strong>");
      out.print(denetlemeNesnesi.getkullaniciadimiz() );
      out.write("</strong></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("  <td >Parola</td>\n");
      out.write("  <td><strong>");
      out.print(denetlemeNesnesi.getparolamiz() );
      out.write("</strong></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<h3><font face=verdana color=darkblue>Beans(Fasulyeler)ini Alan Form</font></h3>\n");
      out.write("  <a href=\"kayitFormu.jsp\">Kayıt Formuna Dönmek için Tıklayınız.</a>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
