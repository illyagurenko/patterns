package creational.abstract_factory.memphis;

import creational.abstract_factory.BasketballPlayers;

public class MemphisPlayers implements BasketballPlayers {
    @Override
    public void playing() {
        System.out.println("Memphis players play basket");
    }
}
