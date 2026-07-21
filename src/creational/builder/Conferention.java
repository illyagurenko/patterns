package creational.builder;

public class Conferention {
    public static void main(String[] args) {
        Director director = new Director();
        BasketTeamBuilder builder = new SpursTeamBuilder();

        director.setBuilder(builder);
        BasketTeam spurs = director.buildTeam();

        System.out.println(spurs);
    }
}
