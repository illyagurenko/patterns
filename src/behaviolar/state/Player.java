package behaviolar.state;

public class Player {
    private State curState;


    public Player() {
        this.curState = new ThreePointAttack();
    }

    public void setCurState(State curState) {
        this.curState = curState;
    }
    public void doAction(){
        curState.attack();
    }
}
