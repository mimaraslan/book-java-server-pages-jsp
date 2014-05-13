<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Uluslararasılaştırma ve Biçimlendirme</title>
    </head>
    <body>
        <h1>JSTL Uluslararasılaştırma ve Biçimlendirme</h1>
        <h1><c:out value="${pageContext.request.locale}" /></h1>
    </body>
</html>