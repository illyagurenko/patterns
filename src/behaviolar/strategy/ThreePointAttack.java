package behaviolar.strategy;

public class ThreePointAttack implements Strategy {
    @Override
    public void attack() {
        System.out.println("Three point shoot");
    }
}
