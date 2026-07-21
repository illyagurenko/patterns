package structural.bridge;

public class RegularSeason extends Tournament{
    public RegularSeason(Broadcast broadcast) {
        super(broadcast);
    }

    @Override
    public void playGame() {
        System.out.println("play game in nba regular season");
        broadcast.show();
    }
}
