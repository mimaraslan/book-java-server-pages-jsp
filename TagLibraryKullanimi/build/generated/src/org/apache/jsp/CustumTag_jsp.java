package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CustumTag_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tld/terstenyaz.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_onEkTagimiz_tesineyaz;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_onEkTagimiz_tesineyaz = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_onEkTagimiz_tesineyaz.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Custom Tag library Kullanımı</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("<table width=\"390\" height=\"202\" border=\"4\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"184\" align=\"center\" bgcolor=\"#FFFF66\"><h2><em>DÜZ </em></h2></td>\n");
      out.write("    <td width=\"184\" align=\"center\" bgcolor=\"#FFFF66\"><h2><em>TERS</em></h2></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td bgcolor=\"#FFFFCC\"><h2>Cem Güreşçi</h2></td>\n");
      out.write("    <td align=\"right\" bgcolor=\"#FFFFCC\"><h2>\n");
      out.write("      ");
      if (_jspx_meth_onEkTagimiz_tesineyaz_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </h2></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td bgcolor=\"#D7EBFF\"><h2>Cihad Göktaş</h2></td>\n");
      out.write("    <td align=\"right\" bgcolor=\"#D7EBFF\"><h2>\n");
      out.write("      ");
      if (_jspx_meth_onEkTagimiz_tesineyaz_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </h2></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td bgcolor=\"#FFFFCC\"><h2>Fatih Yavaşoğlu</h2></td>\n");
      out.write("    <td align=\"right\" bgcolor=\"#FFFFCC\"><h2>\n");
      out.write("      ");
      if (_jspx_meth_onEkTagimiz_tesineyaz_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </h2></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td bgcolor=\"#D7EBFF\"><h2>Yiğit Bayram</h2></td>\n");
      out.write("    <td align=\"right\" bgcolor=\"#D7EBFF\"><h2>\n");
      out.write("      ");
      if (_jspx_meth_onEkTagimiz_tesineyaz_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </h2></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td bgcolor=\"#FFFFCC\"><h2>Sefa Bayka</h2></td>\n");
      out.write("    <td align=\"right\" bgcolor=\"#FFFFCC\"><h2>\n");
      out.write("      ");
      if (_jspx_meth_onEkTagimiz_tesineyaz_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </h2></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td height=\"30\" bgcolor=\"#D7EBFF\"><h2>Alp Kaan</h2></td>\n");
      out.write("    <td align=\"right\" bgcolor=\"#D7EBFF\"><h2>\n");
      out.write("      ");
      if (_jspx_meth_onEkTagimiz_tesineyaz_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </h2></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
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

  private boolean _jspx_meth_onEkTagimiz_tesineyaz_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  onEkTagimiz:tesineyaz
    com.mimaraslan.taglibrary.CumleyiTersCevirenSinif _jspx_th_onEkTagimiz_tesineyaz_0 = (com.mimaraslan.taglibrary.CumleyiTersCevirenSinif) _jspx_tagPool_onEkTagimiz_tesineyaz.get(com.mimaraslan.taglibrary.CumleyiTersCevirenSinif.class);
    _jspx_th_onEkTagimiz_tesineyaz_0.setPageContext(_jspx_page_context);
    _jspx_th_onEkTagimiz_tesineyaz_0.setParent(null);
    int _jspx_eval_onEkTagimiz_tesineyaz_0 = _jspx_th_onEkTagimiz_tesineyaz_0.doStartTag();
    if (_jspx_eval_onEkTagimiz_tesineyaz_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_onEkTagimiz_tesineyaz_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_onEkTagimiz_tesineyaz_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_onEkTagimiz_tesineyaz_0.doInitBody();
      }
      do {
        out.write("Cem Güreşçi");
        int evalDoAfterBody = _jspx_th_onEkTagimiz_tesineyaz_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_onEkTagimiz_tesineyaz_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_onEkTagimiz_tesineyaz_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_0);
      return true;
    }
    _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_0);
    return false;
  }

  private boolean _jspx_meth_onEkTagimiz_tesineyaz_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  onEkTagimiz:tesineyaz
    com.mimaraslan.taglibrary.CumleyiTersCevirenSinif _jspx_th_onEkTagimiz_tesineyaz_1 = (com.mimaraslan.taglibrary.CumleyiTersCevirenSinif) _jspx_tagPool_onEkTagimiz_tesineyaz.get(com.mimaraslan.taglibrary.CumleyiTersCevirenSinif.class);
    _jspx_th_onEkTagimiz_tesineyaz_1.setPageContext(_jspx_page_context);
    _jspx_th_onEkTagimiz_tesineyaz_1.setParent(null);
    int _jspx_eval_onEkTagimiz_tesineyaz_1 = _jspx_th_onEkTagimiz_tesineyaz_1.doStartTag();
    if (_jspx_eval_onEkTagimiz_tesineyaz_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_onEkTagimiz_tesineyaz_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_onEkTagimiz_tesineyaz_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_onEkTagimiz_tesineyaz_1.doInitBody();
      }
      do {
        out.write("Cihad Göktaş");
        int evalDoAfterBody = _jspx_th_onEkTagimiz_tesineyaz_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_onEkTagimiz_tesineyaz_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_onEkTagimiz_tesineyaz_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_1);
      return true;
    }
    _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_1);
    return false;
  }

  private boolean _jspx_meth_onEkTagimiz_tesineyaz_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  onEkTagimiz:tesineyaz
    com.mimaraslan.taglibrary.CumleyiTersCevirenSinif _jspx_th_onEkTagimiz_tesineyaz_2 = (com.mimaraslan.taglibrary.CumleyiTersCevirenSinif) _jspx_tagPool_onEkTagimiz_tesineyaz.get(com.mimaraslan.taglibrary.CumleyiTersCevirenSinif.class);
    _jspx_th_onEkTagimiz_tesineyaz_2.setPageContext(_jspx_page_context);
    _jspx_th_onEkTagimiz_tesineyaz_2.setParent(null);
    int _jspx_eval_onEkTagimiz_tesineyaz_2 = _jspx_th_onEkTagimiz_tesineyaz_2.doStartTag();
    if (_jspx_eval_onEkTagimiz_tesineyaz_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_onEkTagimiz_tesineyaz_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_onEkTagimiz_tesineyaz_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_onEkTagimiz_tesineyaz_2.doInitBody();
      }
      do {
        out.write("Fatih Yavaşoğlu");
        int evalDoAfterBody = _jspx_th_onEkTagimiz_tesineyaz_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_onEkTagimiz_tesineyaz_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_onEkTagimiz_tesineyaz_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_2);
      return true;
    }
    _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_2);
    return false;
  }

  private boolean _jspx_meth_onEkTagimiz_tesineyaz_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  onEkTagimiz:tesineyaz
    com.mimaraslan.taglibrary.CumleyiTersCevirenSinif _jspx_th_onEkTagimiz_tesineyaz_3 = (com.mimaraslan.taglibrary.CumleyiTersCevirenSinif) _jspx_tagPool_onEkTagimiz_tesineyaz.get(com.mimaraslan.taglibrary.CumleyiTersCevirenSinif.class);
    _jspx_th_onEkTagimiz_tesineyaz_3.setPageContext(_jspx_page_context);
    _jspx_th_onEkTagimiz_tesineyaz_3.setParent(null);
    int _jspx_eval_onEkTagimiz_tesineyaz_3 = _jspx_th_onEkTagimiz_tesineyaz_3.doStartTag();
    if (_jspx_eval_onEkTagimiz_tesineyaz_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_onEkTagimiz_tesineyaz_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_onEkTagimiz_tesineyaz_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_onEkTagimiz_tesineyaz_3.doInitBody();
      }
      do {
        out.write("Yiğit Bayram");
        int evalDoAfterBody = _jspx_th_onEkTagimiz_tesineyaz_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_onEkTagimiz_tesineyaz_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_onEkTagimiz_tesineyaz_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_3);
      return true;
    }
    _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_3);
    return false;
  }

  private boolean _jspx_meth_onEkTagimiz_tesineyaz_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  onEkTagimiz:tesineyaz
    com.mimaraslan.taglibrary.CumleyiTersCevirenSinif _jspx_th_onEkTagimiz_tesineyaz_4 = (com.mimaraslan.taglibrary.CumleyiTersCevirenSinif) _jspx_tagPool_onEkTagimiz_tesineyaz.get(com.mimaraslan.taglibrary.CumleyiTersCevirenSinif.class);
    _jspx_th_onEkTagimiz_tesineyaz_4.setPageContext(_jspx_page_context);
    _jspx_th_onEkTagimiz_tesineyaz_4.setParent(null);
    int _jspx_eval_onEkTagimiz_tesineyaz_4 = _jspx_th_onEkTagimiz_tesineyaz_4.doStartTag();
    if (_jspx_eval_onEkTagimiz_tesineyaz_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_onEkTagimiz_tesineyaz_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_onEkTagimiz_tesineyaz_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_onEkTagimiz_tesineyaz_4.doInitBody();
      }
      do {
        out.write("Sefa Bayka");
        int evalDoAfterBody = _jspx_th_onEkTagimiz_tesineyaz_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_onEkTagimiz_tesineyaz_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_onEkTagimiz_tesineyaz_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_4);
      return true;
    }
    _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_4);
    return false;
  }

  private boolean _jspx_meth_onEkTagimiz_tesineyaz_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  onEkTagimiz:tesineyaz
    com.mimaraslan.taglibrary.CumleyiTersCevirenSinif _jspx_th_onEkTagimiz_tesineyaz_5 = (com.mimaraslan.taglibrary.CumleyiTersCevirenSinif) _jspx_tagPool_onEkTagimiz_tesineyaz.get(com.mimaraslan.taglibrary.CumleyiTersCevirenSinif.class);
    _jspx_th_onEkTagimiz_tesineyaz_5.setPageContext(_jspx_page_context);
    _jspx_th_onEkTagimiz_tesineyaz_5.setParent(null);
    int _jspx_eval_onEkTagimiz_tesineyaz_5 = _jspx_th_onEkTagimiz_tesineyaz_5.doStartTag();
    if (_jspx_eval_onEkTagimiz_tesineyaz_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_onEkTagimiz_tesineyaz_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_onEkTagimiz_tesineyaz_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_onEkTagimiz_tesineyaz_5.doInitBody();
      }
      do {
        out.write("Alp Kaan");
        int evalDoAfterBody = _jspx_th_onEkTagimiz_tesineyaz_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_onEkTagimiz_tesineyaz_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_onEkTagimiz_tesineyaz_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_5);
      return true;
    }
    _jspx_tagPool_onEkTagimiz_tesineyaz.reuse(_jspx_th_onEkTagimiz_tesineyaz_5);
    return false;
  }
}
