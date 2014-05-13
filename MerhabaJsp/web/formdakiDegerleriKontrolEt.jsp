<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gelen Değerler</title>
    </head>

<body>

<b>JSP Sayfamızda Formdan Gelen Değerler </b>

<table border="2" width="49%" id="gelenDegerlerinTablosu">

<tr>
<td width="14%" bgcolor="#FFFF66"><strong>Adı</strong></td>
<td width="86%" bgcolor="#FFFF66"><em><strong><%=request.getParameter("adi") %></strong></em></td>
</tr>

<tr>
<td bgcolor="#FFFF66"><strong>Soyadı</strong></td>
<td bgcolor="#FFFF66"><em><strong><%=request.getParameter("soyadi") %></strong></em></td>
</tr>

<tr>
<td bgcolor="#FFFF66"><strong>Parola</strong></td>
<td bgcolor="#FFFF66"><em><strong><%=request.getParameter("parola") %></strong></em></td>
</tr>

<tr>
<td bgcolor="#FFFF66"><strong>Cümle</strong></td>
<td bgcolor="#FFFF66"><em><strong><%=request.getParameter("cumle") %></strong></em></td>
</tr>

</table>

</body>
</html>
