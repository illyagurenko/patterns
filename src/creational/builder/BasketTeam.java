package creational.builder;

import java.util.List;

public class BasketTeam {
    private String coach;
    private String owner;
    private List<String> teams;

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "BasketTeam{" +
                "coach='" + coach + '\'' +
                ", owner='" + owner + '\'' +
                ", teams=" + teams +
                '}';
    }
}
