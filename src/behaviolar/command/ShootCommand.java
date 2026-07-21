package behaviolar.command;

public class ShootCommand implements Command{
    Player player;

    public ShootCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.shoot();
    }
}