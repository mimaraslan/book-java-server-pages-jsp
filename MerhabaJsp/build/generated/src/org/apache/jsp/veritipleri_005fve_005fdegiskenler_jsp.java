package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class veritipleri_005fve_005fdegiskenler_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP'de Veri Tipleri ve Değişkenler</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" <h1>1. Primitive (İlkel) Veri Tipleri</h1>\n");
      out.write("\n");

byte  byte_tipindeki_degiskenimiz = 11;
short short_tipindeki_degiskenimiz = 571;
int int_tipindeki_degiskenimiz = 1453;
float floattipindekidegiskenimiz = 63.2f;
double double_tipindeki_degiskenimiz = 1481.99;
long long_tipindeki_degiskenimiz = 12992016;
char char_tipindeki_degiskenimiz = 'a';
boolean boolean_tipindeki_degiskenimiz = false;

      out.write("\n");
      out.write("\n");
      out.write(" <h2>Sayısal veri tipleri</h2>\n");
      out.write(" <h3>Tamsayı veri tipleri: byte,  short, int, long,   char</h3>\n");
      out.write("byte ");
 out.println(byte_tipindeki_degiskenimiz);
      out.write("<br />\n");
      out.write("short ");
 out.println(short_tipindeki_degiskenimiz);
      out.write("<br />\n");
      out.write("int ");
 out.println(int_tipindeki_degiskenimiz);
      out.write("<br />\n");
      out.write("long ");
 out.println(long_tipindeki_degiskenimiz);
      out.write("<br />\n");
      out.write("char ");
 out.println(char_tipindeki_degiskenimiz);
      out.write("<br />\n");
      out.write(" <h3>Kesirli sayı veri tipleri: float, double</h3>\n");
      out.write("float ");
 out.println(floattipindekidegiskenimiz);
      out.write("<br />\n");
      out.write("double ");
 out.println(double_tipindeki_degiskenimiz);
      out.write("<br />\n");
      out.write(" <h3>Mantıksal veri tipi</h3>\n");
      out.write("boolean ");
 out.println(boolean_tipindeki_degiskenimiz);
      out.write("<br />\n");
      out.write("\n");
      out.write(" <h1>2.Referans Tipleri : class, interface,  array</h1>\n");
      out.write(" <h1>3.Null Tip :  null</h1>\n");
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
}
