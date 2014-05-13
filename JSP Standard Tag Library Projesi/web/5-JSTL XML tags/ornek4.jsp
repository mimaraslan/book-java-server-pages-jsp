<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>JSTL XML Tags</title>
<body>
     <h2>JSTL XML Tags Kullanımı</h2>
     <h2>xsl </h2>
    </body>
</html>



 <c:import   url="students.xml"    var="url" />
 <c:import   url="xsl1.xsl"    var="xsl" />
 <x:transform  xml="${url}" xslt="${xsl}"  />