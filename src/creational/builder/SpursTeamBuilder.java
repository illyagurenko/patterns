package creational.builder;

import java.util.List;

public class SpursTeamBuilder extends BasketTeamBuilder{
    @Override
    void buildCoach() {
        basketTeam.setCoach("Greg Popovich");
    }

    @Override
    void buildOwner() {
        basketTeam.setOwner("Peter John Holt");
    }

    @Override
    void buildTeams() {
        basketTeam.setTeams(List.of("Wembanyama", "Castle", "Sochan"));

    }
}
