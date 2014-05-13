<%-- 
    Document   : responseNesnesininKullanimi
    Created on : 07.01.2010, 23:15:12
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>response Nesnesinin Kullanımına Örnek</title>
    </head>
    <body>
<% 
    Cookie kurabiyeNesnesi = new Cookie ("testKurabiyesi","M.ASLAN");
      /* Cookie tipinde kurabiyeNesnesi oluşturduk
       *parametremiz olan testKurabiyesine M.ASLAN değerini verdik.
       *kurabiyeNesnesi bu değerle diğer bir sayfaya gönderilecektir.
       */

      kurabiyeNesnesi.setMaxAge(365 * 24 * 60 * 60);
      //Kurabiye Nesnemize Kurabiyemizin Ömrünüde belirttik.

      response.addCookie(kurabiyeNesnesi);
      //Yanıt için Kurabiyeyi   response nesnesine   ekledik.

      response.sendRedirect("kurabiyemiz.jsp");
      //Kurabiyemizi artık  response nesnesine  yardımıyla 
      //kurabiyemiz.jsp sayfamıza gönderiyoruz.
%>

    </body>
</html>
