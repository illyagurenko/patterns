package behaviolar.intepreter;

public class BlockExpression implements Expression{
    @Override
    public void interpret(String context) {
        if (context.contains("B")) {
            System.out.println("B = Block");
        }
    }
}
