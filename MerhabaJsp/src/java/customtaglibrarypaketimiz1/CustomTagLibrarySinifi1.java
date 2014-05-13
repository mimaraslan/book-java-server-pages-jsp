package customtaglibrarypaketimiz1;

/**
 * @author M.ASLAN
 */

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.TagSupport;

public class CustomTagLibrarySinifi1 extends TagSupport {

	public int doStartTag() {

		try {
			JspWriter out = pageContext.getOut();
		            out.println( "Paket Adı : customtaglibrarypaketimiz1"
                                  + "</br>Sınıf Adı : CustomTagLibrarySinifi1"
                                  + "</br><font color=blue > Mesaj :</font> "
                                  + "<font color=red >Güzel gören güzel düşünür,"
                                  + "</br>güzel düşünen hayatından lezzet alır. </font>");
		} catch (IOException e) {
       			System.out.println( "CustomTagLibrarySinifi1 da Hata : " + e.toString() );
		}
    	return SKIP_BODY;
	}
}