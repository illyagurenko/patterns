package behaviolar.iterator;

public class Game {
    public static void main(String[] args) {
        Player[] players = {
                new Player("Lebron"),
                new Player("Morant"),
                new Player("Janis")
        };

        PlayerIterator iterator = new PlayerIterator(players);

        while (iterator.hasNext()) {
            Player player = iterator.next();
            System.out.println(player.getName());
        }
    }
}
