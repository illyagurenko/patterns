package creational.builder;

public abstract class BasketTeamBuilder {
    protected BasketTeam basketTeam;

    public void createNewBasketTeam() {
        this.basketTeam = new BasketTeam();
    }

    abstract void buildCoach();
    abstract void buildOwner();
    abstract void buildTeams();

    public BasketTeam getBasketTeam() {
        return basketTeam;
    }
}
