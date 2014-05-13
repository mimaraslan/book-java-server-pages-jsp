<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" %>
<%@ page import="java.util.*" %>

<jsp:useBean id="kahveFasulyesi" class="isbasvurusupaketi.ElemanSinifi" scope="request">
    <jsp:setProperty name="kahveFasulyesi" property="adi"/>
    <jsp:setProperty name="kahveFasulyesi" property="soyadi"/>
    <jsp:setProperty name="kahveFasulyesi" property="adres"/>
    <jsp:setProperty name="kahveFasulyesi" property="cinsiyet"/>
    <jsp:setProperty name="kahveFasulyesi" property="email"/>
    <jsp:setProperty name="kahveFasulyesi" property="kullaniciadi"/>
    <jsp:setProperty name="kahveFasulyesi" property="parola1"/>
    <jsp:setProperty name="kahveFasulyesi" property="parola2"/>
    <jsp:setProperty name="kahveFasulyesi" property="postakodu"/>
    <jsp:setProperty name="kahveFasulyesi" property="tecrubealani"/>
</jsp:useBean>
<% 
   if (kahveFasulyesi.kontrolFonksiyonu()) {
%>
    <jsp:forward page="basarilikayitformu.jsp"/>
<%
   }  else {
%>
    <jsp:forward page="tekrardeneformu.jsp"/>
<%
   }
%>