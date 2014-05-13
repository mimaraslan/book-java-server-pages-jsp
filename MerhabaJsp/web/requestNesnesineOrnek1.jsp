<%-- 
    Document   : requestNesnesineOrnek1
    Created on : 04.01.2010, 15:32:53
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>request Nesnesi Kullanımına Örnek JSP Sayfamız 1</title>
    </head>
    <body>
        <font size="5" color="darkblue">Request(İstek) Bilgileri</font>
<hr>

<table border="1" cellpadding="0" cellspacing="1">
<tr>
<td width="33%"><b>Request(İstek) Method:</b></td>
<td width="67%"><%=request.getMethod()%></td>
</tr>

<tr>
<td width="33%"><b>Request(İstek) URI:</b></td>
<td width="67%"><%=request.getRequestURI()%></td>
</tr>

<tr>
<td width="33%"><b>Request Protocol (İstek Protokol):</b></td>
<td width="67%"><%=request.getProtocol()%></td>
</tr>

<tr>
<td width="33%"><b>Path Info (Yol Bilgisi):</b></td>
<td width="67%"><%=request.getPathInfo()%></td>
</tr>

<tr>
<td width="33%"><b>Path translated (Yol Çevirisi):</b></td>
<td width="67%"><%=request.getPathTranslated()%></td>
</tr>

<tr>
<td width="33%"><b>Query String (Sorgu Katarı):</b></td>
<td width="67%"><%=request.getQueryString()%></td>
</tr>

<tr>
<td width="33%"><b>Content length (İçerik Uzunluğu):</b></td>
<td width="67%"><%=request.getContentLength()%></td>
</tr>

<tr>
<td width="33%"><b>Content type (İçerik Tipi):</b></td>
<td width="67%"><%=request.getContentType()%></td>
</tr>

<tr>
<td width="33%"><b>Server name (Sunucu Adı):</b></td>
<td width="67%"><%=request.getServerName()%></td>
</tr>

<tr>
<td width="33%"><b>Server port (Sunucu Limanı):</b></td>
<td width="67%"><%=request.getServerPort()%></td>
</tr>

<tr>
<td width="33%"><b>Remote user (Uzak Kullanıcı):</b></td>
<td width="67%"><%=request.getRemoteUser()%></td>
</tr>

<tr>
<td width="33%"><b>Remote address (Uzak Adres):</b></td>
<td width="67%"><%=request.getRemoteAddr()%></td>
</tr>

<tr>
<td width="33%"><b>Remote host (Uzak Sahip):</b></td>
<td width="67%"><%=request.getRemoteHost()%></td>
</tr>

<tr>
<td width="33%"><b>Authorization scheme (Yetkilendirme Tasarısı):</b></td>
<td width="67%"><%=request.getAuthType()%></td>
</tr>

</table>
    </body>
</html>
