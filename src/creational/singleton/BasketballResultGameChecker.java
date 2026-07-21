package creational.singleton;

public class BasketballResultGameChecker {
    private static BasketballResultGameChecker checker;
    private static String resultsGames = "History and result game \n";

    private BasketballResultGameChecker() {
    }

    public static BasketballResultGameChecker getInstance() {
        if(checker == null){
            checker = new BasketballResultGameChecker();
        }
        return checker;
    }


    public void addResult(String resultGame){
        resultsGames+= resultGame + "\n";
    }

    public void showAllRes(){
        System.out.println(resultsGames);
    }
}
