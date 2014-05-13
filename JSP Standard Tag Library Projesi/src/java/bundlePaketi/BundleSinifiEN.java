package bundlePaketi;
import java.util.ListResourceBundle;

public class BundleSinifiEN extends ListResourceBundle {
  @Override
  public Object[][] getContents() {
    return contents;
  }
  static final Object[][] contents = {
  {"onAd.mesajkisim1", "Lion"},
  {"onAd.mesajkisim2", "Leopard"},
  {"onAd.mesajkisim3", "Gull"},
  {"onAd.mesajkisim4", "Tiger"},
  };
}