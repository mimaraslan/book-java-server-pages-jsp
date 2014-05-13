<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet Kullanımı 1</title>
    </head>
    <body>
        <h1>Servlet Kullanımı 1</h1>

       <form action="ServletSinifi1" method="POST">
           <table border="1">
                   <tr>
                       <td>Kullanıcı Adı</td>
                       <td><input type="text" name="kullaniciAdi" size="20"></td>
                   </tr>
                   <tr>
                       <td>Parola</td>
                       <td><input type="text" name="parola" size="20"></td>
                   </tr>
                   <tr>
                       <td></td>
                       <td><input type="submit" value="Gönder"></td>
                   </tr>
           </table>

        </form>

    </body>
</html>
