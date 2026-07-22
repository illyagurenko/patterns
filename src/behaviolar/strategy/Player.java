package behaviolar.strategy;

public class Player {
    private Strategy curStrategy;


    public void setCurStrategy(Strategy curStrategy) {
        this.curStrategy = curStrategy;
    }
    public void doAction(){
        curStrategy.attack();
    }
}
