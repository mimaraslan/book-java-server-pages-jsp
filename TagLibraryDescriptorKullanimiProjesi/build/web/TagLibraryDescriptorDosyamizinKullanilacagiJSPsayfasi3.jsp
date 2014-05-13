<%-- 
    Document   : TagLibraryDescriptorDosyamizinKullanilacagiJSPsayfasi3
    Created on : 27.Ekm.2010, 23:41:55
    Author     : M.ASLAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/WEB-INF/tlds/TagLibraryDescriptorDosyamiz3.tld" prefix="onEkimiz3" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Tag Library Descriptor TLD Kullanımı 3</title>

        <title>JSP Page</title>
    </head>
    <body>
    

     <h1><p align="center" style="color:brown">
    Tag Library Descriptor TLD Kullanımı 3
    </p></h1>

 <h1><p align="center" style="color:red">
    <onEkimiz3:TagLibraryDescriptorDosyamiz3>
JSP Tag dan gelen tarih :<%= zaman%>
    </onEkimiz3:TagLibraryDescriptorDosyamiz3>
</p></h1>

    </body>
</html>