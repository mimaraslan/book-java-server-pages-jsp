<%-- 
    Document   : requestNesnesineOrnek2
    Created on : 06.01.2010, 16:15:24
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>request Nesnesi ve Harici Sayfa Kullanımına Örnek JSP Sayfamız 2</title>
    </head>
    <body>
        <h3>
    <font face="arial"  color="darkblue">
requestNesnesineOrnek2.jsp <br>
Sayfasından requestHariciSayfa.jsp sayfasına <br>
gönderilenlen bilgi :<br>
 </font>
<%request.setAttribute("aktarilanbilgi","<br>Güzel Gören Güzel Düşünür," +
                               "<br>Güzel Düşünen" +
                               "<br>Hayatından Lezzet Alır.");%>
       </h3>

<hr>

<h3>
<jsp:include page="requestHariciSayfa.jsp"/>
</h3>

    </body>
</html>
