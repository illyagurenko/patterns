package structural.decorator;

public class CaptainPlay {
    public static void main(String[] args) {
        BasketPlayer player = new SimplePlayer();
        BasketPlayer captain = new CaptainDecorator(player);
        captain.play();
    }
}
