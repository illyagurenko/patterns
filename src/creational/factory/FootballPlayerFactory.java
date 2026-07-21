package creational.factory;

public class FootballPlayerFactory implements SportsmanFactory{

    @Override
    public Sportsman createSportsman() {
        return new FootballPlayer();
    }
}
