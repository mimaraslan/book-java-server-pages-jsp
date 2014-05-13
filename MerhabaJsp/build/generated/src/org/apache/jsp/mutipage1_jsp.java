package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mutipage1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("<title>Registration Form</title>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("<p align=\"left\"><b>Registration Form</b></p>\n");
      out.write("\n");
      asamaliPaketi.DorgulamaSinifi bean = null;
      synchronized (session) {
        bean = (asamaliPaketi.DorgulamaSinifi) _jspx_page_context.getAttribute("bean", PageContext.SESSION_SCOPE);
        if (bean == null){
          bean = new asamaliPaketi.DorgulamaSinifi();
          _jspx_page_context.setAttribute("bean", bean, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('\n');


asamaliPaketi.DorgulamaSinifi register=(asamaliPaketi.DorgulamaSinifi)session.getAttribute("bean");


      out.write("\n");
      out.write("\n");
      out.write("<form name=\"registerationForm\" method=\"POST\" action=\"multipage2.jsp\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"1\" width=\"70%\" cellspacing=\"1\" cellpadding=\"0\" id=\"table1\">\n");
      out.write("\n");


    String errors=(String)request.getAttribute("errors");

    if(errors != null && errors.trim().length()>0){

        out.println("<tr><td colspan='2'>The following are the errors with given data<br>"+errors+"</td></tr>");

    }


      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td width=\"50%\">First Name</td>\n");
      out.write("\n");
      out.write("<td><input type=\"text\" name=\"loginName\" size=\"20\" value=\"");
      out.print(register.getLoginName()!=null?register.getLoginName():"");
      out.write("\"></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td width=\"50%\">Last Name</td>\n");
      out.write("\n");
      out.write("<td><input type=\"text\" name=\"password\" size=\"20\" value=\"");
      out.print(register.getPassword()!=null?register.getPassword():"");
      out.write("\"></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td width=\"50%\">Introduce Yourself</td>\n");
      out.write("\n");
      out.write("<td><textarea name=\"intro\" cols=\"40\" rows=\"10\">");
      out.print(register.getIntro()!=null?register.getIntro():"");
      out.write("</textarea></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("\n");
      out.write("<td width=\"50%\">Gender</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 if(register.getGender()==null || register.getGender().equals("male")){ 
      out.write("\n");
      out.write("\n");
      out.write("<input type=\"radio\" value=\"male\" checked name=\"gender\">male\n");
      out.write("\n");
      out.write("<input type=\"radio\" name=\"gender\" value=\"female\">female\n");
      out.write("\n");
}else{ 
      out.write("\n");
      out.write("\n");
      out.write("<input type=\"radio\" value=\"male\" name=\"gender\">male\n");
      out.write("\n");
      out.write("<input type=\"radio\" name=\"gender\" checked value=\"female\">female\n");
      out.write("\n");
} 
      out.write("\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<p><input type=\"submit\" value=\"Submit\" name=\"B1\"><input type=\"reset\" value=\"Reset\" name=\"B2\"></p>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
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
