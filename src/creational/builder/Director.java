package creational.builder;

public class Director {
    private BasketTeamBuilder builder;

    public void setBuilder(BasketTeamBuilder builder) {
        this.builder = builder;
    }

    public BasketTeam buildTeam(){
        builder.createNewBasketTeam();
        builder.buildCoach();
        builder.buildOwner();
        builder.buildTeams();
        return builder.getBasketTeam();
    }
}
