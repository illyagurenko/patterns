package behaviolar.memento;

public class StatisticState {
    private final int points;
    private final int fouls;

    public StatisticState(int points, int fouls) {
        this.points = points;
        this.fouls = fouls;
    }

    public int getPoints() {
        return points;
    }

    public int getFouls() {
        return fouls;
    }
}
