<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL c:url - c:param kullanımı</title>
    </head>
    <body>
        <h1>JSTL c:url - c:param kullanımı</h1>

            <b>Adı Soyadı :</b>${param.adi} ${param.soyadi}
            <br>
            <b>Parolası :</b>${param.parola}
            <br>
            <b>Yaşı :</b>${param.yasi}

    </body>
</html>
