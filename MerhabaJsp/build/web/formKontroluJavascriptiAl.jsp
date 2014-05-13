<%-- 
    Document   : formKontroluJavascriptiAl
    Created on : 13.01.2010, 2:56:51
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kayıt Formundan Gelen JSP Sayfası</title>
    </head>
    <body>
      <p align="left"><b>Kayıt Formundan Gelen</b></p>

<table border="1" width="41%" cellspacing="1" cellpadding="0" id="table1">

<tr>
<td width="33%">Adı</td>
  <td><strong><%=request.getParameter("adi") %></strong></td>
</tr>

<tr>
<td width="33%">Soyadı</td>
  <td><strong><%=request.getParameter("soyadi") %></strong></td>
</tr>

<tr>
<td width="33%">Telefonu</td>
  <td><strong><%=request.getParameter("telefon") %></strong></td>
</tr>

<tr>
<td width="33%">Cinsiyeti</td>
  <td><strong><%=request.getParameter("cinsiyet") %></strong></td>
</tr>

<tr>
<td width="33%">Adres</td>
<td><strong><%=request.getParameter("adres") %></strong></td>
</tr>

<tr>
  <td width="33%">Ülke</td>
  <td><strong><%=request.getParameter("ulke") %></strong></td>
</tr>

<tr>
  <td>Meslek</td>
  <td><strong><%=request.getParameter("meslek") %></strong></td>
</tr>

<tr>
  <td>Tecrübe Yılı</td>
  <td><strong><%=request.getParameter("tecrube") %></strong></td>
</tr>

</table>

    </body>
</html>
