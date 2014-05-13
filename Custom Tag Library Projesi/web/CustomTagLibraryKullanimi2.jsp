<%-- 
    Document   : CustomTagLibraryKullanimi2
    Created on : 19.Ekm.2010, 17:18:52
    Author     : M.ASLAN
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Custom Tag Library Kullanımı2</title>
    </head>
    <body>
        <h1>Custom Tag Library Kullanımı2</h1>
 <%@ taglib uri="/WEB-INF/tlds/TagLibraryDescriptorTLD2.tld" prefix="onEkimiz2" %>
 <h1>CustomTagLibraryKullanimiTLD :<br> <onEkimiz2:TLDisimi1/></h1>
 <hr>
  <h2>TagLibraryDescriptorTLD2 : <br><onEkimiz2:TLDisimi2/></h2>
    </body>
</html>