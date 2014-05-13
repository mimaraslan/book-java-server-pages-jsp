<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL Function Tags</title>
    </head>
    <body>
        <h1>JSTL Function Tags Kullanımı</h1>
        <c:set var="cumlemiz" value="      Güzel gören güzel düşünür.Güzel düşünen, hayatından lezzet alır.    " />
<font color="blue">Mesajımız</font>
<c:out value="${cumlemiz}" />
<br>
<font color="blue">Mesajımızın Uzunluğu : </font>
<c:out value="${fn:length(cumlemiz)}" />
<br>
<font color="blue">Mesajımızın Harflerini Büyük Yap</font><br>
<c:out value="${fn:toUpperCase(cumlemiz)}" />
<br>
<font color="blue">Mesajımızın Harflerini Küçük Yap</font><br>
<c:out value="${fn:toLowerCase(cumlemiz)}" />
<br>
<font color="blue">Mesajımızın etrafındaki boşlukları kes at.</font>
<c:out value="${fn:trim(cumlemiz)}" />
<br>
<font color="blue">Mesajımızın etrafındaki boşlukları kesip atılınca kaç karakter?</font>
<c:out value="${fn:length(fn:trim(cumlemiz))}" />
<br>
<font color="blue">Mesajdaki boşukları alt çizgi ile değiştir.</font><br>
<c:out value="${fn:replace(cumlemiz,' ','_')}" />
<br>
<font color="blue">Mesajdaki 5. karakter ile 18. karaktere kadar olan kısmı yaz.</font>
<c:out value="${fn:substring(cumlemiz,5,18)}" />
<br>
<font color="blue">Mesajdaki "hayatından" kelimesinden sonraki sözcükleri yaz.</font>
<c:out value="${fn:substringAfter(cumlemiz,'hayatından')}" />
<br>
<font color="blue">Mesajdaki "hayatından" kelimesinden önceki sözcükleri yaz.</font>
<c:out value="${fn:substringBefore(cumlemiz,'hayatından')}" />
<br>
<font color="blue">Mesajın en başından itibaren ilk defa yazılan "a" harfinin karakter sırası :</font>
<c:out value="${fn:indexOf(cumlemiz,'a')}" />
<br>
<font color="blue">Mesajda "G" harfi kullanılmış mı?</font>
<c:out value="${fn:contains(cumlemiz,'G')}" />
<br>
<font color="blue">Mesajda "M" harfi kullanılmış mı?</font>
<c:out value="${fn:containsIgnoreCase(cumlemiz,'l')}" />
<br>
<font color="blue">Mesajda "      Güzel" sözüyle mi başlamış? :</font>
<c:out value="${fn:startsWith(cumlemiz,'      Güzel')}" />
<br>
<font color="blue">Mesajda "düşünen " sözüyle mi bitmiş?</font>
<c:out value="${fn:endsWith(cumlemiz,'düşünen ')}" />
    </body>
</html>
