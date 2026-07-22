package behaviolar.strategy;

public class TwoPointAttack implements Strategy {
    @Override
    public void attack() {
        System.out.println("middle shoot");
    }
}
