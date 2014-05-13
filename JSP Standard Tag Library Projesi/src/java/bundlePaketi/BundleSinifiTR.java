package bundlePaketi;
import java.util.ListResourceBundle;

public class BundleSinifiTR extends ListResourceBundle {
  @Override
  public Object[][] getContents() {
    return contents;
  }
  static final Object[][] contents = {
  {"onAd.mesajkisim1", "Aslan"},
  {"onAd.mesajkisim2", "Leopar"},
  {"onAd.mesajkisim3", "Martı"},
  {"onAd.mesajkisim4", "Kaplan"},
  };
}