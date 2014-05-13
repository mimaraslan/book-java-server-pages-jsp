package org.apache.jsp.etiketDosyalariOrnek2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class text_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/tags/nameValuePair.tagx");
  }

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

      out.write("<html>");
      out.write("<head>");
      out.write("<title>");
      out.write(" Tag Files (Etiket Dosyaları) 3 .jspx ve .tagx ");
      out.write("</title>");
      out.write("</head>");
      out.write("<body>");
      out.write("<table border=\"1\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th>");
      if (_jspx_meth_t_nameValuePair_0(_jspx_page_context))
        return;
      out.write("</th>");
      out.write("<th>");
      if (_jspx_meth_t_nameValuePair_1(_jspx_page_context))
        return;
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody>");
      out.write("<tr>");
      out.write("<td>");
      if (_jspx_meth_t_nameValuePair_2(_jspx_page_context))
        return;
      out.write("</td>");
      out.write("<td>");
      if (_jspx_meth_t_nameValuePair_3(_jspx_page_context))
        return;
      out.write("</td>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td>");
      if (_jspx_meth_t_nameValuePair_4(_jspx_page_context))
        return;
      out.write("</td>");
      out.write("<td>");
      out.write(" ADAMIMIZ BU :))  ");
      out.write("</td>");
      out.write("</tr>");
      out.write("</tbody>");
      out.write("</table>");
      out.write("</body>");
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

  private boolean _jspx_meth_t_nameValuePair_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:nameValuePair
    org.apache.jsp.tag.web.nameValuePair_tagx _jspx_th_t_nameValuePair_0 = new org.apache.jsp.tag.web.nameValuePair_tagx();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_t_nameValuePair_0      );
    }
    _jspx_th_t_nameValuePair_0.setJspContext(_jspx_page_context);
    _jspx_th_t_nameValuePair_0.setValue("Sabri");
    _jspx_th_t_nameValuePair_0.setName("Adı Soyadı : ");
    _jspx_th_t_nameValuePair_0.doTag();
    return false;
  }

  private boolean _jspx_meth_t_nameValuePair_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:nameValuePair
    org.apache.jsp.tag.web.nameValuePair_tagx _jspx_th_t_nameValuePair_1 = new org.apache.jsp.tag.web.nameValuePair_tagx();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_t_nameValuePair_1      );
    }
    _jspx_th_t_nameValuePair_1.setJspContext(_jspx_page_context);
    _jspx_th_t_nameValuePair_1.setValue("55");
    _jspx_th_t_nameValuePair_1.setName("Forma Numarasi");
    _jspx_th_t_nameValuePair_1.doTag();
    return false;
  }

  private boolean _jspx_meth_t_nameValuePair_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:nameValuePair
    org.apache.jsp.tag.web.nameValuePair_tagx _jspx_th_t_nameValuePair_2 = new org.apache.jsp.tag.web.nameValuePair_tagx();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_t_nameValuePair_2      );
    }
    _jspx_th_t_nameValuePair_2.setJspContext(_jspx_page_context);
    _jspx_th_t_nameValuePair_2.setValue("Galatasaray");
    _jspx_th_t_nameValuePair_2.setName("Takim");
    _jspx_th_t_nameValuePair_2.doTag();
    return false;
  }

  private boolean _jspx_meth_t_nameValuePair_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:nameValuePair
    org.apache.jsp.tag.web.nameValuePair_tagx _jspx_th_t_nameValuePair_3 = new org.apache.jsp.tag.web.nameValuePair_tagx();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_t_nameValuePair_3      );
    }
    _jspx_th_t_nameValuePair_3.setJspContext(_jspx_page_context);
    _jspx_th_t_nameValuePair_3.setValue("Orta Saha");
    _jspx_th_t_nameValuePair_3.setName("Mevki");
    _jspx_th_t_nameValuePair_3.doTag();
    return false;
  }

  private boolean _jspx_meth_t_nameValuePair_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:nameValuePair
    org.apache.jsp.tag.web.nameValuePair_tagx _jspx_th_t_nameValuePair_4 = new org.apache.jsp.tag.web.nameValuePair_tagx();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_t_nameValuePair_4      );
    }
    _jspx_th_t_nameValuePair_4.setJspContext(_jspx_page_context);
    _jspx_th_t_nameValuePair_4.setValue("Orta");
    _jspx_th_t_nameValuePair_4.setName("Amacı");
    _jspx_th_t_nameValuePair_4.doTag();
    return false;
  }
}
