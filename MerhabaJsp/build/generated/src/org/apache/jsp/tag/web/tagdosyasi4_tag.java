package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tagdosyasi4_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(9);
    _jspx_dependants.add("/WEB-INF/tags/../tags/eklenecek_tagdosyasi.tag");
    _jspx_dependants.add("/WEB-INF/tags/eklenecek_tagxdosyasi.tagx");
    _jspx_dependants.add("/WEB-INF/tags/eklenecek_tagfdosyasi_standart.tagf");
    _jspx_dependants.add("/WEB-INF/tags/eklenecek_tagfdosyasi_xml.tagf");
    _jspx_dependants.add("/etiketDosyalariOrnek4/eklenecek_htmlsayfasi.html");
    _jspx_dependants.add("/etiketDosyalariOrnek4/eklenecek_jspsayfasi.jsp");
    _jspx_dependants.add("/etiketDosyalariOrnek4/eklenecek_jspxsayfasi.jspx");
    _jspx_dependants.add("/etiketDosyalariOrnek4/eklenecek_jspsayfasi_standart.jspf");
    _jspx_dependants.add("/etiketDosyalariOrnek4/eklenecek_jspxsayfasi_xml.jspf");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2><font color=\"red\">tag</font> dosyası eklendi</h2>");
      out.write("\n");
      out.write("<hr>\n");
      out.write("<h2>");
      out.write("tag");
      out.write("<font color=\"red\">");
      out.write('x');
      out.write("</font>");
      out.write(" dosyası eklendi");
      out.write("</h2>");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<h2>tag<font color=\"red\">f</font> dosyası standart eklendi</h2>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<h2>tag<font color=\"red\">f</font>\n");
      out.write("\n");

  out.print(" dosyası xml eklendi</h2>");

      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<h2><font color=\"green\">html</font> sayfası eklendi</h2>");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2><font color=\"blue\">jsp</font> sayfası eklendi</h2>");
      out.write("\n");
      out.write("<hr>\n");
      out.write("<h2>");
      out.write("jsp");
      out.write("<font color=\"blue\">");
      out.write('x');
      out.write("</font>");
      out.write(" sayfası eklendi");
      out.write("</h2>");
      out.write("\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<h2>jsp<font color=\"blue\">f</font> sayfası standart eklendi</h2>");
      out.write("\n");
      out.write("<hr>\n");
      out.write("<h2>jsp<font color=\"blue\">x</font> sayfası xml eklendi</h2>");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
