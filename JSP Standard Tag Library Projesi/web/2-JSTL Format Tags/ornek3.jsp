<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fmt:parseNumber -fmt:parseDate - fmt:setTimeZone Tag</title>
</head>
<body>
        <h3>JSTL fmt:parseNumber :</h3>
    <c:set var="sayimiz" value="1250003.350" />
    <fmt:parseNumber var="parseNumberSayimiz" type="number" value="${sayimiz}" integerOnly="true"/>
    Sayımız : <font color="blue"><c:out value="${sayimiz}" /></font>
    <br>
    fmt:parseNumber ile işlenen Sayımız :
    <font color="red"><c:out value="${parseNumberSayimiz}" /></font>


        <hr><h3>JSTL fmt:parseDate :</h3>
    <c:set var="tarih" value="29-05-2015" />
    <fmt:parseDate value="${tarih}" var="parsedDateEdilmisTarih"  pattern="dd-MM-yyyy" />
    Tarihimiz :
    <font color="blue"><c:out value="${tarih}" /></font>
    <br>
    fmt:parseDate ile işlenen Tarihimiz :
    <font color="red"><c:out value="${parsedDateEdilmisTarih}" /></font>


        <hr><h3>JSTL fmt:setTimeZone :</h3>
    <c:set var="zaman" value="<%=new java.util.Date()%>" />
    Geçerli Tarih ve Saat:
    <font color="blue">
    <fmt:formatDate value="${zaman}" type="both" timeStyle="long" dateStyle="long" />
    </font>
    <br>
    fmt:setTimeZone ile Saat dilimimizi değiştirerek  yapalım :<fmt:setTimeZone value="GMT-16" />
    <font color="green">GMT-16</font>
    <br>
    Değişen Tarih ve Saat :
    <font color="red"><fmt:formatDate value="${zaman}"  type="both" timeStyle="long" dateStyle="long" /></font>

</body>
</html>