<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


</head>

<body>

<jsp:useBean id="fasulye" class="kayitpaketi.GirilenDegerleriKontrolEdenSinif" />

<jsp:setProperty name="fasulye" property="kullaniciadimiz"/>
<jsp:setProperty name="fasulye" property="parolamiz"/>

<%
kayitpaketi.GirilenDegerleriKontrolEdenSinif denetlemeNesnesi=(kayitpaketi.GirilenDegerleriKontrolEdenSinif)pageContext.getAttribute("fasulye");

denetlemeNesnesi.hatalariKontrolEdenFonksiyon(request);

String hatalar= (String)request.getAttribute("hatalar");

if(hatalar !=null &&  hatalar.trim().length() >0){
%>
<jsp:forward page="kayitFormu.jsp"></jsp:forward>
<%
}
%>

<h3><font face=verdana color=green>Girilen degerler gecerlidir.</font></h3>


        <table border="1" width="20%" >

<tr>
<td width="30%" >Adı</td>
  <td width="70%"><strong><%=denetlemeNesnesi.getkullaniciadimiz() %></strong></td>
</tr>

<tr>
  <td >Parola</td>
  <td><strong><%=denetlemeNesnesi.getparolamiz() %></strong></td>
</tr>
</table>

<h3><font face=verdana color=darkblue>Beans(Fasulyeler)ini Alan Form</font></h3>
  <a href="kayitFormu.jsp">Kayıt Formuna Dönmek için Tıklayınız.</a>

</body>
</html>