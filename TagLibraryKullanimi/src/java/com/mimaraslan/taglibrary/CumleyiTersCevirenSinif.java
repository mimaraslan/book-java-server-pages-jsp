package com.mimaraslan.taglibrary;
import java.io.IOException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
//-------------------------------------------------
public class CumleyiTersCevirenSinif extends BodyTagSupport {
private static final long serialVersionUID = 1L;

public int doStartTag() throws JspTagException{
    return EVAL_BODY_TAG;
}
//-------------------------------------------------
public int doEndTag() throws JspTagException {
    try {
               JspWriter out = pageContext.getOut();
            } catch (Exception ex) {
                 throw new JspTagException("Butun kelimeler tam olarak ters cevrilmedi." + ex);
            }
    return SKIP_BODY;
}
//-------------------------------------------------
public int doAfterBody() throws JspTagException {
    BodyContent govde = getBodyContent();
    try {
                    JspWriter out = govde.getEnclosingWriter();
                    String govdeyiTutanDegisken = govde.getString();

                 if (govdeyiTutanDegisken != null) {
                         for (int i = govdeyiTutanDegisken.length() - 1; i >= 0; i--) {
                                    out.print(govdeyiTutanDegisken.charAt(i));
                            }
                    }
                out.println();
                govde.clearBody(); // Bir sonraki kelime icin temizlik yapıyor.
            } catch (IOException ioe) {
                     throw new JspTagException("Cevirme hatasi tag doAfterBody de" + ioe);
            }
    return (SKIP_BODY);
    }
//-------------------------------------------------
}