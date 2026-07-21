package behaviolar.intepreter;

public class Game {
    public static void main(String[] args) {
        Expression expression = new PlayInterpreter();
        String coachSecretCode = "B S";
        expression.interpret(coachSecretCode);
        expression.interpret("S");
    }
}
