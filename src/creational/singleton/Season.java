package creational.singleton;

public class Season {
    public static void main(String[] args) {
        BasketballResultGameChecker.getInstance().addResult("LA 121:134 Memphis");
        BasketballResultGameChecker.getInstance().addResult("LC 111:98 Dallas");
        BasketballResultGameChecker.getInstance().addResult("Okchlachoma 81:140 Indiana");
        BasketballResultGameChecker.getInstance().showAllRes();
    }
}
