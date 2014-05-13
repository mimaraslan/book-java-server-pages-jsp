package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import javax.sql.*;

public final class OracleDriver_005file_005fBaglanti_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

int i=0;
       String renk="#ffccff";
       
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
      out.write("        <title>JSP ve MSSQL Server</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h3>OracleDriver ile ORACLE Veritabanına Bağlantı</h3>\n");
      out.write("   <table>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    ");

    java.sql.Connection baglanti;
    java.sql.Statement bildirim;
    java.sql.ResultSet sonuc;

    baglanti=null;
    bildirim=null;
    sonuc=null;

    String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    String kullanici = "OKUL";
    String parola = "123";

    try{
        Class.forName("oracle.jdbc.OracleDriver");
        baglanti = java.sql.DriverManager.getConnection(url, kullanici, parola);
    }catch(ClassNotFoundException cnfex){
        cnfex.printStackTrace();
    }

    String sqlSorugusu = "SELECT * FROM OGRENCILER";

    try{
        bildirim = baglanti.createStatement();
        sonuc = bildirim.executeQuery(sqlSorugusu);
    
      out.write("\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("        ");

        while( sonuc.next() ){

              i = i % 2;
            if(i == 0)
            {
                renk="#ffff99";
            }else{
                renk="#ccffcc";
            }
          
      out.write("\n");
      out.write("        <tr bgcolor=\"");
out.println(renk);
      out.write("\">\n");
      out.write("                <td>");
      out.print( sonuc.getString("OGRENCI_ID") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( sonuc.getString("NUMARASI") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( sonuc.getString("ADI") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( sonuc.getString("SOYADI") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print( sonuc.getString("ILGIALANI") );
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        ");

        i=i+1;
        }
        
      out.write("\n");
      out.write("\n");
      out.write("    ");

    }
    catch(Exception e){e.printStackTrace();}
    finally{
        if(sonuc!=null) sonuc.close();
        if(bildirim!=null) bildirim.close();
        if(baglanti!=null) baglanti.close();
    }
    
      out.write("\n");
      out.write("    </table>\n");
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
