<jsp:useBean id="kahveFasulyesi" class="isbasvurusupaketi.ElemanSinifi" scope="request"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
       <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>İş başvurusu için kayıt formu</title>
       </head>
<body>

<table cellpadding=1 cellspacing=1 border="7" >

<th bgcolor="CCCCFF" colspan=2>
    <font size=6 color="green">Kayıt başarılı</font>
</th>

<tr bgcolor="CCFF66">
    <td valign=top>
        <b><font size=3 color="darkblue">Adı</font></b>   <br>
    <jsp:getProperty name="kahveFasulyesi" property="adi"/>
    </td>
    <td valign=top>
        <b><font size=3 color="darkblue">Soyadı</font></b>  <br>
        <jsp:getProperty name="kahveFasulyesi" property="soyadi"/>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td valign=top>
        <b><font size=3 color="darkblue">E-Mail</font></b> <br>
    <jsp:getProperty name="kahveFasulyesi" property="email"/> </td>
    <td valign=top>
        <b><font size=3 color="darkblue">Posta Kodu</font></b> <br>
        <jsp:getProperty name="kahveFasulyesi" property="postakodu"/>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td valign=top >
        <b><font size=3 color="darkblue">Kullanıcı Adı</font></b> <br>
        <jsp:getProperty name="kahveFasulyesi" property="kullaniciadi"/>
    </td>
    <td valign=top>
        <b><font size=3 color="darkblue">Cinsiyetiniz</font></b>  <br>
        <jsp:getProperty name="kahveFasulyesi" property="cinsiyet"/>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td valign=top colspan=2>
        <b><font size=3 color="darkblue">Adres</font></b> <br>
        <jsp:getProperty name="kahveFasulyesi" property="adres"/>
    </td>
</tr>

<tr bgcolor="CCFF66">
    <td colspan=2 valign=top>
        <b><font size=3 color="darkblue">Tecrübeli olduğunuz alanlar</font></b>   <br>
        <%
          String[] tecrubealani = kahveFasulyesi.getTecrubealani();
          if (!tecrubealani[0].equals("1")) {
            out.println("<ul>");
            for (int i=0; i<tecrubealani.length; i++)
              out.println("<li>"+tecrubealani[i]);
            out.println("</ul>");
          } else out.println("Nothing was selected");
        %>
    </td>
</tr>

</table>
</body>
</html>