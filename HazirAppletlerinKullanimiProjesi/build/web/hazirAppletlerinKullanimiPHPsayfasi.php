<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hazır Appletlerin Kullanılması</title>
    </head>
    <body>
        <h1>Hazır Appletlerin Kullanılması</h1>
        <h3>1-Text Effects (Metin Çümbüşleri)</h3>
        <applet code="MistyMessage.class"archive="MistyMessage.jar" width="820"	height="200">
  <param name="colorscheme"      value="orange">
  <! orange, green, blue or white>

  <param name="delay_appear"     value="10">
  <! in milliseconds, default: 60>

  <param name="delay_wait"       value="2000">
  <! in milliseconds, default: 2000>

  <param name="delay_dissappear" value="100">
  <! in milliseconds, default: 100>

  <param name="delay_waitblank"  value="0">
  <! in milliseconds, default: 100>

  <! max. 10 lines of text - do not use too many
  	characters per line!>

  <param name="text1"   value="Java2 Platform,Standard Edition">
  <param name="text2"   value="J2SE">

  <param name="text3"   value="Java2 Platform,Enterprise Edition">
  <param name="text4"   value="J2EE">

  <param name="text5"   value="Java2 Platform,Micro Edition">
  <param name="text6"   value="J2ME">

  <param name="looptext"  value="yes">
</applet>
       <hr />
        <h3>2-Navigation (Yönelticiler)</h3>
<applet Code=apMagicMenu Archive=apMagicMenu.jar Width=130 Height=231>
  <param name="Copyright" value="Apycom Software - www.apycom.com">
  <param name="isHorizontal" value="false">
  <param name="status" value="link">
  <param name="alignText" value="right">
  <param name="backColor" value="f2f2f2">
  <param name="backHighColor" value="ccee99">
  <param name="fontColor" value="005599">
  <param name="fontHighColor" value="ffffff">
  <param name="maxWords" value="20">
  <param name="brightness" value="2">
  <param name="fadeDelay" value="20">
  <param name="fadeSteps" value="40">
  <param name="font" value="TimesRoman,12,1">
  <param name="fadeType" value="3">
  <param name="menuItems" value="
      {Apycom Software\Home Page,http://www.apycom.com,_self}
      {Java Menu Applets,testlink.html,_self}
      {Main\Parameters,testlink.html,_self}
      {Optional\Parameters,testlink.html,_self}
      {Javascript Tips,testlink.html,_self}
      {Examples,testlink.html,_self}
      {Download,testlink.html,_self}
      {Contact Us,testlink.html,_self}
      ">
</applet>
        <hr />
        <h3>3-Audio Effects (Ses Cümbüşleri)</h3>
      <applet archive="AppletClasses.jar" code="Xylophone.class" width=575 height=320>
</applet>
        <hr />
        <h3>4-Utilities(Yardımcı uygulmalar)</h3>
        <applet code="UnicodeApplet" width="500" height="200"></applet>
        <hr />
        <h3>5-Visual Effects(Görsel Cümbüşler) </h3>
        <applet code="searchlight.class" width=400 height=300>
            <param name=filename value="greywolf.jpg">
            <param name=diameter value="150">
            <param name=delay value="25">
            <param name=opacity value="0.2">
        </applet>
    </body>
</html>