package structural.composit;

import creational.builder.BasketTeam;

public class PlayBasket {
    public static void main(String[] args) {
        Team team = new Team();

        BasketPlayer forward1 = new ForwardPlayer();
        BasketPlayer forward2 = new ForwardPlayer();
        BasketPlayer center1 = new CenterPlayer();

        team.addPlayers(forward1);
        team.addPlayers(forward2);
        team.addPlayers(center1);

        team.createTeam();


    }
}
