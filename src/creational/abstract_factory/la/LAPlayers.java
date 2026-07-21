package creational.abstract_factory.la;

import creational.abstract_factory.BasketballPlayers;

public class LAPlayers implements BasketballPlayers {
    @Override
    public void playing() {
        System.out.println("LA players play basket");
    }
}
