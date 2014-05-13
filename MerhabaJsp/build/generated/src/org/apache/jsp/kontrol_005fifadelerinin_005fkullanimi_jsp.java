package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kontrol_005fifadelerinin_005fkullanimi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Kontrol İfadelerinin Kullanımı </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            int sayi=1453;
            String mesaj="";
         
      out.write("\n");
      out.write("\n");
      out.write("          <h3>if</h3>\n");
      out.write("          ");

          if(sayi==1453)
          out.print("İSTANBUL'UN FETİH TARİHİ " +sayi + " TÜR.");
          
      out.write("\n");
      out.write("\n");
      out.write("          <h3>if - else</h3>\n");
      out.write("          ");

              if(sayi!=1299)
             out.print("İSTANBUL'UN FETİH TARİHİ " +sayi + " TÜR.");
             else
              { out.print("İSTANBUL'UN FETİH TARİHİ " +sayi + " DEĞİLDİR.<br />"
                        +sayi+" OSMANLI İMPARATORLUĞUNUN KURULUŞ TARİHİDİR");
              }
          
      out.write("       \n");
      out.write("          \n");
      out.write("          <h3>if - else if - else</h3>\n");
      out.write("          ");

              if(sayi==2120)
                 out.print("BU TARİHTE DE SAKLI GÜZELLİKLER VARDIR ELBET.");
              else if(sayi==1299)
                 out.print(sayi+" OSMANLI İMPARATORLUĞUNUN KURULUŞ TARİHİDİR"); 
              else
                 out.print(sayi+" FATİH SULTAN MEHMET HANIN İSTANBULU FETİH TARİHİDİR.");
          
      out.write("\n");
      out.write("\n");
      out.write("          <h3>switch</h3>\n");
      out.write("          ");

                switch(sayi){
                    case 1299: mesaj= "OSMANLI KURULUŞ YILI 1299";
                    break;
                    case 1453: mesaj= "İSTANBULUN FETİH YILI 1453";
                    break;
                    default:   mesaj="VARSAYILAN SEÇENEK ÇALIŞTIRILDI.";
                 }
                out.println(mesaj);
          
      out.write("\n");
      out.write("\n");
      out.write("          <h3>while döngüsü</h3>\n");
      out.write("          ");

            int i = 3 ;
            while ( i >0 ) {
            out.println ( " _FSM_ " );
              i--;
            }
          
      out.write("\n");
      out.write("\n");
      out.write("          <h3>do- while döngüsü</h3>\n");
      out.write("          ");

          int a = -5 ;
          do {
            out.println ( "ŞART SAĞLANMASA BİLE do- while döngüsü<br />"
                        + "EN AZ 1 KERE ÇALIŞTIRILIR. " );
              a--;
            }  while ( a >0 );
          
      out.write("         \n");
      out.write("\n");
      out.write("          <h3>for döngüsü</h3>\n");
      out.write("         ");

          for ( int j = 1 ; j <= 3 ; j++  )  {
           out.print ( j + " _FSM_ " );
            }
          
      out.write("       \n");
      out.write("\n");
      out.write("          <h3>for-each</h3>\n");
      out.write("         ");

          int [] tamsayilarDizisininDegiskeni = { 1299 , 1453 , 1481 , 1495 , 1531 };
          for( int tamsayiDegiskenimiz : tamsayilarDizisininDegiskeni ){
           out.println (tamsayiDegiskenimiz);
         }
         
      out.write("\n");
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
