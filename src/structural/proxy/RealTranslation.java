package structural.proxy;

public class RealTranslation implements Translation{
    private String url;

    public RealTranslation(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("load ...");
    }

    @Override
    public void watch() {
        System.out.println("watching tr on: " + url);
    }
}
