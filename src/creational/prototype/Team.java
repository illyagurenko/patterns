package creational.prototype;

public class Team implements Copyable{
    private String titleTeam;
    private String coach;

    public Team(String titleTeam, String coach) {
        this.titleTeam = titleTeam;
        this.coach = coach;
    }

    public String getTitleTeam() {
        return titleTeam;
    }

    public String getCoach() {
        return coach;
    }

    public void setTitleTeam(String titleTeam) {
        this.titleTeam = titleTeam;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @Override
    public Object copy() {
        Team copy = new Team(titleTeam, coach);
        return copy;
    }

    @Override
    public String toString() {
        return "Team{" +
                "titleTeam='" + titleTeam + '\'' +
                ", coach='" + coach + '\'' +
                '}';
    }
}
