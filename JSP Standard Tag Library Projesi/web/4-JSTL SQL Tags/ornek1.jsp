<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
         <title>JSTL SQL Tagları ile MySQL Veritabanı Bağlantısı 1</title>
    </head>
    <body>
        <h2>JSTL SQL Tagları ile MySQL Veritabanı Bağlantısı 1</h2>

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
    <!-- Kolonların Başlıkları -->
    <tr>
        <c:forEach var="kolonBasligi" items="${sorgu.columnNames}">
            <th><c:out value="${kolonBasligi}"/></th>
        </c:forEach>
    </tr>
    <!-- Kolonların Bilgileri -->
    <c:forEach var="satir" items="${sorgu.rowsByIndex}">
        <tr>
            <c:forEach var="kolon" items="${satir}">
                <td><c:out value="${kolon}"/></td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>

    </body>
</html>