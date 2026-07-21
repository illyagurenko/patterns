package creational.prototype;

public class BuyNewCoach {
    public static void main(String[] args) {
        Team team = new Team("LA", "coach1");
        System.out.println(team);

        Team updateTeam = (Team) team.copy();
        updateTeam.setCoach("coach2");
        System.out.println(updateTeam);
    }
}
