package creational.abstract_factory.memphis;

import creational.abstract_factory.Manager;

public class MemphisManager implements Manager {
    @Override
    public void managing() {
        System.out.println("Memphis manager managing Memphis team");
    }
}
