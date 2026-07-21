package structural.adapter;

public class GoBasket {
    public static void main(String[] args) {
        USABasket basket = new AdapterEUToUSA();
        basket.usaThreePoint();
        basket.usaTwoPoint();
    }
}
