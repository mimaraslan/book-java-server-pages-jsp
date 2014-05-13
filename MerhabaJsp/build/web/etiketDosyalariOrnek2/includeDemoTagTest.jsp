<%@ taglib prefix="easy" tagdir="/WEB-INF/tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

 included.html:<%@ include file="included.html" %>
<br/>
<br/>
 included.tagf:<%@ include file="included.tagf" %>
The included.html file looks like this:
<easy:includeDemoTag/>
    </body>
</html>
