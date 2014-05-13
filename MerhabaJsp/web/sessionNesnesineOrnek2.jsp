<%-- 
    Document   : sessionNesnesineOrnek2
    Created on : 08.01.2010, 2:25:59
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Nesnesi Kullanımına Örnek 2</title>
    </head>
    <body>

   Sesion(Oturum) id değerimiz : <%=session.getId() %><br>
   
<%

   if (session.getAttribute("ziyaretsayimiz") != null){

      int sayac = Integer.parseInt((String)session.getAttribute("ziyaretsayimiz"));
      sayac++;
      out.println("Bu Session(oturum)id ile JSP sayfamızı " + sayac + " defa ziyaret ettiniz." );
      session.setAttribute("ziyaretsayimiz",String.valueOf(sayac));

   }else{

      session.setAttribute("ziyaretsayimiz","1");
      out.println("Bu JSP sayfamızdaki ilk ziyaretiniz.");
  }
%>
    </body>
</html>
