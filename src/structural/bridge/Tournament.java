package structural.bridge;

public abstract class Tournament {
    protected Broadcast broadcast;

    public Tournament(Broadcast broadcast) {
        this.broadcast = broadcast;
    }

    abstract void playGame();
}
