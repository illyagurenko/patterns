package structural.decorator;

public class CaptainDecorator implements BasketPlayer{
    private BasketPlayer player;

    public CaptainDecorator(BasketPlayer player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.play();
        System.out.println("and help moral team");
    }
}
