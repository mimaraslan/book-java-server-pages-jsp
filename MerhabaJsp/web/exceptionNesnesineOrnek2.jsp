<%-- 
    Document   : exceptionNesnesineOrnek2
    Created on : 11.01.2010, 0:10:21
    Author     : M.ASLAN
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" errorPage="exceptionHataSayfasi.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type"  content="text/html; charset=UTF-8">

<title>exception Nesnesinin Kullanımına Örnek 2</title>

</head>

<body>

<%

int sayi1=1453, sayi2=0, sonuc ;
sonuc=sayi1/sayi2;

out.println(sonuc);

%>

</body>

</html>