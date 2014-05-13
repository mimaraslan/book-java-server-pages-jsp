package bundlePaketi;
import java.util.ListResourceBundle;

public class BundleSinifiRU extends ListResourceBundle {
  @Override
  public Object[][] getContents() {
    return contents;
  }
  static final Object[][] contents = {
  {"onAd.mesajkisim1", "Лев"},
  {"onAd.mesajkisim2", "Леопард"},
  {"onAd.mesajkisim3", "Чайка"},
  {"onAd.mesajkisim4", "Тигр"},
  };
}