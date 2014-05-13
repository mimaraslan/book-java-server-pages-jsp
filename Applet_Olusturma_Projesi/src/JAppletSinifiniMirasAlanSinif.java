import javax.swing.JApplet;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JAppletSinifiniMirasAlanSinif extends JApplet {
    
    @Override
  public void init() {
//Menu Bar Nesnesi
    JMenuBar MenuBarNesnesi = new JMenuBar();

//Üst Menü1
    JMenu UstMenuNesnesi1 = new JMenu("Üst Menü1");

    JMenuItem altMenuNesnesi1_1 = new JMenuItem("AltMenü1.1");
    UstMenuNesnesi1.add(altMenuNesnesi1_1);

    JMenuItem altMenuNesnesi1_2 = new JMenuItem("AltMenü1.2");
    UstMenuNesnesi1.add(altMenuNesnesi1_2);

    JMenuItem altMenuNesnesi1_3 = new JMenuItem("AltMenü1.3");
    UstMenuNesnesi1.add(altMenuNesnesi1_3);

    JMenu add = MenuBarNesnesi.add(UstMenuNesnesi1);

//Üst Menü2
    JMenu UstMenuNesnesi2 = new JMenu("Üst Menü2");

    JMenuItem altMenuNesnesi2_1 = new JMenuItem("AltMenü2.1");
    UstMenuNesnesi2.add(altMenuNesnesi2_1);

    MenuBarNesnesi.add(UstMenuNesnesi2);

    setJMenuBar(MenuBarNesnesi);
  }
}