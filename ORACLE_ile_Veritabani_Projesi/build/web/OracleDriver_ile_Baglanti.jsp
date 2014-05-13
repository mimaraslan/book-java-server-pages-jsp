<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP ve MSSQL Server</title>
    </head>
    <body>
        <h3>OracleDriver ile ORACLE Veritabanına Bağlantı</h3>
   <table>
    <%@ page import="java.util.*" %>
    <%@ page import="javax.sql.*" %>

    <%
    java.sql.Connection baglanti;
    java.sql.Statement bildirim;
    java.sql.ResultSet sonuc;

    baglanti=null;
    bildirim=null;
    sonuc=null;

    String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
    String kullanici = "OKUL";
    String parola = "123";

    try{
        Class.forName("oracle.jdbc.OracleDriver");
        baglanti = java.sql.DriverManager.getConnection(url, kullanici, parola);
    }catch(ClassNotFoundException cnfex){
        cnfex.printStackTrace();
    }

    String sqlSorugusu = "SELECT * FROM OGRENCILER";

    try{
        bildirim = baglanti.createStatement();
        sonuc = bildirim.executeQuery(sqlSorugusu);
    %>

    <%!int i=0;
       String renk="#ffccff";
       %>
        <%
        while( sonuc.next() ){

              i = i % 2;
            if(i == 0)
            {
                renk="#ffff99";
            }else{
                renk="#ccffcc";
            }
          %>
        <tr bgcolor="<%out.println(renk);%>">
                <td><%= sonuc.getString("OGRENCI_ID") %></td>
                <td><%= sonuc.getString("NUMARASI") %></td>
                <td><%= sonuc.getString("ADI") %></td>
                <td><%= sonuc.getString("SOYADI") %></td>
                <td><%= sonuc.getString("ILGIALANI") %></td>
        </tr>
        <%
        i=i+1;
        }
        %>

    <%
    }
    catch(Exception e){e.printStackTrace();}
    finally{
        if(sonuc!=null) sonuc.close();
        if(bildirim!=null) bildirim.close();
        if(baglanti!=null) baglanti.close();
    }
    %>
    </table>

    </body>
</html>