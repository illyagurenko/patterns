package creational.abstract_factory.la;

import creational.abstract_factory.Manager;

public class LAManager implements Manager {
    @Override
    public void managing() {
        System.out.println("LA manager managing LA team");
    }
}
