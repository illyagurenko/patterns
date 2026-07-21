package structural.composit;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<BasketPlayer> players = new ArrayList<>();

    public void addPlayers(BasketPlayer player){
        players.add(player);
    }

    public void removePlayers(BasketPlayer player){
        players.remove(player);
    }

    public void createTeam(){
        System.out.println("players create team");
        for(BasketPlayer player : players){
            player.play();
        }
    }
}
