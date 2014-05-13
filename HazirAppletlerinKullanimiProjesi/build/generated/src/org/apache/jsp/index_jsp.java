package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Hazır Appletlerin Kullanılması</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hazır Appletlerin Kullanılması</h1>\n");
      out.write("        <h3>1-Text Effects (Metin Çümbüşleri)</h3>\n");
      out.write("        <applet code=\"MistyMessage.class\"\n");
      out.write("\tarchive=\"MistyMessage.jar\"\n");
      out.write("\twidth=\"820\"\n");
      out.write("\theight=\"200\">\n");
      out.write("  <param name=\"colorscheme\"      value=\"orange\">\n");
      out.write("  <! orange, green, blue or white>\n");
      out.write("\n");
      out.write("  <param name=\"delay_appear\"     value=\"10\">\n");
      out.write("  <! in milliseconds, default: 60>\n");
      out.write("\n");
      out.write("  <param name=\"delay_wait\"       value=\"2000\">\n");
      out.write("  <! in milliseconds, default: 2000>\n");
      out.write("\n");
      out.write("  <param name=\"delay_dissappear\" value=\"100\">\n");
      out.write("  <! in milliseconds, default: 100>\n");
      out.write("\n");
      out.write("  <param name=\"delay_waitblank\"  value=\"0\">\n");
      out.write("  <! in milliseconds, default: 100>\n");
      out.write("\n");
      out.write("  <! max. 10 lines of text - do not use too many\n");
      out.write("  \tcharacters per line!>\n");
      out.write("\n");
      out.write("  <param name=\"text1\"   value=\"Java2 Platform,Standard Edition\">\n");
      out.write("  <param name=\"text2\"   value=\"J2SE\">\n");
      out.write("\n");
      out.write("  <param name=\"text3\"   value=\"Java2 Platform,Enterprise Edition\">\n");
      out.write("  <param name=\"text4\"   value=\"J2EE\">\n");
      out.write("\n");
      out.write("  <param name=\"text5\"   value=\"Java2 Platform,Micro Edition\">\n");
      out.write("  <param name=\"text6\"   value=\"J2ME\">\n");
      out.write("\n");
      out.write("  <param name=\"looptext\"  value=\"yes\">\n");
      out.write("</applet>\n");
      out.write("       <hr />\n");
      out.write("        <h3>2-Navigation (Yönelticiler)</h3>\n");
      out.write("<applet Code=apMagicMenu Archive=apMagicMenu.jar Width=130 Height=231>\n");
      out.write("  <param name=\"Copyright\" value=\"Apycom Software - www.apycom.com\">\n");
      out.write("  <param name=\"isHorizontal\" value=\"false\">\n");
      out.write("  <param name=\"status\" value=\"link\">\n");
      out.write("  <param name=\"alignText\" value=\"right\">\n");
      out.write("  <param name=\"backColor\" value=\"f2f2f2\">\n");
      out.write("  <param name=\"backHighColor\" value=\"ccee99\">\n");
      out.write("  <param name=\"fontColor\" value=\"005599\">\n");
      out.write("  <param name=\"fontHighColor\" value=\"ffffff\">\n");
      out.write("  <param name=\"maxWords\" value=\"20\">\n");
      out.write("  <param name=\"brightness\" value=\"2\">\n");
      out.write("  <param name=\"fadeDelay\" value=\"20\">\n");
      out.write("  <param name=\"fadeSteps\" value=\"40\">\n");
      out.write("  <param name=\"font\" value=\"TimesRoman,12,1\">\n");
      out.write("  <param name=\"fadeType\" value=\"3\">\n");
      out.write("  <param name=\"menuItems\" value=\"\n");
      out.write("      {Apycom Software\\Home Page,http://www.apycom.com,_self}\n");
      out.write("      {Java Menu Applets,testlink.html,_self}\n");
      out.write("      {Main\\Parameters,testlink.html,_self}\n");
      out.write("      {Optional\\Parameters,testlink.html,_self}\n");
      out.write("      {Javascript Tips,testlink.html,_self}\n");
      out.write("      {Examples,testlink.html,_self}\n");
      out.write("      {Download,testlink.html,_self}\n");
      out.write("      {Contact Us,testlink.html,_self}\n");
      out.write("      \">\n");
      out.write("</applet>\n");
      out.write("        <hr />\n");
      out.write("        <h3>3-Audio Effects (Ses Cümbüşleri)</h3>\n");
      out.write("      <applet archive=\"AppletClasses.jar\" code=\"Xylophone.class\" width=575 height=320>\n");
      out.write("</applet>\n");
      out.write("        <hr />\n");
      out.write("        <h3>4-Utilities(Yardımcı uygulmalar)</h3>\n");
      out.write("        <applet code=\"UnicodeApplet\" width=\"500\" height=\"200\"></applet>\n");
      out.write("        <hr />\n");
      out.write("        <h3>5-Visual Effects(Görsel Cümbüşler) </h3>\n");
      out.write("        <applet code=\"searchlight.class\" width=400 height=300>\n");
      out.write("            <param name=filename value=\"greywolf.jpg\">\n");
      out.write("            <param name=diameter value=\"150\">\n");
      out.write("            <param name=delay value=\"25\">\n");
      out.write("            <param name=opacity value=\"0.2\">\n");
      out.write("        </applet>\n");
      out.write("    </body>\n");
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
}
