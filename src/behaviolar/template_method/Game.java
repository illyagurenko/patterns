package behaviolar.template_method;

public class Game {
    public static void main(String[] args) {
        Training forward = new Forward();
        Training center = new Center();
        forward.runTraining();
        center.runTraining();
    }
}
