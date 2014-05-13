<%-- 
    Document   : outNesnesininKullanimi
    Created on : 30.12.2009, 1:44:51
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Sayfasından out (çıkış) Nesnesinin Kullanımı</title>
    </head>
    <body>
        <h1>out (çıkış) Nesnesinin Kullanımı</h1>
     <br>
          <%
  for(int sayi1=1 ; sayi1<10 ; sayi1++){

       for(int sayi2=1 ; sayi2<=sayi1 ; sayi2++){

           out.print("   "+ sayi2);

         }

    out.println("<hr>");
   }
 %>

        
    </body>
</html>
