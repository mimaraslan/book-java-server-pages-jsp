<%-- 
    Document   : fasulyeFormunuGoster
    Created on : 14.01.2010, 2:21:59
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<jsp:useBean id="paketimiz" type="paketimiz.BizimSinifimiz" class="paketimiz.BizimSinifimiz" scope="session"/>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Beans(Fasulyeler) ve Form İşlemi Sonucu</title>
    </head>
    <body>
        <h2>Beans(Fasulyeler) ve Form İşlemi Sonucu</h2>

        <table border="1" width="41%" cellspacing="1" cellpadding="0" id="fasulyeTablosu">

<tr>
<td width="33%">Adı</td>
  <td><strong><%=paketimiz.getAdi() %></strong></td>
</tr>

<tr>
<td width="33%">Soyadı</td>
  <td><strong><%=paketimiz.getSoyadi() %></strong></td>
</tr>

<tr>
<td width="33%">Telefonu</td>
  <td><strong><%=paketimiz.getTelefon() %></strong></td>
</tr>

<tr>
<td width="33%">Cinsiyeti</td>
  <td><strong><%=paketimiz.getCinsiyet() %></strong></td>
</tr>

<tr>
<td width="33%">Adres</td>
<td><strong><%=paketimiz.getAdres() %></strong></td>
</tr>

<tr>
  <td width="33%">Ülke</td>
  <td><strong><%=paketimiz.getUlke() %></strong></td>
</tr>

<tr>
  <td>Meslek</td>
  <td><strong><%=paketimiz.getMeslek() %></strong></td>
</tr>

<tr>
  <td>Tecrübe Yılı</td>
  <td><strong><%=paketimiz.getTecrube() %></strong></td>
</tr>

<tr>
  <td>Yaşı</td>
  <td><strong><%=paketimiz.getYasi() %></strong></td>
</tr>
</table>

    </body>
</html>