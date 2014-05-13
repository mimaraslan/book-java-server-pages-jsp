package bosdegerpaketi;

import java.io.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class BosDegerSinifi implements Tag {
   private PageContext pageContext;
   private Tag parent;
   
    @Override
   public int doStartTag() throws JspException {
      try {
         pageContext.getOut().print("Bu öz niteliği olmayan bir Custom tag!");
      } catch (IOException ioe) {
         throw new JspException("Hata:"+ioe.getMessage());
      }
      return SKIP_BODY;
   }

    @Override
   public int doEndTag() throws JspException {
      return SKIP_PAGE;
   }
    @Override
   public void release() {
   }

    @Override
   public void setPageContext(PageContext pageContext) {
      this.pageContext = pageContext;
   }

    @Override
   public void setParent(Tag parent) {
      this.parent = parent;
   }

    @Override
   public Tag getParent() {
      return parent;
   }
}