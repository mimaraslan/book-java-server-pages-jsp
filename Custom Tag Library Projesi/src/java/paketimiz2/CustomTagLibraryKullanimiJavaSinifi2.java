package paketimiz2;

/**
 *
 * @author MASLAN
 */

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagLibraryKullanimiJavaSinifi2 extends TagSupport {


    @Override
        public int doStartTag() {

                try {
                        JspWriter out = pageContext.getOut();
                            out.println( "Paket Adı : paketimiz2"
                                  + "</br>Sınıf Adı : CustomTagLibraryKullanimiJavaSinifi2.java"
                                  + "</br>TLD Adı : TagLibraryDescriptorTLD2.tld"
                                  + "</br>JSP Sayfa Adı : CustomTagLibraryKullanimi2.jsp"
                                  + "</br><font color=blue > Mesaj :</font> "
                                  + "<font color=red >Güzel gören güzel düşünür,"
                                  + "</br>güzel düşünen hayatından lezzet alır. </font>");
                } catch (IOException e) {
                        System.out.println( "CustomTagLibraryKullanimiJavaSinifi2 da Hata : " + e.toString() );
                }
        return SKIP_BODY;
        }
}
