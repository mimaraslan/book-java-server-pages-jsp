<%-- 
    Document   : kurabiyemiz
    Created on : 07.01.2010, 23:16:26
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kurabiyeleri Al</title>
    </head>
    <body>
<%
   Cookie[] kurabiyemiz= request.getCookies();
   // Cookie tipinde kurabiyemiz dizi değişkenini tanımladık
   // responseNesnesininKullanimi.jsp sayfasından gelen kurabiye alındı.
   for(int i=0;i<kurabiyemiz.length;i++){

      if(kurabiyemiz[i].getName().equalsIgnoreCase("testKurabiyesi")){

          out.println("Gelen Cookie(Kurabiye) Degerlerimiz : "+ kurabiyemiz[i].getValue());
      }
   }
   // Gelen kurabiyeler for döngüsüne sokularak yazdırıldı.
%>
    </body>
</html>
