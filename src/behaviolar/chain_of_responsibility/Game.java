package behaviolar.chain_of_responsibility;

public class Game {
    public static void main(String[] args) {
        Player shooter = new Shooter();
        Player center = new Center();

        // shooer -> center
        shooter.setNextPlayer(center);

        System.out.println("bad difense");
        shooter.handleBall(2);

        System.out.println("good difence");
        shooter.handleBall(8);
    }
}
