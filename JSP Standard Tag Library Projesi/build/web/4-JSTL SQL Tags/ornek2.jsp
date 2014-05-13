<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
         <title>JSTL SQL Tagları ile MySQL Veritabanı Bağlantısı 2</title>
    </head>
    <body>
        <h2>JSTL SQL Tagları ile MySQL Veritabanı Bağlantısı 2</h2>

  <sql:query var="sorgu" dataSource="jdbc/JSPStandardTagLibraryProjesiDatasource">
    SELECT
    `musteri_bilgileri`.`musteri_id`,
    `musteri_bilgileri`.`musteri_no`,
    `musteri_bilgileri`.`musteri_adi`,
    `musteri_bilgileri`.`musteri_soyadi`,
    `musteri_bilgileri`.`musteri_meslegi`,
    `musteri_bilgileri`.`musteri_email`
    FROM `magazatakibi`.`musteri_bilgileri`;
</sql:query>

<table border="1">
    <thead>
        <tr>
            <th>Müşteri Bilgileri</th>
        </tr>
    </thead>

    <tbody>
        <tr>
            <td>
                Bu sayfadan diğer sayfaya değer göndereceğiz.
            </td>
        </tr>
        <tr>
            <td>
                <form action="ornek2yeCevapVer.jsp">
                    <strong>Müşteri Adı Soyadı:</strong>

                    <select name="musteri_id">
                       <c:forEach var="adisoyadiDegerleri" items="${sorgu.rows}">
                         <option value="${adisoyadiDegerleri.musteri_id}">${adisoyadiDegerleri.musteri_adi} ${adisoyadiDegerleri.musteri_soyadi}</option>
                       </c:forEach>
                    </select>

                    <input type="submit" value="Gönder" name="gonder" />
                </form>
            </td>
        </tr>

    </tbody>
</table>

    </body>
</html>