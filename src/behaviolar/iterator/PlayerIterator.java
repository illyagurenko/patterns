package behaviolar.iterator;

public class PlayerIterator {
    private Player[] players;
    private int position = 0;

    public PlayerIterator(Player[] players) {
        this.players = players;
    }

    public boolean hasNext() {
        return position < players.length && players[position] != null;
    }

    public Player next() {
        Player player = players[position];
        position++;
        return player;
    }
}
