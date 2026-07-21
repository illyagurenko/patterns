package structural.facade;

public class GameFacade {
    private PlayersPlay playersPlay = new PlayersPlay();
    private WorkCouch workCouch = new WorkCouch();
    private WorkReferi workReferi = new WorkReferi();

    public void freeKick(){
        System.out.println("imitation foul+free kick");
        workReferi.foul();
        workCouch.timeout();
        workCouch.replacement();
        playersPlay.shoot();
        playersPlay.run();
    }

    public void timeoutReplacemet(){
        System.out.println("imitation timeout + replacement");
        workReferi.pause();
        playersPlay.run();
        workCouch.replacement();

    }
}
