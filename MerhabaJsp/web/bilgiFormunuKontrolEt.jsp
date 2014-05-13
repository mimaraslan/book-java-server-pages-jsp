<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bilgi Formunu Kontrol Et</title>
    </head>
  <body>
<%
    String adi=request.getParameter("adi");
    String parola=request.getParameter("parola");
    String adres=request.getParameter("adres");
    String telefon=request.getParameter("telefon");
    String ulke=request.getParameter("ulke");
    String sehir=request.getParameter("sehir");

    String eksikAlanlar="";

    if(adi ==null || adi.trim().length() ==0){
        eksikAlanlar=eksikAlanlar+"<li>Adı alanını boş geçemezsiniz.<hr>";
    }

    if(parola ==null || parola.trim().length() ==0){
        eksikAlanlar=eksikAlanlar+"<li>Parola alanını boş geçemezsiniz.<hr>";
    }

    if(adres ==null || adres.trim().length() ==0){
        eksikAlanlar=eksikAlanlar+"<li>Adres alanını boş geçemezsiniz.<hr>";
    }

    if(telefon ==null || telefon.trim().length() ==0){
        eksikAlanlar=eksikAlanlar+"<li>Telefon alanını boş geçemezsiniz.<hr>";
    }

    if(ulke ==null || ulke.trim().length() ==0){
        eksikAlanlar=eksikAlanlar+"<li>Ülke alanını boş geçemezsiniz.<hr>";
    }

    if(sehir ==null || sehir.trim().length() ==0){
        eksikAlanlar=eksikAlanlar+"<li>Şehir alanını boş geçemezsiniz.<hr>";
    }

if( eksikAlanlar.trim().length() >0){
     request.setAttribute("eksikAlanlar",eksikAlanlar);
    %>
<jsp:forward page="bilgiFormu.jsp"></jsp:forward>
<%
}
%>

<h3><font face=verdana color=green>Girilen değerler geçerlidir.</font></h3>

<table border="5" id="bilgiTablosuSonDurum" >

<tr>
<td width="30%">Adı</td>
<td><input type="text"   name="adi" size="20" value="<%=request.getParameter("adi")%>"></td>
</tr>

<tr>
<td width="30%">Parola</td>
<td><input type="text" name="parola" size="20" value="<%=request.getParameter("parola")%>"></td>
</tr>

<tr>
<td width="30%">Adres</td>
<td><input type="text" name="adres" size="20" value="<%=request.getParameter("adres")%>"></td>
</tr>

<tr>
<td width="30%">Telefon</td>
<td><input type="text" name="telefon" size="20" value="<%=request.getParameter("telefon")%>"></td>
</tr>

<tr>
<td width="30%" >Ülke</td>
<td><input type="text" name="ulke" size="20" value="<%=request.getParameter("ulke")%>"></td>
</tr>

<tr>
<td width="30%">Şehir</td>
<td><input type="text" name="sehir" size="20" value="<%=request.getParameter("sehir")%>"></td>
</tr>

</table>

</body>
</html>