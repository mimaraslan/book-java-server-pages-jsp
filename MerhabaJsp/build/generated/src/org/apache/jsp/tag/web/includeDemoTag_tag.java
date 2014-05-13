package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class includeDemoTag_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(2);
    _jspx_dependants.add("/newFolder/included.html");
    _jspx_dependants.add("/WEB-INF/tags/included.tagf");
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
      out.write("This tag file shows the use of the include directive.\n");
      out.write("The first include directive demonstrates how you can include\n");
      out.write("a static resource called included.html.\n");
      out.write("<br/>\n");
      out.write("Here is the content of included.html:\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("  <td><b>Menu</b></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td>CDs</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td>DVDs</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("  <td>Others</td>\n");
      out.write("</tr>\n");
      out.write("</table>");
      out.write("\n");
      out.write("<br/>\n");
      out.write("<br/>\n");
      out.write("The second include directive includes another\n");
      out.write("dynamic resource: included.tagf.\n");
      out.write("<br/>\n");

  out.print("Hello from included.tagf");

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
