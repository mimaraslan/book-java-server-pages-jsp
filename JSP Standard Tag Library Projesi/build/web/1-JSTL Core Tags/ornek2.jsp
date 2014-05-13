<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>JSTL c:set - c:remove ve c:out kullanımı</title>
    </head>
    <body>
        <h1>JSTL c:set - c:remove ve c:out kullanımı</h1>
        <c:set var="degisken" value="Güzel gören güzel düşünür.Güzel düşünen, hayatından lezzet alır." />
        <c:out value="${degisken}" />
     <hr>
        <c:remove var="degisken" />
        <c:out value="${degisken}" />
        <c:out value="Mesajımız silinmiş." />
    </body>
</html>
