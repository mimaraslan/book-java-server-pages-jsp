package org.apache.jsp._2_002dJSTL_0020Format_0020Tags;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ornek2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_setLocale_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_timeZone_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_setLocale_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_timeZone_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_setLocale_value_nobody.release();
    _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.release();
    _jspx_tagPool_fmt_timeZone_value.release();
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.release();
    _jspx_tagPool_fmt_formatNumber_value_nobody.release();
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.release();
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
      out.write("        <title>JSTL Uluslararasılaştırma ve Biçimlendirme</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("    <h3>fmt:setLocale - fmt:formatDate - fmt:timeZone - fmt:formatNumber</h3>\n");
      out.write("\n");
      out.write("        ");
      java.util.Date zaman = null;
      synchronized (_jspx_page_context) {
        zaman = (java.util.Date) _jspx_page_context.getAttribute("zaman", PageContext.PAGE_SCOPE);
        if (zaman == null){
          zaman = new java.util.Date();
          _jspx_page_context.setAttribute("zaman", zaman, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_fmt_setLocale_0(_jspx_page_context))
        return;
      out.write("<strong>TÜRKÇE :</strong>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatDate_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_timeZone_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("         ");
      if (_jspx_meth_fmt_setLocale_1(_jspx_page_context))
        return;
      out.write("<strong>ARAPÇA :</strong>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatDate_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_timeZone_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("         ");
      if (_jspx_meth_fmt_setLocale_2(_jspx_page_context))
        return;
      out.write("<strong>İNGİLTERE :</strong>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatDate_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_timeZone_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("         ");
      if (_jspx_meth_fmt_setLocale_3(_jspx_page_context))
        return;
      out.write("<strong>RUSYA :</strong>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatDate_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_timeZone_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("         ");
      if (_jspx_meth_fmt_setLocale_4(_jspx_page_context))
        return;
      out.write("<strong>JAPONYA :</strong>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatDate_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_timeZone_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_8(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <br>\n");
      out.write("        ");
      if (_jspx_meth_fmt_formatNumber_9(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_fmt_setLocale_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setLocale
    org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag _jspx_th_fmt_setLocale_0 = (org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag) _jspx_tagPool_fmt_setLocale_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag.class);
    _jspx_th_fmt_setLocale_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setLocale_0.setParent(null);
    _jspx_th_fmt_setLocale_0.setValue(new String("tr"));
    int _jspx_eval_fmt_setLocale_0 = _jspx_th_fmt_setLocale_0.doStartTag();
    if (_jspx_th_fmt_setLocale_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_0);
      return true;
    }
    _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_0.setParent(null);
    _jspx_th_fmt_formatDate_0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_0.setType("both");
    _jspx_th_fmt_formatDate_0.setDateStyle("full");
    _jspx_th_fmt_formatDate_0.setTimeStyle("default");
    int _jspx_eval_fmt_formatDate_0 = _jspx_th_fmt_formatDate_0.doStartTag();
    if (_jspx_th_fmt_formatDate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_0);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_0);
    return false;
  }

  private boolean _jspx_meth_fmt_timeZone_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:timeZone
    org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag _jspx_th_fmt_timeZone_0 = (org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag) _jspx_tagPool_fmt_timeZone_value.get(org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag.class);
    _jspx_th_fmt_timeZone_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_timeZone_0.setParent(null);
    _jspx_th_fmt_timeZone_0.setValue(new String("GMT"));
    int _jspx_eval_fmt_timeZone_0 = _jspx_th_fmt_timeZone_0.doStartTag();
    if (_jspx_eval_fmt_timeZone_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_timeZone_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_fmt_timeZone_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_timeZone_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_fmt_formatDate_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_timeZone_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_fmt_timeZone_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_timeZone_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_fmt_timeZone_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_0);
      return true;
    }
    _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_timeZone_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_timeZone_0);
    _jspx_th_fmt_formatDate_1.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_1.setType("both");
    _jspx_th_fmt_formatDate_1.setPattern("dd/MMMM/yyyy, EEEE, HH:mm:ss, z");
    int _jspx_eval_fmt_formatDate_1 = _jspx_th_fmt_formatDate_1.doStartTag();
    if (_jspx_th_fmt_formatDate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent(null);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman.time}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent(null);
    _jspx_th_fmt_formatNumber_1.setValue(new String("5400"));
    _jspx_th_fmt_formatNumber_1.setType("currency");
    _jspx_th_fmt_formatNumber_1.setMinFractionDigits(2);
    _jspx_th_fmt_formatNumber_1.setMaxIntegerDigits(10);
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_fmt_setLocale_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setLocale
    org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag _jspx_th_fmt_setLocale_1 = (org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag) _jspx_tagPool_fmt_setLocale_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag.class);
    _jspx_th_fmt_setLocale_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setLocale_1.setParent(null);
    _jspx_th_fmt_setLocale_1.setValue(new String("ar"));
    int _jspx_eval_fmt_setLocale_1 = _jspx_th_fmt_setLocale_1.doStartTag();
    if (_jspx_th_fmt_setLocale_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_1);
      return true;
    }
    _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_2.setParent(null);
    _jspx_th_fmt_formatDate_2.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_2.setType("both");
    _jspx_th_fmt_formatDate_2.setDateStyle("full");
    _jspx_th_fmt_formatDate_2.setTimeStyle("default");
    int _jspx_eval_fmt_formatDate_2 = _jspx_th_fmt_formatDate_2.doStartTag();
    if (_jspx_th_fmt_formatDate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_2);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_2);
    return false;
  }

  private boolean _jspx_meth_fmt_timeZone_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:timeZone
    org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag _jspx_th_fmt_timeZone_1 = (org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag) _jspx_tagPool_fmt_timeZone_value.get(org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag.class);
    _jspx_th_fmt_timeZone_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_timeZone_1.setParent(null);
    _jspx_th_fmt_timeZone_1.setValue(new String("GMT"));
    int _jspx_eval_fmt_timeZone_1 = _jspx_th_fmt_timeZone_1.doStartTag();
    if (_jspx_eval_fmt_timeZone_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_timeZone_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_fmt_timeZone_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_timeZone_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_fmt_formatDate_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_timeZone_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_fmt_timeZone_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_timeZone_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_fmt_timeZone_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_1);
      return true;
    }
    _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_1);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_3(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_timeZone_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_timeZone_1);
    _jspx_th_fmt_formatDate_3.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_3.setType("both");
    _jspx_th_fmt_formatDate_3.setPattern("dddd, dd MMMM yyyy hh:mm tt");
    int _jspx_eval_fmt_formatDate_3 = _jspx_th_fmt_formatDate_3.doStartTag();
    if (_jspx_th_fmt_formatDate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_3);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent(null);
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman.time}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_3.setParent(null);
    _jspx_th_fmt_formatNumber_3.setValue(new String("5400"));
    _jspx_th_fmt_formatNumber_3.setType("currency");
    _jspx_th_fmt_formatNumber_3.setMinFractionDigits(2);
    _jspx_th_fmt_formatNumber_3.setMaxIntegerDigits(10);
    int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
    if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_3);
    return false;
  }

  private boolean _jspx_meth_fmt_setLocale_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setLocale
    org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag _jspx_th_fmt_setLocale_2 = (org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag) _jspx_tagPool_fmt_setLocale_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag.class);
    _jspx_th_fmt_setLocale_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setLocale_2.setParent(null);
    _jspx_th_fmt_setLocale_2.setValue(new String("en_GB"));
    int _jspx_eval_fmt_setLocale_2 = _jspx_th_fmt_setLocale_2.doStartTag();
    if (_jspx_th_fmt_setLocale_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_2);
      return true;
    }
    _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_4.setParent(null);
    _jspx_th_fmt_formatDate_4.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_4.setType("both");
    _jspx_th_fmt_formatDate_4.setDateStyle("full");
    _jspx_th_fmt_formatDate_4.setTimeStyle("default");
    int _jspx_eval_fmt_formatDate_4 = _jspx_th_fmt_formatDate_4.doStartTag();
    if (_jspx_th_fmt_formatDate_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_4);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_4);
    return false;
  }

  private boolean _jspx_meth_fmt_timeZone_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:timeZone
    org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag _jspx_th_fmt_timeZone_2 = (org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag) _jspx_tagPool_fmt_timeZone_value.get(org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag.class);
    _jspx_th_fmt_timeZone_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_timeZone_2.setParent(null);
    _jspx_th_fmt_timeZone_2.setValue(new String("GMT"));
    int _jspx_eval_fmt_timeZone_2 = _jspx_th_fmt_timeZone_2.doStartTag();
    if (_jspx_eval_fmt_timeZone_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_timeZone_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_fmt_timeZone_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_timeZone_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_fmt_formatDate_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_timeZone_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_fmt_timeZone_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_timeZone_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_fmt_timeZone_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_2);
      return true;
    }
    _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_5(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_timeZone_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_timeZone_2);
    _jspx_th_fmt_formatDate_5.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_5.setType("both");
    _jspx_th_fmt_formatDate_5.setPattern("dd/MMMM/yyyy, EEEE, HH:mm:ss, z");
    int _jspx_eval_fmt_formatDate_5 = _jspx_th_fmt_formatDate_5.doStartTag();
    if (_jspx_th_fmt_formatDate_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_5);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_5);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_4.setParent(null);
    _jspx_th_fmt_formatNumber_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman.time}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_4 = _jspx_th_fmt_formatNumber_4.doStartTag();
    if (_jspx_th_fmt_formatNumber_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_4);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_4);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_5 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_5.setParent(null);
    _jspx_th_fmt_formatNumber_5.setValue(new String("5400"));
    _jspx_th_fmt_formatNumber_5.setType("currency");
    _jspx_th_fmt_formatNumber_5.setMinFractionDigits(2);
    _jspx_th_fmt_formatNumber_5.setMaxIntegerDigits(10);
    int _jspx_eval_fmt_formatNumber_5 = _jspx_th_fmt_formatNumber_5.doStartTag();
    if (_jspx_th_fmt_formatNumber_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_5);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_5);
    return false;
  }

  private boolean _jspx_meth_fmt_setLocale_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setLocale
    org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag _jspx_th_fmt_setLocale_3 = (org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag) _jspx_tagPool_fmt_setLocale_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag.class);
    _jspx_th_fmt_setLocale_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setLocale_3.setParent(null);
    _jspx_th_fmt_setLocale_3.setValue(new String("ru_RU"));
    int _jspx_eval_fmt_setLocale_3 = _jspx_th_fmt_setLocale_3.doStartTag();
    if (_jspx_th_fmt_setLocale_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_3);
      return true;
    }
    _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_6 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_6.setParent(null);
    _jspx_th_fmt_formatDate_6.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_6.setType("both");
    _jspx_th_fmt_formatDate_6.setDateStyle("full");
    _jspx_th_fmt_formatDate_6.setTimeStyle("default");
    int _jspx_eval_fmt_formatDate_6 = _jspx_th_fmt_formatDate_6.doStartTag();
    if (_jspx_th_fmt_formatDate_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_6);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_6);
    return false;
  }

  private boolean _jspx_meth_fmt_timeZone_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:timeZone
    org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag _jspx_th_fmt_timeZone_3 = (org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag) _jspx_tagPool_fmt_timeZone_value.get(org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag.class);
    _jspx_th_fmt_timeZone_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_timeZone_3.setParent(null);
    _jspx_th_fmt_timeZone_3.setValue(new String("GMT"));
    int _jspx_eval_fmt_timeZone_3 = _jspx_th_fmt_timeZone_3.doStartTag();
    if (_jspx_eval_fmt_timeZone_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_timeZone_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_fmt_timeZone_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_timeZone_3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_fmt_formatDate_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_timeZone_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_fmt_timeZone_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_timeZone_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_fmt_timeZone_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_3);
      return true;
    }
    _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_3);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_7(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_timeZone_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_7 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_timeZone_3);
    _jspx_th_fmt_formatDate_7.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_7.setType("both");
    _jspx_th_fmt_formatDate_7.setPattern("dd/MMMM/yyyy, EEEE, HH:mm:ss, z");
    int _jspx_eval_fmt_formatDate_7 = _jspx_th_fmt_formatDate_7.doStartTag();
    if (_jspx_th_fmt_formatDate_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_7);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_7);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_6 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_6.setParent(null);
    _jspx_th_fmt_formatNumber_6.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman.time}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_6 = _jspx_th_fmt_formatNumber_6.doStartTag();
    if (_jspx_th_fmt_formatNumber_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_6);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_6);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_7 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_7.setParent(null);
    _jspx_th_fmt_formatNumber_7.setValue(new String("5400"));
    _jspx_th_fmt_formatNumber_7.setType("currency");
    _jspx_th_fmt_formatNumber_7.setMinFractionDigits(2);
    _jspx_th_fmt_formatNumber_7.setMaxIntegerDigits(10);
    int _jspx_eval_fmt_formatNumber_7 = _jspx_th_fmt_formatNumber_7.doStartTag();
    if (_jspx_th_fmt_formatNumber_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_7);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_7);
    return false;
  }

  private boolean _jspx_meth_fmt_setLocale_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:setLocale
    org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag _jspx_th_fmt_setLocale_4 = (org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag) _jspx_tagPool_fmt_setLocale_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.SetLocaleTag.class);
    _jspx_th_fmt_setLocale_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_setLocale_4.setParent(null);
    _jspx_th_fmt_setLocale_4.setValue(new String("ja_JP"));
    int _jspx_eval_fmt_setLocale_4 = _jspx_th_fmt_setLocale_4.doStartTag();
    if (_jspx_th_fmt_setLocale_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_4);
      return true;
    }
    _jspx_tagPool_fmt_setLocale_value_nobody.reuse(_jspx_th_fmt_setLocale_4);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_8 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_8.setParent(null);
    _jspx_th_fmt_formatDate_8.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_8.setType("both");
    _jspx_th_fmt_formatDate_8.setDateStyle("full");
    _jspx_th_fmt_formatDate_8.setTimeStyle("default");
    int _jspx_eval_fmt_formatDate_8 = _jspx_th_fmt_formatDate_8.doStartTag();
    if (_jspx_th_fmt_formatDate_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_8);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_timeStyle_dateStyle_nobody.reuse(_jspx_th_fmt_formatDate_8);
    return false;
  }

  private boolean _jspx_meth_fmt_timeZone_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:timeZone
    org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag _jspx_th_fmt_timeZone_4 = (org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag) _jspx_tagPool_fmt_timeZone_value.get(org.apache.taglibs.standard.tag.rt.fmt.TimeZoneTag.class);
    _jspx_th_fmt_timeZone_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_timeZone_4.setParent(null);
    _jspx_th_fmt_timeZone_4.setValue(new String("GMT"));
    int _jspx_eval_fmt_timeZone_4 = _jspx_th_fmt_timeZone_4.doStartTag();
    if (_jspx_eval_fmt_timeZone_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_timeZone_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_fmt_timeZone_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_timeZone_4.doInitBody();
      }
      do {
        out.write("\n");
        out.write("         ");
        if (_jspx_meth_fmt_formatDate_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_fmt_timeZone_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_fmt_timeZone_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_timeZone_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_fmt_timeZone_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_4);
      return true;
    }
    _jspx_tagPool_fmt_timeZone_value.reuse(_jspx_th_fmt_timeZone_4);
    return false;
  }

  private boolean _jspx_meth_fmt_formatDate_9(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_timeZone_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_formatDate_9 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_formatDate_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatDate_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_timeZone_4);
    _jspx_th_fmt_formatDate_9.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman}", java.util.Date.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatDate_9.setType("both");
    _jspx_th_fmt_formatDate_9.setPattern("dd/MMMM/yyyy, EEEE, HH:mm:ss, z");
    int _jspx_eval_fmt_formatDate_9 = _jspx_th_fmt_formatDate_9.doStartTag();
    if (_jspx_th_fmt_formatDate_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_9);
      return true;
    }
    _jspx_tagPool_fmt_formatDate_value_type_pattern_nobody.reuse(_jspx_th_fmt_formatDate_9);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_8 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_8.setParent(null);
    _jspx_th_fmt_formatNumber_8.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${zaman.time}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_formatNumber_8 = _jspx_th_fmt_formatNumber_8.doStartTag();
    if (_jspx_th_fmt_formatNumber_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_8);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_nobody.reuse(_jspx_th_fmt_formatNumber_8);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_9(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_9 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_9.setParent(null);
    _jspx_th_fmt_formatNumber_9.setValue(new String("5400"));
    _jspx_th_fmt_formatNumber_9.setType("currency");
    _jspx_th_fmt_formatNumber_9.setMinFractionDigits(2);
    _jspx_th_fmt_formatNumber_9.setMaxIntegerDigits(10);
    int _jspx_eval_fmt_formatNumber_9 = _jspx_th_fmt_formatNumber_9.doStartTag();
    if (_jspx_th_fmt_formatNumber_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_9);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_minFractionDigits_maxIntegerDigits_nobody.reuse(_jspx_th_fmt_formatNumber_9);
    return false;
  }
}
