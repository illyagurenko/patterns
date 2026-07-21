package creational.factory;

public class Sport {
    public static void main(String[] args) {
        SportsmanFactory sportsmanFactory = createSportsman("basketball");
        Sportsman sportsman = sportsmanFactory.createSportsman();
        sportsman.playWith();
    }
    static SportsmanFactory createSportsman(String sport){
        switch (sport.toLowerCase()){
            case "basketball" -> {
                return new BasketballPlayerFactory();
            }
            case "football" -> {
                return new FootballPlayerFactory();
            }
            default -> throw new IllegalArgumentException("not support this sport");
        }
    }
}
