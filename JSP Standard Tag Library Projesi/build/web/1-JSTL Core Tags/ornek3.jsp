<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL c:if kullanımı</title>
    </head>
    <body>
        <h1>JSTL c:if kullanımı</h1>
      <h2>
        <c:if test="${param.gecerlilikdenetimi}">
        Geçerlilik gecerlilik denetimi : ${param.gecerlilikdenetimi}
        </c:if>
        <br>

        <c:if test="${param.adisoyadi != null}">
        Adı Soyadı null değilse? != null : ${param.adisoyadi}
        </c:if>
        <br>

        <c:if test="${param.adisoyadi ne null}">
        Adı Soyadı null değilse? ne null : ${param.adisoyadi}
        </c:if>
        <br>

        <c:if test="${not empty(param.adisoyadi)}">
         Adı Soyadı boş değilse? : ${param.adisoyadi}
        </c:if>
        <br>

        <c:if test="${param.puani >= 0 and param.puani <= 10}">
        0-10 üzerinden Puanı : ${param.puani}
        </c:if>
      </h2>
    </body>
</html>
