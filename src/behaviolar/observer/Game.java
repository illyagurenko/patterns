package behaviolar.observer;

public class Game {
    public static void main(String[] args) {
        Match game = new Match();
        Scoreboard scoreboard = new Scoreboard();

        game.setScoreboard(scoreboard);
        game.scoreGoal(3);
    }
}
