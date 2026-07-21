package behaviolar.command;

public class BasketPlayer {
    Command shoot;
    Command block;

    public BasketPlayer(Command shoot, Command block) {
        this.shoot = shoot;
        this.block = block;
    }

    public void shootBall(){
        shoot.execute();
    }

    public void blockBall(){
        block.execute();
    }
}
