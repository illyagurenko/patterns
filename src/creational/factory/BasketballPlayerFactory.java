package creational.factory;

public class BasketballPlayerFactory implements SportsmanFactory{

    @Override
    public Sportsman createSportsman() {
        return new BasketballPlayer();
    }
}
