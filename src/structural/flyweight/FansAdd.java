package structural.flyweight;

public class FansAdd {
    public static void main(String[] args) {
        BasketFan fan1 = FanFactory.getFanByTeam("LAL");
        fan1.fun();

        BasketFan fan2 = FanFactory.getFanByTeam("LAL");
        fan2.fun();

        BasketFan fan3 = FanFactory.getFanByTeam("LAC");
        fan3.fun();

        BasketFan fan4 = FanFactory.getFanByTeam("LAL");
        fan4.fun();

        System.out.println("fan1 and fan4 equals object? " + (fan1 == fan4));
    }
}
