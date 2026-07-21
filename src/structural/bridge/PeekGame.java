package structural.bridge;

public class PeekGame {
    public static void main(String[] args) {
        Broadcast rt = new Rutube();
        Broadcast yt = new Youtube();

        Tournament game1 = new RegularSeason(rt);
        Tournament game2 = new PlayOff(yt);
        game1.playGame();
        game2.playGame();
    }
}
