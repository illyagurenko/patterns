package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FanFactory {
    public static final Map<String, BasketFan> fans = new HashMap<>();

    public static BasketFan getFanByTeam(String team){
        BasketFan fan = fans.get(team);

        if (fan == null) {
            if (team.equalsIgnoreCase("LAL")) {
                fan = new LALFan();
                System.out.println("lal in memory");
            } else if (team.equalsIgnoreCase("LAC")) {
                fan = new LACFan();
                System.out.println("lac in memory");
            } else {
                throw new IllegalArgumentException();
            }
            fans.put(team, fan);
        }
        return fan;
    }

}
