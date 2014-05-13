<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Kayıt Formu</title>

</head>


<body>
    <h1>Kayıt Formu</h1>

<form method="POST" action="kayitFormunuKontrolEt.jsp">

<table>
<%
    String hatalar=(String)request.getAttribute("hatalar");

    if(hatalar != null && hatalar.trim().length()>0){

        out.println("<tr><td colspan='2'>" +
                    "<h3><font face=verdana color=red>"+hatalar+"</font></h3></td></tr>");

    }

%>

<tr>
<td >Adı</td>
<td><input type="text" name="kullaniciadimiz"
           value="<%=request.getParameter("kullaniciadimiz")!=null?request.getParameter("kullaniciadimiz"):""%>"></td>
</tr>

<tr>
<td >Parola</td>
<td><input type="password" name="parolamiz"
           value="<%=request.getParameter("parolamiz")!=null?request.getParameter("parolamiz"):""%>"></td>
</tr>


<tr>
<td></td>
<td><input type="submit" value="Gönder" name="Gonder">
    <input type="reset" value="Temizle" name="Temizle"></td>
</tr>

</table>

</form>

</body>
</html>