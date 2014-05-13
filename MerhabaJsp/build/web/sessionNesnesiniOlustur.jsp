<%-- 
    Document   : sessionNesnesiniOlustur
    Created on : 08.01.2010, 1:13:06
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session(Oturum) Nesnesini Oluşturan JSP Sayfamız</title>
    </head>
    <body>
 <%
   String kullaniciadiDegiskeni = request.getParameter( "kullaniciadi" );
   session.setAttribute( "oturumdakiKullaniciadi", kullaniciadiDegiskeni );
%>
        Session(oturum)nesnesi hazır.<br>
        <a href="sessionNesnesiniGoster.jsp">Diğer JSP sayfasında görmek için Tıklayınız.</a>

    </body>
</html>
