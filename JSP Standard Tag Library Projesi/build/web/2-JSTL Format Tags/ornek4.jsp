<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>JSTL fmt:bundle - fmt:setBundle - fmt:message Tag</title>
</head>
<body>

<h2>JSTL fmt:bundle - fmt:setBundle - fmt:message :</h2>

<hr> <font color="red"><h3>JSTL fmt:bundle - fmt:message</h3></font>
<fmt:bundle basename="bundlePaketi.BundleSinifiTR">
   <fmt:message key="onAd.mesajkisim1"/> -
   <fmt:message key="onAd.mesajkisim2"/> -
   <fmt:message key="onAd.mesajkisim3"/> -
   <fmt:message key="onAd.mesajkisim4"/>
</fmt:bundle>

   <hr> <font color="red"><h3>JSTL fmt:bundle prefix="" - fmt:message</h3></font>
<fmt:bundle basename="bundlePaketi.BundleSinifiTR" prefix="onAd.">
   <fmt:message key="mesajkisim1"/> -
   <fmt:message key="mesajkisim2"/> -
   <fmt:message key="mesajkisim3"/> -
   <fmt:message key="mesajkisim4"/>
</fmt:bundle>



     <hr> <font color="red"><h3>JSTL fmt:setBundle - fmt:message TÜRKÇE</h3></font>
<fmt:setBundle basename="bundlePaketi.BundleSinifiTR" var="dilSinifi"  />
<fmt:message key="onAd.mesajkisim1" bundle="${dilSinifi}"/> -
<fmt:message key="onAd.mesajkisim2" bundle="${dilSinifi}"/> -
<fmt:message key="onAd.mesajkisim3" bundle="${dilSinifi}"/> -
<fmt:message key="onAd.mesajkisim4" bundle="${dilSinifi}"/>


    <hr> <font color="red"><h3>JSTL fmt:setBundle - fmt:message İNGİLİZCE</h3></font>
<fmt:setBundle basename="bundlePaketi.BundleSinifiEN" var="dilSinifi"  />
<fmt:message key="onAd.mesajkisim1" bundle="${dilSinifi}"/> -
<fmt:message key="onAd.mesajkisim2" bundle="${dilSinifi}"/> -
<fmt:message key="onAd.mesajkisim3" bundle="${dilSinifi}"/> -
<fmt:message key="onAd.mesajkisim4" bundle="${dilSinifi}"/>


<hr> <font color="red"><h3>JSTL fmt:setBundle - fmt:message RUSÇA</h3></font>
<fmt:setBundle basename="bundlePaketi.BundleSinifiRU" var="dilSinifi"  />
<fmt:message key="onAd.mesajkisim1" bundle="${dilSinifi}"/> -
<fmt:message key="onAd.mesajkisim2" bundle="${dilSinifi}"/> -
<fmt:message key="onAd.mesajkisim3" bundle="${dilSinifi}"/> -
<fmt:message key="onAd.mesajkisim4" bundle="${dilSinifi}"/>




</body>
</html>