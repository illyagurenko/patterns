package behaviolar.intepreter;

public class PlayInterpreter implements Expression{
    private Expression blockRule = new BlockExpression();
    private Expression shootRule = new ShootExpression();
    @Override
    public void interpret(String context) {
        String[] commands = context.split(" ");

        for (String command : commands) {
            blockRule.interpret(command);
            shootRule.interpret(command);
        }
    }
}
