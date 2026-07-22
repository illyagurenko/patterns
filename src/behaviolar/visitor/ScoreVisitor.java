package behaviolar.visitor;

public class ScoreVisitor implements Visitor{
    private int totalTeamPoints = 0;

    @Override
    public void visitForward(Forward forward) {
        totalTeamPoints += forward.threes * 3;
    }

    @Override
    public void visitCenter(Center center) {
        totalTeamPoints += center.dunks * 2;
    }

    public int getTotalTeamPoints() {
        return totalTeamPoints;
    }
}
