package structural.decorator;

public class SimplePlayer implements BasketPlayer{
    @Override
    public void play() {
        System.out.println("player play");
    }
}
