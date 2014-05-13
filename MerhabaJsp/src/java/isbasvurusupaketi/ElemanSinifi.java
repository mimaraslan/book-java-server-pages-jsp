package isbasvurusupaketi;

import java.io.*;
import java.util.*;

public class ElemanSinifi {
  private String adi;
  private String soyadi;
  private String email;
  private String kullaniciadi;
  private String cinsiyet;
  private String parola1;
  private String parola2;
  private String postakodu;
  private String adres;
  private String[ ] tecrubealani;
  private Hashtable hatalar;

  public boolean kontrolFonksiyonu() {
    boolean hatadurumu=true;

    if (adi.equals("")) {
      hatalar.put("adi","Lütfen adınızı giriniz.");
      adi="";
      hatadurumu=false;
    }

    if (soyadi.equals("")) {
      hatalar.put("soyadi","Lütfen soyadınızı giriniz.");
      soyadi="";
      hatadurumu=false;
    }

    if (email.equals("") || (email.indexOf('@') == -1)) {
      hatalar.put("email","Lütfen geçerli bir e-mail adresi giriniz.");
      email="";
      hatadurumu=false;
    }

    if (kullaniciadi.equals("")) {
      hatalar.put("kullaniciadi","Lütfen kullanıcı adınızı giriniz.");
      kullaniciadi="";
      hatadurumu=false;
    }

    if (adres.equals("")) {
      hatalar.put("adres","Lütfen adresinizi giriniz.");
      adres="";
      hatadurumu=false;
    }

    if (parola1.equals("") ) {
      hatalar.put("parola1","Lütfen parolanızı giriniz.");
      parola1="";
      hatadurumu=false;
    }

    if (!parola1.equals("") && (parola2.equals("") ||
        !parola1.equals(parola2))) {
      hatalar.put("parola2","Lütfen iki parolayıda aynı giriniz.");
      parola2="";
      hatadurumu=false;
    }

    if (postakodu.equals("") ) {
      hatalar.put("postakodu","Lütfen posta kodunu giriniz.");
      postakodu="";
      hatadurumu=false;
    } else {
      try {
        int sayi = Integer.parseInt(postakodu);
          }
      catch (NumberFormatException e) {
            hatalar.put("postakodu","Lütfen sadece sayı giriniz.");
            postakodu="";
            hatadurumu=false;
          }
    }
    return hatadurumu;
    }

    public String getHataMesajlari(String hataCumleleri) {
    String hataMesajlari =(String)hatalar.get(hataCumleleri.trim());
    return (hataMesajlari == null) ? "":hataMesajlari;
    }

    public ElemanSinifi() {
        adi="";
        soyadi="";
        email="";
        kullaniciadi="";
        cinsiyet="";
        parola1="";
        parola2="";
        postakodu="";
        tecrubealani = new String[] { "1" };
        adres="";
        hatalar = new Hashtable();
    }

    public String getAdi() {
        return adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public String getEmail() {
        return email;
    }

    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public String getAdres() {
        return adres;
    }

    public String getParola1() {
        return parola1;
    }

    public String getParola2() {
        return parola2;
    }

    public String getPostakodu() {
        return postakodu;
    }

    public String[] getTecrubealani() {
        return tecrubealani;
    }

    public String secilenTecrubeler(String s) {
    boolean found=false;
    if (!tecrubealani[0].equals("1")) {
      for (int i = 0; i < tecrubealani.length; i++) {
        if (tecrubealani[i].equals(s)) {
          found=true;
          break;
        }
      }
      if (found) return "checked";
    }
    return "";
    }

    public String secilenCinsiyet(String s) {
        return (cinsiyet.equals(s))? "checked" : "";
    }

    public void setAdi(String deger) {
        adi =deger;
    }

    public void setSoyadi(String deger) {
        soyadi =deger;
    }

    public void setEmail(String deger) {
        email=deger;
    }

    public void setKullaniciadi(String deger) {
        kullaniciadi=deger;
    }

    public void setCinsiyet(String deger) {
        cinsiyet=deger;
    }

    public void setAdres(String deger) {
        adres=deger;
    }

    public void  setParola1(String deger) {
        parola1=deger;
    }

    public void  setParola2(String deger) {
        parola2=deger;
    }

    public void setPostakodu(String deger) {
        postakodu=deger;
    }

    public void setTecrubealani(String[] deger) {
        tecrubealani=deger;
    }

    public void setHatalar(String formElemani, String verilenHataMesaji) {
        hatalar.put(formElemani,verilenHataMesaji);
    }
}