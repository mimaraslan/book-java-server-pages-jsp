<jsp:useBean id="kahveFasulyesi" class="isbasvurusupaketi.ElemanSinifi" scope="request"/>
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
    <font size=5>İş başvurusu için kayıt formu</font>
    <br>
    <font size=2 color="red"><sup>*</sup> Yıldızlı alanlar boş geçilmez.</font>
</th>

<tr bgcolor="CCFF66">
    <td valign=top>
        <b>Adı<font size=2 color="red"><sup>*</sup></font></b>  <br>
        <input type="text" name="adi" value="<%=kahveFasulyesi.getAdi()%>" size=30 maxlength=30/>
        <br><font size=2 color=red><%=kahveFasulyesi.getHataMesajlari("adi")%></font>
    </td>
    <td  valign=top>
        <b>Soyadı<font size=2 color="red"><sup>*</sup></font></b>  <br>
        <input type="text" name="soyadi" value="<%=kahveFasulyesi.getSoyadi()%>" size=30 maxlength=30/>
        <br><font size=2 color=red><%=kahveFasulyesi.getHataMesajlari("soyadi")%></font>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td valign=top>
        <b>E-Mail<font size=2 color="red"><sup>*</sup></font></b>    <br>
        <input type="text" name="email" value="<%=kahveFasulyesi.getEmail()%>" size=30  maxlength=100/>
        <br><font size=2 color=red><%=kahveFasulyesi.getHataMesajlari("email")%></font>
    </td>
    <td  valign=top>
        <b>Posta Kodu<font size=2 color="red"><sup>*</sup></font></b>   <br>
        <input type="text" name="postakodu" value="<%=kahveFasulyesi.getPostakodu()%>" size=30  maxlength=10/>
        <br><font size=2 color=red><%=kahveFasulyesi.getHataMesajlari("postakodu")%></font>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td valign=top >
        <b>Kullanıcı Adı<font size=2 color="red"><sup>*</sup></font></b>   <br>
        <input type="text" name="kullaniciadi" size=30  maxlength=30 value="<%=kahveFasulyesi.getKullaniciadi()%>"/>
        <br><font size=2 color=red><%=kahveFasulyesi.getHataMesajlari("kullaniciadi")%></font>
    </td>
    <td  valign=top>
        <b>Cinsiyetiniz</b>   <br>
        <input type="radio" name="cinsiyet" value="Erkek" <%=kahveFasulyesi.secilenCinsiyet("Erkek")%>>Erkek
        <input type="radio" name="cinsiyet" value="Bayan" <%=kahveFasulyesi.secilenCinsiyet("Bayan")%>> Bayan
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td valign=top>
        <b>Parola<font size=2 color="red"><sup>*</sup></font></b> <br>
        <input type="password" name="parola1" size=30 maxlength=30 value="<%=kahveFasulyesi.getParola1()%>"/>
        <br><font size=2 color=red><%=kahveFasulyesi.getHataMesajlari("parola1")%></font>
    </td>
    <td  valign=top>
        <b>Tekrar Parola<font size=2 color="red"><sup>*</sup></font></b> <br>
        <input type="password" name="parola2" size=30  maxlength=30 value="<%=kahveFasulyesi.getParola2()%>"/>
        <br><font size=2 color=red><%=kahveFasulyesi.getHataMesajlari("parola2")%></font>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td  valign=top colspan=2>
        <b>Adres<font size=2 color="red"><sup>*</sup></font></b>  <br>
        <input type="text" name="adres" size=65  maxlength=65 value="<%=kahveFasulyesi.getAdres()%>"/>
        <br><font size=2 color=red><%=kahveFasulyesi.getHataMesajlari("adres")%></font>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td  valign=top colspan=2>
        <b>Tecrübeli olduğunuz alanlar?</b>
        <br>
        <input type="checkbox" name="tecrubealani" value="Java"
        <%=kahveFasulyesi.secilenTecrubeler("Java")%>>
        <font size=2 color="red"><strong>Java</strong></font>

        <input type="checkbox" name="tecrubealani" value="JSP"
        <%=kahveFasulyesi.secilenTecrubeler("JSP")%>>
        <font size=2 color="red"><strong>JSP</strong></font>

        <input type="checkbox" name="tecrubealani" value="NetBeans IDE"
        <%=kahveFasulyesi.secilenTecrubeler("NetBeans IDE")%>>
        <font size=2 color="red"><strong>NetBeans IDE</strong></font>
        <br>
        <input type="checkbox" name="tecrubealani" value="Struts"
        <%=kahveFasulyesi.secilenTecrubeler("Struts")%>>Struts

        <input type="checkbox" name="tecrubealani" value="Spring"
        <%=kahveFasulyesi.secilenTecrubeler("Spring")%>>Spring

        <input type="checkbox" name="tecrubealani" value="JavaServer Faces"
        <%=kahveFasulyesi.secilenTecrubeler("JavaServer Faces")%>>JavaServer Faces <br>

        <input type="checkbox" name="tecrubealani" value="Hibernate"
        <%=kahveFasulyesi.secilenTecrubeler("Hibernate")%>>Hibernate

        <input type="checkbox" name="tecrubealani" value="Servlets"
        <%=kahveFasulyesi.secilenTecrubeler("Servlets")%>>Servlets

        <input type="checkbox" name="tecrubealani" value="Eclipse IDE"
        <%=kahveFasulyesi.secilenTecrubeler("Eclipse IDE")%>>Eclipse IDE  <hr>

        <input type="checkbox" name="tecrubealani" value="MySql"
        <%=kahveFasulyesi.secilenTecrubeler("MySql")%>>MySql
        <font size=2 color="red"><strong>MySql</strong></font>

        <input type="checkbox" name="tecrubealani" value="Oracle"
        <%=kahveFasulyesi.secilenTecrubeler("Oracle")%>>Oracle

        <input type="checkbox" name="tecrubealani" value="SqlSever"
        <%=kahveFasulyesi.secilenTecrubeler("SqlSever")%>>SqlSever
    </td>
</tr>

    <tr bgcolor="CCCCFF">
        <td  align=right colspan=2>
            <input type="reset" value="Temizle" disabled="true">
            <input type="submit" value="Gönder">
        </td>
    </tr>

</table>

</form>
</body>
</html>
