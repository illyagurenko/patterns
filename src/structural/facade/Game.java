package structural.facade;

public class Game {
    public static void main(String[] args) {
        GameFacade gameFacade = new GameFacade();
        gameFacade.freeKick();
        System.out.println("end first quarter");
        gameFacade.timeoutReplacemet();
    }
}
