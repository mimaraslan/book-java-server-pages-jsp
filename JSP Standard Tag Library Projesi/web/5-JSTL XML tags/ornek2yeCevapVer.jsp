<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="../4-JSTL SQL Tags/style.css">
         <title>JSTL XML Tags</title>
<body>
     <h2>JSTL XML Tags Kullanımı </h2>
      <h2>x:forEach - x:if - x:out</h2>
     
 <c:import  url="arabalar.xml"   var="url" />
 <x:parse   xml="${url}"   var="XmlBelgesi"/>

  <table border="1">
     <thead>
         <tr>
             <th><b>MARKASI</b></th>
             <th><b>MODELİ</b></th>
             <th><b>RENGİ</b></th>
         </tr>
     </thead>
     <tbody>

 <c:set var="markaadiGelen" value="${param.markaadi}"/>

 <x:forEach var="otomobil" select="$XmlBelgesi/arabalar/araba">
     <x:if select="$otomobil/marka=$markaadiGelen" >
         <c:set var="otomobilinAdi" value="XMLdeBulunmuyor" />
         <tr>
             <td><font color="red"><x:out select="$otomobil/marka"/></font></td>
             <td><font color="red"><x:out select="$otomobil/model"/></font></td>
             <td><font color="red"><x:out select="$otomobil/renk"/></font></td>
         </tr> 
    </x:if>
 </x:forEach>

  <c:if test="${otomobilinAdi!='XMLdeBulunmuyor'}">
     <tr>
         <td><font color="red"><c:out value="${param.markaadi} Marka XML de bulunmamaktadır."  /></font></td>
         <td><font color="red"><c:out value="-"/></font></td>
         <td><font color="red"><c:out value="-"/></font></td>
     </tr>
  </c:if>




      </tbody>
 </table>








</body>
</html>