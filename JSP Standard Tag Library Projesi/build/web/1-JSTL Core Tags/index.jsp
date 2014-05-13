<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Standard Tag Library Kullanımı</title>
    </head>
    <body>
        <h1>JSP Standard Tag Library Kullanımı</h1>

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
                    <td><a href="ornek1.jsp">JSTL c:out kullanımı</a></td>
                </tr>
                 <tr>
                    <td>Örnek 2:</td>
                    <td><a href="ornek2.jsp">JSTL c:set - c:remove ve c:out kullanımı</a></td>
                </tr>
                <tr>
                    <td>Örnek 3:</td>
                    <td><a href="ornek3.jsp?gecerlilikdenetimi=true&adisoyadi=CemCapan&puani=10">
                            JSTL c:if kullanımı</a></td>
                </tr>
                 <tr>
                    <td>Örnek 4:</td>        
                    <td>
                        <c:url value="ornek4.jsp" var="gonderilecekParametreler">
                            <c:param name="adi" value="Veysel Hyung" />
                            <c:param name="soyadi" value="Ece" />
                            <c:param name="parola" value="1453" />
                            <c:param name="yasi" value="21" />
                        </c:url>
                        <a href='<c:out value="${gonderilecekParametreler}" />'>JSTL c:url - c:param kullanımı</a>
                    </td>
                </tr>
                 <tr>
                    <td>Örnek 5:</td>
                    <td>
                        <c:url value="ornek5.jsp" var="gonderilecekParametreler">
                        <c:param name="for_each_icin_parametre_adi" value="Arda,Sayar" />
                        <c:param name="for_token_icin_parametre_adi" value="ARDA SAYAR ;babacan adam;gibi adam" />
                        </c:url>
                        <a href='<c:out value="${gonderilecekParametreler}" />'>JSTL c:forEach - c:forTokens kullanımı</a>
                    </td>
                </tr>
                 <tr>
                    <td>Örnek 6:</td>
                    <td>JSTL c:choose - c:when - c:otherwise kullanımı<br>
                       <form action="ornek6.jsp" method="post">
                        <input size="5" type="text" name="baslangicSayisi"/>Başlangıç Sayısı<br>
                        <input size="5" type="text" name="bitisSayisi"/>Bitiş Sayısı<br>
                        <input size="5" type="text" name="artisMiktari"/>Artış Miktarı<br>
                        <input type="submit" value=" Hemen Gönder " name="gonder" />
                       </form>
                    </td>
                </tr>
                 <tr>
                    <td>Örnek 7:</td>
                    <td><a href="ornek7.jsp">JSTL c:import kullanımı</a></td>
                </tr>
                 <tr>
                    <td>Örnek 8:</td>
                    <td><a href="ornek8.jsp">JSTL c:redirect kullanımı</a></td>
                </tr>
            </tbody>
        </table>

    </body>
</html>