<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>İş başvurusu için kayıt formu</title>
    </head>
<body>

<form action="../javabeansOrnek4/degerlendirmeformu.jsp" method="post">
<table cellpadding=4 cellspacing=3 border=7>
<th bgcolor="CCCCFF" colspan=2>
    <font size=5>İş başvurusu için kayıt formu </font>        <br>
    <font size=2 color="red"><sup>*</sup> Yıldızlı alanlar boş geçilmez.</font>
</th>

<tr bgcolor="CCFF66">
    <td valign=top>
        <b>Adı<font size=2 color="red"><sup>*</sup></font></b> <br>
        <input type="text" name="adi" value="" size=30 maxlength=30>
    </td>
    <td  valign=top>
        <b>Soyadı<font size=2 color="red"><sup>*</sup></font></b> <br>
        <input type="text" name="soyadi" value="" size=30 maxlength=30>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td valign=top>
        <b>E-Mail<font size=2 color="red"><sup>*</sup></font></b> <br>
        <input type="text" name="email" value="" size=30  maxlength=100>
    </td>
    <td  valign=top>
        <b>Posta Kodu<font size=2 color="red"><sup>*</sup></font></b> <br>
        <input type="text" name="postakodu" value="" size=30  maxlength=10>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td valign=top >
        <b>Kullanıcı Adı<font size=2 color="red"><sup>*</sup></font></b> <br>
        <input type="text" name="kullaniciadi" size=30  maxlength=30 value="" >
    </td>
    <td  valign=top >
    <b>Cinsiyetiniz</b>  <br>
        <input type="radio" name="cinsiyet" value="Erkek" checked>Erkek
        <input type="radio" name="cinsiyet" value="Bayan" >Bayan
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td valign=top>
        <b>Parola<font size=2 color="red"><sup>*</sup></font></b>  <br>
        <input type="password" name="parola1" size=30 maxlength=30 value="" >
    </td>
    <td  valign=top>
        <b>Tekrar Parola<font size=2 color="red"><sup>*</sup></font></b>  <br>
        <input type="password" name="parola2" size=30  maxlength=30 value="">
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td  valign=top colspan=2>
        <b>Adres<font size=2 color="red"><sup>*</sup></font></b>  <br>
        <input type="text" name="adres" size=65  maxlength=65 value="" >
    </td>
</tr>


<tr bgcolor="CCFF66">
    <td  valign=top colspan=2>
        <b>Tecrübeli olduğunuz alanlar?</b>   <br>
        <input type="checkbox" name="tecrubealani" value="Java">
        <font size=2 color="red"><strong>Java</strong></font>

        <input type="checkbox" name="tecrubealani" value="JSP">
        <font size=2 color="red"><strong>JSP</strong></font>

        <input type="checkbox" name="tecrubealani" value="NetBeans IDE">
        <font size=2 color="red"><strong>NetBeans IDE</strong></font>  <br>

        <input type="checkbox" name="tecrubealani" value="Struts">Struts
        <input type="checkbox" name="tecrubealani" value="Spring">Spring
        <input type="checkbox" name="tecrubealani" value="JavaServer Faces">JavaServer Faces<br>

        <input type="checkbox" name="tecrubealani" value="Hibernate">Hibernate
        <input type="checkbox" name="tecrubealani" value="Servlets">Servlets
        <input type="checkbox" name="tecrubealani" value="Eclipse IDE">Eclipse IDE <hr>

        <input type="checkbox" name="tecrubealani" value="MySql">
        <font size=2 color="red"><strong>MySql</strong></font>

        <input type="checkbox" name="tecrubealani" value="Oracle">Oracle
        <input type="checkbox" name="tecrubealani" value="SqlSever">SqlSever
    </td>
</tr>

<tr bgcolor="CCCCFF">
    <td  align=right colspan=2>
        <input type="reset" value="Temizle">
        <input type="submit" value="Gönder">
    </td>
</tr>

</table>

</form>
</body>
</html>