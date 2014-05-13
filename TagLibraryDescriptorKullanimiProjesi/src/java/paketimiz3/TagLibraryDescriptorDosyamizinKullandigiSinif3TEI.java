package paketimiz3;
/**
 *
 * @author MASLAN
 */
import javax.servlet.jsp.tagext.*;

public class TagLibraryDescriptorDosyamizinKullandigiSinif3TEI extends TagExtraInfo {

    @Override
	public VariableInfo[] getVariableInfo(TagData data) {

	      return new VariableInfo[] {
		new VariableInfo("zaman", "java.lang.String",true, VariableInfo.AT_BEGIN)
		};
	}
}
