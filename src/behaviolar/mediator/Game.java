package behaviolar.mediator;

public class Game {
    public static void main(String[] args) {
        Referee referee = new Referee();
        Player lebron = new Player("Lebron", referee);
        Player jordan = new Player("DeRozzan", referee);
        referee.registerPlayers(lebron, jordan);
        lebron.commitFoul();
    }

}
