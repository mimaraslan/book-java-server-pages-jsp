<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP'de Veri Tipleri ve Değişkenler</title>
    </head>
    <body>
 <h1>1. Primitive (İlkel) Veri Tipleri</h1>

<%
byte  byte_tipindeki_degiskenimiz = 11;
short short_tipindeki_degiskenimiz = 571;
int int_tipindeki_degiskenimiz = 1453;
long long_tipindeki_degiskenimiz = 12992016;
char char_tipindeki_degiskenimiz = 'a';

float floattipindekidegiskenimiz = 63.2f;
double double_tipindeki_degiskenimiz = 1481.99;

boolean boolean_tipindeki_degiskenimiz = false;
%>

 <h2>Sayısal veri tipleri</h2>
 <h3>Tamsayı veri tipleri: byte,  short, int, long,   char</h3>
byte <% out.println(byte_tipindeki_degiskenimiz);%><br />
short <% out.println(short_tipindeki_degiskenimiz);%><br />
int <% out.println(int_tipindeki_degiskenimiz);%><br />
long <% out.println(long_tipindeki_degiskenimiz);%><br />
char <% out.println(char_tipindeki_degiskenimiz);%><br />
 <h3>Kesirli sayı veri tipleri: float, double</h3>
float <% out.println(floattipindekidegiskenimiz);%><br />
double <% out.println(double_tipindeki_degiskenimiz);%><br />
 <h3>Mantıksal veri tipi</h3>
boolean <% out.println(boolean_tipindeki_degiskenimiz);%><br />

 <h1>2.Referans Tipleri : class, interface,  array</h1>
 <h1>3.Null Tip :  null</h1>

    </body>
</html>
