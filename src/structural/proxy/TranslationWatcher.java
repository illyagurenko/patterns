package structural.proxy;

public class TranslationWatcher {
    public static void main(String[] args) {
        Translation translation = new ProxyTranslation("https://www.youtube.com/nba/lal-lac");
        translation.watch();
    }
}
