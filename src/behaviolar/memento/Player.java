package behaviolar.memento;

public class Player {
    private int points;
    private int fouls;

    public void play(int points, int fouls){
        this.fouls+=fouls;
        this.points+=points;
        System.out.println("score: " + this.points + " fouls: " + this.fouls);
    }

    public StatisticState saveState(){
        return new StatisticState(points, fouls);
    }

    public void restoreState(StatisticState state) {
        this.points = state.getPoints();
        this.fouls = state.getFouls();
        System.out.println("update score: " + points + ", fouls: " + fouls);
    }
}
