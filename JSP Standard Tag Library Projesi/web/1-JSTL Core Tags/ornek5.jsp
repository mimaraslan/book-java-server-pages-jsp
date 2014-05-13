<%-- 
    Document   : ornek5
    Created on : 13.Kas.2010, 20:40:46
    Author     : MASLAN
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL c:forEach - c:forTokens kullanımı</title>
    </head>
    <body>
        <h1>JSTL c:forEach - c:forTokens kullanımı</h1>

    <h3>JSTL c:forEach kullanımı</h3>
    <c:forEach var="for_each_icin_parcalarina_ayir" items="${param.for_each_icin_parametre_adi}" >
    <c:out value="${for_each_icin_parcalarina_ayir}" />
    <br>
    </c:forEach>
<hr>
    <h3>JSTL c:forTokens kullanımı</h3>
    <c:forTokens var="for_token_icin_parcalarina_ayir" items="${param.for_token_icin_parametre_adi}" delims=";">
    <c:out value="${for_token_icin_parcalarina_ayir}" />
    <br>
    </c:forTokens>

    </body>
</html>
