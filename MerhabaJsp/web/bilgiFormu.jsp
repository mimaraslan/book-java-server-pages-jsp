<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bilgi Formu</title>
    </head>
  <body>

<h3><font face=verdana color=green><p align="left"><b>Bilgi Formu</b></p></font></h3>

<form name="bilgiFormu" method="post" action="bilgiFormunuKontrolEt.jsp">

<table border="5" id="bilgiTablosu" >
<%
    String eksikAlanlariAlGoster=(String)request.getAttribute("eksikAlanlar");

    if(eksikAlanlariAlGoster != null && eksikAlanlariAlGoster.trim().length()>0){
           out.println("<tr><td colspan='2'>" +
                       "<h3><font face=verdana color=red>"+eksikAlanlariAlGoster+"</font></h3></td></tr>");

    }
%>

<tr>
<td width="30%">Adı</td>
<td><input type="text"   name="adi" size="20" value="<%=request.getParameter("adi")!=null?request.getParameter("adi"):""%>"></td>
</tr>

<tr>
<td width="30%">Parola</td>
<td><input type="password" name="parola" size="20" value="<%=request.getParameter("parola")!=null?request.getParameter("parola"):""%>"></td>
</tr>

<tr>
<td width="30%">Adres</td>
<td><textarea name="adres" cols="15" rows="3"><%=request.getParameter("adres")!=null?request.getParameter("adres"):""%></textarea></td>
</tr>

<tr>
<td width="30%">Telefon</td>
<td><input type="text" name="telefon" size="20" value="<%=request.getParameter("telefon")!=null?request.getParameter("telefon"):""%>"></td>
</tr>

<tr>
<td width="30%" >Ülke</td>
<td><select size="1"  name="ulke">
 <option selected value="<%=request.getParameter("ulke")!=null?request.getParameter("ulke"):""%>"><%=request.getParameter("ulke")!=null?request.getParameter("ulke"):"Lütfen Ülke Seçiniz."%></option>

<option style="background-color: aqua" value="Turkiye">Türkiye</option>
<option style="background-color: yellow"value="Ukrayna">Ukrayna</option>
<option style="background-color: red"value="Rusya">Rusya</option>
<option style="background-color: orange"value="Ingiltere">İngiltere</option>
<option value="Diger">Diğer</option>

</select></td>

</tr>


<tr>
<td width="30%">Şehir</td>
<td><input type="text" name="sehir" size="20" value="<%=request.getParameter("sehir")!=null?request.getParameter("sehir"):""%>"></td>
</tr>

</table>

<p><input type="submit" value="Gönder" name="Gönder">
    <input type="reset" value="Temizle" name="Temizle"></p>

</form>

</body>
</html>