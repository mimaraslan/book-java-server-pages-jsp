package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustomTagLibraryKullanimi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tlds/CustomTagLibraryKullanimiTLD.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_mesajimiz_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_mesajimiz_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_mesajimiz_nobody.release();
    _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_nobody.release();
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
      out.write("        <title>Custom Tag Library Kullanımı</title>\n");
      out.write("\n");
      out.write("        <style type=\"text/css\" >\n");
      out.write("\tp { font-weight:bold; font-family:Tahoma,Sans-Serif; font-size:20pt; }\n");
      out.write("\t</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write(" <p style=\"color:brown\">Custom Tag Library Kullanımı</p>\n");
      out.write(" \n");
      out.write("\n");
      out.write("<p>\n");
      out.write("    <strong style=\"color:dodgerblue\">Mesajımız :</strong>\n");
      out.write("    <strong style=\"background:yellow\">\n");
      out.write("    <strong style=\"color:tomato\"><br>Güzel Gören </strong>\n");
      out.write("    ");
      if (_jspx_meth_onEkAdi_CustomTagLibraryKullanimiTLDadi_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("     <strong style=\"color:indianred\">Lezzet Alır. </strong>\n");
      out.write("    </strong>\n");
      out.write("</p>\n");
      out.write(" <hr>\n");
      out.write("<p><strong style=\"color:crimson\">Dikkat :</strong><br>\n");
      out.write("    <strong style=\"background:bisque\">\n");
      out.write("        ");
      if (_jspx_meth_onEkAdi_CustomTagLibraryKullanimiTLDadi_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("   </strong>\n");
      out.write("</p>\n");
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

  private boolean _jspx_meth_onEkAdi_CustomTagLibraryKullanimiTLDadi_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  onEkAdi:CustomTagLibraryKullanimiTLDadi
    paketimiz.CustomTagLibraryKullanimiJavaSinifi _jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_0 = (paketimiz.CustomTagLibraryKullanimiJavaSinifi) _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_mesajimiz_nobody.get(paketimiz.CustomTagLibraryKullanimiJavaSinifi.class);
    _jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_0.setPageContext(_jspx_page_context);
    _jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_0.setParent(null);
    _jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_0.setMesajimiz("Güzel Düşünen ");
    int _jspx_eval_onEkAdi_CustomTagLibraryKullanimiTLDadi_0 = _jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_0.doStartTag();
    if (_jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_mesajimiz_nobody.reuse(_jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_0);
      return true;
    }
    _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_mesajimiz_nobody.reuse(_jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_0);
    return false;
  }

  private boolean _jspx_meth_onEkAdi_CustomTagLibraryKullanimiTLDadi_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  onEkAdi:CustomTagLibraryKullanimiTLDadi
    paketimiz.CustomTagLibraryKullanimiJavaSinifi _jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_1 = (paketimiz.CustomTagLibraryKullanimiJavaSinifi) _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_nobody.get(paketimiz.CustomTagLibraryKullanimiJavaSinifi.class);
    _jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_1.setPageContext(_jspx_page_context);
    _jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_1.setParent(null);
    int _jspx_eval_onEkAdi_CustomTagLibraryKullanimiTLDadi_1 = _jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_1.doStartTag();
    if (_jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_nobody.reuse(_jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_1);
      return true;
    }
    _jspx_tagPool_onEkAdi_CustomTagLibraryKullanimiTLDadi_nobody.reuse(_jspx_th_onEkAdi_CustomTagLibraryKullanimiTLDadi_1);
    return false;
  }
}
