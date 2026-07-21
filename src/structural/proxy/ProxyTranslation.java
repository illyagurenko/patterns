package structural.proxy;

public class ProxyTranslation implements Translation{
    private String url;
    private RealTranslation realTranslation;

    public ProxyTranslation(String url) {
        this.url = url;
    }

    @Override
    public void watch() {
        if(realTranslation == null){
            realTranslation = new RealTranslation(url);
        }
        realTranslation.watch();
    }
}
