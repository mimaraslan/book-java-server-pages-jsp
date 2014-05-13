package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tlds/DemoTags.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_star_firsttag_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_star_firsttag_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_star_firsttag_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_star_firsttag_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_star_firsttag_name_nobody.release();
    _jspx_tagPool_star_firsttag_nobody.release();
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Your first JSP tag : FirstTag</title>\n");
      out.write("\t<style>\n");
      out.write("\tp, b { font-family:Tahoma,Sans-Serif; font-size:10pt; }\n");
      out.write("\tb { font-weight:bold; }\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<p align=\"center\">\n");
      out.write("<em><u>Your first JSP tag : FirstTag</u></em></p>\n");
      out.write("\n");
      out.write("\n");
      out.write("<p>Name entered : ");
      if (_jspx_meth_star_firsttag_0(_jspx_page_context))
        return;
      out.write("</p>\n");
      out.write("\n");
      out.write("<p>No name entered : ");
      if (_jspx_meth_star_firsttag_1(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_star_firsttag_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  star:firsttag
    com.stardeveloper.tag.test.FirstTag _jspx_th_star_firsttag_0 = (com.stardeveloper.tag.test.FirstTag) _jspx_tagPool_star_firsttag_name_nobody.get(com.stardeveloper.tag.test.FirstTag.class);
    _jspx_th_star_firsttag_0.setPageContext(_jspx_page_context);
    _jspx_th_star_firsttag_0.setParent(null);
    _jspx_th_star_firsttag_0.setName("Faisal Khan");
    int _jspx_eval_star_firsttag_0 = _jspx_th_star_firsttag_0.doStartTag();
    if (_jspx_th_star_firsttag_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_star_firsttag_name_nobody.reuse(_jspx_th_star_firsttag_0);
      return true;
    }
    _jspx_tagPool_star_firsttag_name_nobody.reuse(_jspx_th_star_firsttag_0);
    return false;
  }

  private boolean _jspx_meth_star_firsttag_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  star:firsttag
    com.stardeveloper.tag.test.FirstTag _jspx_th_star_firsttag_1 = (com.stardeveloper.tag.test.FirstTag) _jspx_tagPool_star_firsttag_nobody.get(com.stardeveloper.tag.test.FirstTag.class);
    _jspx_th_star_firsttag_1.setPageContext(_jspx_page_context);
    _jspx_th_star_firsttag_1.setParent(null);
    int _jspx_eval_star_firsttag_1 = _jspx_th_star_firsttag_1.doStartTag();
    if (_jspx_th_star_firsttag_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_star_firsttag_nobody.reuse(_jspx_th_star_firsttag_1);
      return true;
    }
    _jspx_tagPool_star_firsttag_nobody.reuse(_jspx_th_star_firsttag_1);
    return false;
  }
}
