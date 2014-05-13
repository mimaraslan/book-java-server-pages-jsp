<%-- 
    Document   : exceptionHataSayfasi
    Created on : 08.01.2010, 23:13:24
    Author     : M.ASLAN
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">
<title>exception Hata Sayfası</title>
</head>

<body>

<h3>
 <font face="arial" color="red">
     Oluşan Hata :
 </font>

 <font face="arial" color="green">
     <%=exception.toString() %>
 </font>
</h3>

</body>

</html>