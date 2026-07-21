package creational.abstract_factory.memphis;

import creational.abstract_factory.Coach;

public class MemphisCoach implements Coach {
    @Override
    public void training() {
        System.out.println("Memphis coach training Memphis players");
    }
}
