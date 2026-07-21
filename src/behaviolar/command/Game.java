package behaviolar.command;

public class Game {
    public static void main(String[] args) {
        Player player = new Player();
        BasketPlayer basketPlayer = new BasketPlayer(
                new ShootCommand(player),
                new BlockCommand(player)
        );

        basketPlayer.shootBall();
        basketPlayer.blockBall();


    }

}
