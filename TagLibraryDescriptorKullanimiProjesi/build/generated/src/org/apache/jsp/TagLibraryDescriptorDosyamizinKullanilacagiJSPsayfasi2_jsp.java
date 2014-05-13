package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TagLibraryDescriptorDosyamizinKullanilacagiJSPsayfasi2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tlds/TagLibraryDescriptorDosyamiz2.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_onEkimiz2_BosDeger_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_onEkimiz2_BosDeger_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_onEkimiz2_BosDeger_nobody.release();
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Özniteliği olmayan Custom Tag</title>\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"CCFFCC\">\n");
      out.write("   <h1>Özniteliği olmayan Custom Tag</h1>\n");
      out.write("\n");
      out.write("              <br>Custom tag çalışmaya başlıyor.\n");
      out.write("              <br><h1>");
      if (_jspx_meth_onEkimiz2_BosDeger_0(_jspx_page_context))
        return;
      out.write("</h1>\n");
      out.write("              <br>Custom tag çalışması bitti.\n");
      out.write("              <br>JSP sayfasının Body Content kısmı\n");
      out.write("   </body>\n");
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

  private boolean _jspx_meth_onEkimiz2_BosDeger_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  onEkimiz2:BosDeger
    bosdegerpaketi.BosDegerSinifi _jspx_th_onEkimiz2_BosDeger_0 = (bosdegerpaketi.BosDegerSinifi) _jspx_tagPool_onEkimiz2_BosDeger_nobody.get(bosdegerpaketi.BosDegerSinifi.class);
    _jspx_th_onEkimiz2_BosDeger_0.setPageContext(_jspx_page_context);
    _jspx_th_onEkimiz2_BosDeger_0.setParent(null);
    int _jspx_eval_onEkimiz2_BosDeger_0 = _jspx_th_onEkimiz2_BosDeger_0.doStartTag();
    if (_jspx_th_onEkimiz2_BosDeger_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_onEkimiz2_BosDeger_nobody.reuse(_jspx_th_onEkimiz2_BosDeger_0);
      return true;
    }
    _jspx_tagPool_onEkimiz2_BosDeger_nobody.reuse(_jspx_th_onEkimiz2_BosDeger_0);
    return false;
  }
}
