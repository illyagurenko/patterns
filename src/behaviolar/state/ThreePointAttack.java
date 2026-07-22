package behaviolar.state;

public class ThreePointAttack implements State{
    @Override
    public void attack() {
        System.out.println("Three point shoot");
    }
}
