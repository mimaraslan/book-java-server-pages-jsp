<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL fmt:requestEncoding</title>
    </head>
    <body>
        <h1>JSTL fmt:requestEncoding</h1>
         <h2>Güzel gören güzel düşünür.Güzel düşünen, hayatından lezzet alır.</h2>
         <h2>Азиз Юстадым сени чок севиёруз.</h2>
     <fmt:setLocale value="ru_RU" /><strong>RUSCA :</strong>
        <fmt:setBundle basename="bundlePaketi.BundleSinifiRU" var="dilSinifi"  />
            <fmt:message key="onAd.mesajkisim1" bundle="${dilSinifi}"/> -
            <fmt:message key="onAd.mesajkisim2" bundle="${dilSinifi}"/> -
            <fmt:message key="onAd.mesajkisim3" bundle="${dilSinifi}"/> -
            <fmt:message key="onAd.mesajkisim4" bundle="${dilSinifi}"/>
    </body>
</html>
