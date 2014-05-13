<%--
    Document   : ornek7
    Created on : 14.Kas.2010, 12:40:06
    Author     : MASLAN
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL c:import kullanımı</title>
    </head>
    <body>
        <h1>JSTL c:import kullanımı</h1>
       <c:import url="ornek1.jsp" />
       <hr>
       <c:import url="ornek2.jsp" />
       <hr>
       <c:import url="ornek7.html"/>

    </body>
</html>