package creational.abstract_factory.memphis;

import creational.abstract_factory.BasketballPlayers;
import creational.abstract_factory.BasketballTeamFactory;
import creational.abstract_factory.Coach;
import creational.abstract_factory.Manager;

public class MemphisTeamFactory implements BasketballTeamFactory {
    @Override
    public BasketballPlayers getBasketballTeam() {
        return new MemphisPlayers();
    }

    @Override
    public Coach gerCoach() {
        return new MemphisCoach();
    }

    @Override
    public Manager getManager() {
        return new MemphisManager();
    }
}
