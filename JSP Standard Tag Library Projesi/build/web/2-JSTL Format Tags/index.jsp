<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Format Tags Kullanımı</title>
    </head>
    <body>
        <h1>JSTL Format Tags Kullanımı</h1>

        <table border="1" width="500">
            <thead>
                <tr>
                    <th>Örneğin Adı</th>
                    <th>Adresi</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Örnek 1:</td>
                    <td><a href="ornek1.jsp">JSTL Uluslararasılaştırma ve Biçimlendirme kullanımı</a></td>
                </tr>
                <tr>
                    <td>Örnek 2:</td>
                    <td><a href="ornek2.jsp">fmt:setLocale - fmt:formatDate - fmt:timeZone - fmt:formatNumber</a></td>
                </tr>
                <tr>
                    <td>Örnek 3:</td>
                    <td><a href="ornek3.jsp">fmt:parseNumber -fmt:parseDate - fmt:setTimeZone</a></td>
                </tr>
                <tr>
                    <td>Örnek 4:</td>
                    <td><a href="ornek4.jsp">fmt:bundle - fmt:setBundle - fmt:message</a></td>
                </tr>
                 <tr>
                    <td>Örnek 5:</td>
                    <td><a href="ornek5.jsp">fmt:requestEncoding</a></td>
                </tr>
            </tbody>
        </table>



    </body>
</html>
