package creational.abstract_factory;

import creational.abstract_factory.la.LATeamFactory;
import creational.abstract_factory.memphis.MemphisTeamFactory;

public class Match {
    public static void main(String[] args) {
        BasketballTeamFactory factory = new LATeamFactory();
        BasketballPlayers players = factory.getBasketballTeam();
        Coach coach = factory.gerCoach();
        Manager manager = factory.getManager();
        System.out.println("LA trainy");
        players.playing();
        coach.training();
        manager.managing();

        BasketballTeamFactory factory1 = new MemphisTeamFactory();
        BasketballPlayers players1 = factory1.getBasketballTeam();
        Coach coach1 = factory1.gerCoach();
        Manager manager1 = factory1.getManager();
        System.out.println("Memphis trainy");
        players1.playing();
        coach1.training();
        manager1.managing();
    }
}
