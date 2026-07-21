package behaviolar.chain_of_responsibility;

public abstract class Player {
    private Player nextPlayer;

    public void setNextPlayer(Player nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public void handleBall(int defenseLevel) {
        if (defenseLevel < 5) {
            shoot();
        } else if (nextPlayer != null) {
            passToNext();
            nextPlayer.handleBall(defenseLevel);
        } else {
            System.out.println("bad shoot");
        }
    }

    abstract protected void shoot();
    abstract protected void passToNext();
}
