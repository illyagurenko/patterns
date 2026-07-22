package behaviolar.strategy;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        player.setCurStrategy(new ThreePointAttack());
        player.doAction();
        player.setCurStrategy(new TwoPointAttack());
        player.doAction();
    }
}
