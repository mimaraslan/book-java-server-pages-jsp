<%--
    Document   : ornek6
    Created on : 13.Kas.2010, 21:45:16
    Author     : MASLAN
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL c:choose - c:when - c:otherwise kullanımı</title>
    </head>
    <body>
        <h2>JSTL c:choose - c:when - c:otherwise kullanımı</h2>

<c:forEach var="i" begin="${param.baslangicSayisi}" end="${param.bitisSayisi}" step="${param.artisMiktari}">
<c:choose>
<c:when test="${i < 10}"><c:out value="${i}" /> (Bebeklik Çağı)<br></c:when>
<c:when test="${i < 15}"><c:out value="${i}" /> (Çocukluk Çağı)<br></c:when>
<c:when test="${i < 18}"><c:out value="${i}" /> (Delikanlılık Çağı)<br></c:when>
<c:when test="${i < 30}"><c:out value="${i}" /> (Gençlik Çağı)<br></c:when>
<c:when test="${i < 60}"><c:out value="${i}" /> (Olgunluk Çağı)<br></c:when>
<c:when test="${i < 90}"><c:out value="${i}" /> (Emeklilik Çağı)<br></c:when>
<c:when test="${i < 100}"><c:out value="${i}" /> (İhtiyarlık Çağı)<br></c:when>
<c:when test="${i < 120}"><c:out value="${i}" /> (Kabir Hayatı)<br></c:when>
<c:otherwise><c:out value="${i}" /> (Öteki Dünyadan Selam Olsun :)) )<br></c:otherwise>
</c:choose>
</c:forEach>

    </body>
</html>