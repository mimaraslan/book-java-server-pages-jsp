<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kontrol İfadelerinin Kullanımı </title>
    </head>
    <body>
         <%
            int sayi=1453;
            String mesaj="";
         %>

          <h3>if</h3>
          <%
          if(sayi==1453)
          out.print("İSTANBUL'UN FETİH TARİHİ " +sayi + " TÜR.");
          %>

          <h3>if - else</h3>
          <%
              if(sayi!=1299)
             out.print("İSTANBUL'UN FETİH TARİHİ " +sayi + " TÜR.");
             else
              { out.print("İSTANBUL'UN FETİH TARİHİ " +sayi + " DEĞİLDİR.<br />"
                        +sayi+" OSMANLI İMPARATORLUĞUNUN KURULUŞ TARİHİDİR");
              }
          %>       
          
          <h3>if - else if - else</h3>
          <%
              if(sayi==2120)
                 out.print("BU TARİHTE DE SAKLI GÜZELLİKLER VARDIR ELBET.");
              else if(sayi==1299)
                 out.print(sayi+" OSMANLI İMPARATORLUĞUNUN KURULUŞ TARİHİDİR"); 
              else
                 out.print(sayi+" FATİH SULTAN MEHMET HANIN İSTANBULU FETİH TARİHİDİR.");
          %>

          <h3>switch</h3>
          <%
                switch(sayi){
                    case 1299: mesaj= "OSMANLI KURULUŞ YILI 1299";
                    break;
                    case 1453: mesaj= "İSTANBULUN FETİH YILI 1453";
                    break;
                    default:   mesaj="VARSAYILAN SEÇENEK ÇALIŞTIRILDI.";
                 }
                out.println(mesaj);
          %>

          <h3>while döngüsü</h3>
          <%
            int i = 3 ;
            while ( i >0 ) {
            out.println ( " _FSM_ " );
              i--;
            }
          %>

          <h3>do- while döngüsü</h3>
          <%
          int a = -5 ;
          do {
            out.println ( "ŞART SAĞLANMASA BİLE do- while döngüsü<br />"
                        + "EN AZ 1 KERE ÇALIŞTIRILIR. " );
              a--;
            }  while ( a >0 );
          %>         

          <h3>for döngüsü</h3>
         <%
          for ( int j = 1 ; j <= 3 ; j++  )  {
           out.print ( j + " _FSM_ " );
            }
          %>       

          <h3>for-each</h3>
         <%
          int [] tamsayilarDizisininDegiskeni = { 1299 , 1453 , 1481 , 1495 , 1531 };
          for( int tamsayiDegiskenimiz : tamsayilarDizisininDegiskeni ){
           out.println (tamsayiDegiskenimiz);
         }
         %>
    </body>
</html>