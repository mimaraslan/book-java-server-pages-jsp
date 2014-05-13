import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
public class AppletCalismaDurumlari extends Applet
{
Font f = new Font("Times New Roman",Font.BOLD,20);
private String mesaj=null;
    @Override
public void init()
{
  mesaj="APPLET ACILDI.";
  System.out.println(mesaj);
  setBackground(Color.YELLOW);
}
    @Override
public void start()
{
    mesaj= "APPLET BASLADI.";
    System.out.println(mesaj);
}
    @Override
public void stop()
{
   mesaj= "APPLET DURDURULDU.";
   System.out.println(mesaj);
   setBackground(Color.RED);
}
    @Override
public void destroy()
{
  mesaj= "APPLET SONLANDIRILDI.";
  System.out.println(mesaj);
}
    @Override
public void paint(Graphics g)
{
  g.setFont(f);
  g.setColor(Color.DARK_GRAY);
  g.drawString("Durum : " + mesaj , 15 , 30);
}
}