package behaviolar.state;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        player.doAction();
        player.setCurState(new TwoPointAttack());
        player.doAction();
    }
}
