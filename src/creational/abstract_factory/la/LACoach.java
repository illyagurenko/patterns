package creational.abstract_factory.la;

import creational.abstract_factory.Coach;

public class LACoach implements Coach {
    @Override
    public void training() {
        System.out.println("LA coach training LA players");
    }
}
