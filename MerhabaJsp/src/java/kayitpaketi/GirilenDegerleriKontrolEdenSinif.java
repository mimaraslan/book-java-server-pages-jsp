package kayitpaketi;
import javax.servlet.http.HttpServletRequest;

public class GirilenDegerleriKontrolEdenSinif {

String kullaniciadimiz;
String parolamiz;


public void setkullaniciadimiz(String deger) {
    this.kullaniciadimiz = deger;
}

public String getkullaniciadimiz() {
    return kullaniciadimiz;
}



public void setparolamiz(String deger) {
    this.parolamiz = deger;
}

public String getparolamiz() {
    return parolamiz;
}



public void hatalariKontrolEdenFonksiyon(HttpServletRequest request){

    String hatalar="";

    if(kullaniciadimiz ==null || kullaniciadimiz.trim().length() ==0){
            hatalar=hatalar+"<li>KULLANICI ADI EKSiK<br>";
        }

    if(parolamiz ==null || parolamiz.trim().length() ==0){
            hatalar=hatalar+"<li>PAROLA EKSiK<br>";
        }


    if( hatalar.trim().length() >0){
            request.setAttribute("hatalar",hatalar);
        }

    }

}
