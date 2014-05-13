<%-- 
    Document   : ornek2
    Created on : 27.12.2009, 23:03:43
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Örnek 2</title>
    </head>
    <body>
<font face=verdana color=darkblue>Fonksiyondan önce</font>

<br>
<%!
public String yaziYazanFonksiyon(int donguKacDefaDonecek)

{

            String cumle="";

            for (int i = 1; i < donguKacDefaDonecek; i++ )

               cumle = cumle + "<font size=" + i + " face=arial color=blue>" +
                                                     "Güzel Gören, Güzel Düşünür.</br>" +
                                                     "Güzel Düşünen, Hayatından Lezzet Alır.</font><br>" ;
            return cumle;
}
%>

<br>

<%= yaziYazanFonksiyon(8) %>

<font face=verdana color=red >Fonksiyondan sonra</font>
    </body>
</html>
