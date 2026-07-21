package structural.adapter;

public class AdapterEUToUSA extends EUBasket implements USABasket{
    @Override
    public void usaThreePoint() {
        euThreePoint();
    }

    @Override
    public void usaTwoPoint() {
        euTwoPoint();
    }
}
