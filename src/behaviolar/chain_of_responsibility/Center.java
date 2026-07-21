package behaviolar.chain_of_responsibility;

public class Center extends Player{
    protected void shoot() { System.out.println("center shoot!"); }
    protected void passToNext() {}
}
