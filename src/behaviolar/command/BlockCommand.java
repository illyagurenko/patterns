package behaviolar.command;

public class BlockCommand implements Command{
    Player player;

    public BlockCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.block();
    }
}
