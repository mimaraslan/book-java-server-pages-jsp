package paketimiz;

import java.io.IOException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author MASLAN
 */

public class TagLibraryDescriptorDosyamizinKullandigiSinif  extends SimpleTagSupport {


    private String mesajimiz;
    private String rengi;
    private int buyukluk;


    public void setMesajimiz(String mesajimiz) {
        this.mesajimiz = mesajimiz;
    }
    

     public void setRengi(String rengi) {
        this.rengi = rengi;
    }

     public void setBuyukluk(int buyukluk) {
        this.buyukluk = buyukluk;
    }




    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.println("<h" + buyukluk + " style="+"color:#"+rengi+""+">" + mesajimiz + "</h" + buyukluk + ">" + "<hr>");
        try {
            JspFragment f = getJspBody();
            if (f != null)
                f.invoke(out);
        } catch (java.io.IOException ex) {
            throw new JspException("TagLibraryDescriptorDosyamiz kullanilirken hata olustu. ", ex);
        }

    }

}
