<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="selamJavaBeansPaketi.SelamlamaSinifi" %>
<%@ page info="Selam JavaBeans" %>

<jsp:useBean id="bizimFasulyemiz" scope="page"  class="selamJavaBeansPaketi.SelamlamaSinifi" />
<jsp:setProperty name="bizimFasulyemiz" property="*" />

<html>
<head><title>Selam JavaBeans</title></head>
<body bgcolor="#ffffff" background="resimler/zemin.gif">

<%@ include file="selamJavabeansEkSayfasi.jsp" %>

<table border="0" width="700">
<tr>
<td width="10"> &nbsp; </td>
<td width="550">
<h3>Lütfen adınızı soyadınızı ve selamlama mesajınızı giriniz.</h3>
</td>
</tr>
<tr>
<td width="10" &nbsp; </td>
<td width="550">

    <form name="selamJavabeansFormu" method="get" action="selamJavaBeans.jsp" >
    
 <table border="0" width="400"  >

     <tr>
<td><strong>Ad :</strong></td>
<td><input type="text" name="isim" size="40"/> </td>
</tr>

<tr>
<td><strong>Soyadı :</strong></td>
<td><input type="text" name="soyisim" size="40"/> </td>
</tr>

<tr>
<td><strong>Mesaj :</strong></td>
<td><input type="text" name="mesaj" size="40"/> </td>
</tr>

<tr>
<td><strong>&nbsp;</strong></td>
<td><strong>&nbsp;</strong></td>
</tr>

<tr>
<td></td>
<td><input type="reset" value="Temizle"/>
<input type="submit" value="Tamam "/></td>
</tr>

</table>
 
</td>
</tr>
</form>
</table>


<%@ include file="selamJavabeansCevapSayfasi.jsp" %>


</body>
</html>