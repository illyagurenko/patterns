package behaviolar.intepreter;

public class ShootExpression implements Expression{
    @Override
    public void interpret(String context) {
        if (context.contains("S")) {
            System.out.println("S = Shoot");
        }
    }
}