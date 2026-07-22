package behaviolar.memento;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        GameHistory history = new GameHistory();

        player.play(2, 0);
        history.push(player.saveState());

        player.play(2, 1);

        player.restoreState(history.pop());



    }
}
