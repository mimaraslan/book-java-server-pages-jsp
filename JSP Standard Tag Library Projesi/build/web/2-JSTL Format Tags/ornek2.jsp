<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Uluslararasılaştırma ve Biçimlendirme</title>
    </head>
    <body>

    <h3>fmt:setLocale - fmt:formatDate - fmt:timeZone - fmt:formatNumber</h3>

        <jsp:useBean id="zaman" class="java.util.Date" />

        <fmt:setLocale value="tr" /><strong>TÜRKÇE :</strong>
        <fmt:formatDate value="${zaman}" type="both" dateStyle="full" timeStyle="default" />
        <br>
        <fmt:timeZone value="GMT">
         <fmt:formatDate value="${zaman}" type="both" pattern="dd/MMMM/yyyy, EEEE, HH:mm:ss, z" />
        </fmt:timeZone>
        <br>
        <fmt:formatNumber value="${zaman.time}" />
        <br>
        <fmt:formatNumber value="5400" type="currency" minFractionDigits="2" maxIntegerDigits="10" />

        <hr>
         <fmt:setLocale value="ar" /><strong>ARAPÇA :</strong>
        <fmt:formatDate value="${zaman}" type="both" dateStyle="full" timeStyle="default" />
        <br>
        <fmt:timeZone value="GMT">
         <fmt:formatDate value="${zaman}" type="both" pattern="dd/MMMM/yyyy, EEEE, HH:mm:ss, z" />
        </fmt:timeZone>
        <br>
        <fmt:formatNumber value="${zaman.time}" />
        <br>
        <fmt:formatNumber value="5400" type="currency" minFractionDigits="2" maxIntegerDigits="10" />


        <hr>
         <fmt:setLocale value="en_GB" /><strong>İNGİLTERE :</strong>
        <fmt:formatDate value="${zaman}" type="both" dateStyle="full" timeStyle="default" />
        <br>
        <fmt:timeZone value="GMT">
         <fmt:formatDate value="${zaman}" type="both" pattern="dd/MMMM/yyyy, EEEE, HH:mm:ss, z" />
        </fmt:timeZone>
        <br>
        <fmt:formatNumber value="${zaman.time}" />
        <br>
        <fmt:formatNumber value="5400" type="currency" minFractionDigits="2" maxIntegerDigits="10" />

        <hr>
         <fmt:setLocale value="ru_RU" /><strong>RUSYA :</strong>
        <fmt:formatDate value="${zaman}" type="both" dateStyle="full" timeStyle="default" />
        <br>
        <fmt:timeZone value="GMT">
         <fmt:formatDate value="${zaman}" type="both" pattern="dd/MMMM/yyyy, EEEE, HH:mm:ss, z" />
        </fmt:timeZone>
        <br>
        <fmt:formatNumber value="${zaman.time}" />
        <br>
        <fmt:formatNumber value="5400" type="currency" minFractionDigits="2" maxIntegerDigits="10" />


        <hr>
         <fmt:setLocale value="ja_JP" /><strong>JAPONYA :</strong>
        <fmt:formatDate value="${zaman}" type="both" dateStyle="full" timeStyle="default" />
        <br>
        <fmt:timeZone value="GMT">
         <fmt:formatDate value="${zaman}" type="both" pattern="dd/MMMM/yyyy, EEEE, HH:mm:ss, z" />
        </fmt:timeZone>
        <br>
        <fmt:formatNumber value="${zaman.time}" />
        <br>
        <fmt:formatNumber value="5400" type="currency" minFractionDigits="2" maxIntegerDigits="10" />

    </body>
</html>
