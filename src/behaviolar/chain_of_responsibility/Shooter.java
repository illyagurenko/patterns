package behaviolar.chain_of_responsibility;

public class Shooter extends Player{
    @Override
    protected void shoot() {
        System.out.println("shooter shoot");
    }

    @Override
    protected void passToNext() {
        System.out.println("shooter pass center");
    }
}
