package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tagdosyasi3_tagx
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

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
  private java.lang.String birinciSoz;
  private java.lang.String ikinciSoz;
  private java.lang.String ucuncuSoz;

  public java.lang.String getBirinciSoz() {
    return this.birinciSoz;
  }

  public void setBirinciSoz(java.lang.String birinciSoz) {
    this.birinciSoz = birinciSoz;
  }

  public java.lang.String getIkinciSoz() {
    return this.ikinciSoz;
  }

  public void setIkinciSoz(java.lang.String ikinciSoz) {
    this.ikinciSoz = ikinciSoz;
  }

  public java.lang.String getUcuncuSoz() {
    return this.ucuncuSoz;
  }

  public void setUcuncuSoz(java.lang.String ucuncuSoz) {
    this.ucuncuSoz = ucuncuSoz;
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
    if( getBirinciSoz() != null ) {
      _jspx_page_context.setAttribute("birinciSoz", getBirinciSoz());
}
    if( getIkinciSoz() != null ) {
      _jspx_page_context.setAttribute("ikinciSoz", getIkinciSoz());
}
    if( getUcuncuSoz() != null ) {
      _jspx_page_context.setAttribute("ucuncuSoz", getUcuncuSoz());
}

    try {
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${birinciSoz}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ikinciSoz}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ucuncuSoz}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write(' ');
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
