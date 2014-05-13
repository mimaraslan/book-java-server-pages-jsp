package paketimiz3;
/**
 *
 * @author MASLAN
 */
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public final class TagLibraryDescriptorDosyamizinKullandigiSinif3 implements Tag {

	private PageContext pc = null;

    @Override
	public void setParent(Tag t) {
    }

    @Override
	public void setPageContext(PageContext p) {
		pc = p;
	}

    @Override
	public Tag getParent() { return null; }


    public static String tarihMetodu() {
    Calendar takvimNesnesi = Calendar.getInstance();
    return takvimNesnesi.getTime().toString();
     }


    @Override
	public int doStartTag() throws JspException {
		pc.setAttribute("zaman", tarihMetodu());
		return EVAL_BODY_INCLUDE;
	}

    @Override
	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

    @Override
	public void release() {
		pc = null;
	}
}