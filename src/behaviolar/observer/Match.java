package behaviolar.observer;

public class Match {
    private Scoreboard scoreboard;
    private int score = 0;

    public void setScoreboard(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }

    public void scoreGoal(int points) {
        this.score += points;
        scoreboard.update(this.score);
    }
}
