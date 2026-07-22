package behaviolar.visitor;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<PlayerElement> team = new ArrayList<>();
        team.add(new Forward());
        team.add(new Center());

        ScoreVisitor score = new ScoreVisitor();

        for (PlayerElement player : team) {
            player.accept(score);
        }

        System.out.println("total score: " + score.getTotalTeamPoints());
    }
}
