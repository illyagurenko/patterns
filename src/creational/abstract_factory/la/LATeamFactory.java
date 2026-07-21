package creational.abstract_factory.la;

import creational.abstract_factory.BasketballPlayers;
import creational.abstract_factory.BasketballTeamFactory;
import creational.abstract_factory.Coach;
import creational.abstract_factory.Manager;

public class LATeamFactory implements BasketballTeamFactory {
    @Override
    public BasketballPlayers getBasketballTeam() {
        return new LAPlayers();
    }

    @Override
    public Coach gerCoach() {
        return new LACoach();
    }

    @Override
    public Manager getManager() {
        return new LAManager();
    }
}
