package structural.bridge;

public class PlayOff extends Tournament{
    public PlayOff(Broadcast broadcast) {
        super(broadcast);
    }

    @Override
    public void playGame() {
        System.out.println("play game in nba play-off");
        broadcast.show();
    }
}
