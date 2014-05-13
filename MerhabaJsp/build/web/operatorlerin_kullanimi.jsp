

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operatörlerin Kullanımı </title>
    </head>
    <body>
        <h1>Operatörlerin Kullanımı</h1>

<%
  int sayi1=1453,sayi2=1299,sonuc=0;
%>

Toplama + operatörü  : <% out.println(sonuc=sayi1+sayi2); %><br />
Çıkarma - operatörü  : <% out.println(sonuc=sayi1-sayi2); %><br />
Çarpma  * operatörü  : <% out.println(sonuc=sayi1*sayi2); %><br />
Bölme   / operatörü  : <% out.println(sonuc=sayi1/sayi2); %><br />
Mod     % operatörü  : <% out.println(sonuc=sayi1%sayi2); %>

    </body>
</html>
