<%-- 
    Document   : formKontroluJavascript
    Created on : 13.01.2010, 1:37:04
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Javascript ve JSP </title>
   </head>

<script>

function formuKontrolEdenFonksiyon(form){
//--------------------------------
if(form.adi.value==''){

    alert ("Adı alanını boş geçemezsiniz.");
    return false;
}
//--------------------------------
if(form.soyadi.value==''){

    alert ("Soyadı alanını boş geçemezsiniz.");
    return false;
}
//--------------------------------
if(form.cinsiyet.value==''){

    alert ("Cinsiyet alanını boş geçemezsiniz.");
    return false;
}
//--------------------------------
if(form.telefon.value==''){

    alert ("Telefon alanını boş geçemezsiniz.");
    return false;

}
//--------------------------------
if(form.adres.value==''){

    alert ("Adres alanını boş geçemezsiniz.");
    return false;
}
//--------------------------------
if(form.ulke.value==''){

    alert ("Ülke alanını boş geçemezsiniz.");

    return false;
}
//--------------------------------
if(form.meslek.value==''){

    alert ("Meslek alanını boş geçemezsiniz.");
    return false;
}
//--------------------------------
if(form.tecrube.value==''){

    alert ("Tecrübe yılı alanını boş geçemezsiniz.");
    return false;

}
//--------------------------------
}
</script>

 
    <body>

<p align="left"><b>Kayıt Formu</b></p>

<form name="formKontroluJavascript" method="POST" action="formKontroluJavascriptiAl.jsp"
      onsubmit="return formuKontrolEdenFonksiyon(document.formKontroluJavascript); ">

<table border="1" width="41%" cellspacing="1" cellpadding="0" id="table1">

<tr>
<td width="33%">Adı</td>
<td width="67%"><input type="text" name="adi" size="30" id="adi"></td>
</tr>

<tr>
<td width="33%">Soyadı</td>
<td><input type="text" name="soyadi" size="30" id="soyadi"></td>
</tr>

<tr>
<td width="33%">Telefonu</td>
<td><input type="text" name="telefon" size="30" id="telefon"></td>
</tr>

<tr>
<td width="33%">Cinsiyeti</td>
<td><input name="cinsiyet" type="radio" value="Bayan" >Bayan
    <input name="cinsiyet" type="radio" value="Erkek" checked>Erkek
</td>
</tr>

<tr>
<td width="33%">Adres</td>
<td><textarea name="adres" cols="20" rows="2" id="adres"></textarea></td>
</tr>

<tr>
  <td width="33%">Ülke</td>
  <td><select name="ulke" size="1" id="ulke">
    <option value="" selected>Lütfen ülkenizi seçiniz.</option>
    <option value="Turkiye">Türkiye </option>
    <option value="Ukrayna">Ukrayna</option>
    <option value="Norvec">Norveç</option>
    <option value="Kanada">Kanada</option>
    <option value="Rusya">Rusya</option>
  </select></td>

</tr>
<tr>
  <td>Meslek</td>
  <td><select name="meslek" size="1" id="meslek">
    <option value="" selected>Lütfen mesleğinizi seçiniz.</option>
    <option value="Bilgisayar Muhendisi">Bilgisayar Mühendisi</option>
    <option value="Hakim">Hakim</option>
    <option value="Ogretmen">Öğretmen</option>
    <option value="Doktor">Doktor</option>
    <option value="Hemsire">Hemşire</option>
    <option value="Ekomomist">Ekomomist</option>
</select></td>
</tr>

<tr>
  <td>Tecrübe Yılı</td>
  <td><select name="tecrube" size="1" id="tecrube">
    <option value="">Lütfen tecrübe yılızı seçiniz.</option>
    <option value="0  -  2  YIL">0  -  2  YIL</option>
    <option value="2  -  5  YIL">2  -  5  YIL</option>
    <option value="5  -  7  YIL">5  -  7  YIL</option>
    <option value="7  -  9  YIL">7  -  9  YIL</option>
    <option value="9  -  11 YIL">9  -  11 YIL</option>
    <option value="11 -  ...">11 -  ...</option>
  </select></td>
</tr>

</table>

<p><input type="submit" value="Değerleri Gönder" name="GonderDugmesi">
    <input type="reset" value="Sıfırla" name="SifirlaDugmesi"></p>

</form>

    </body>
</html>
