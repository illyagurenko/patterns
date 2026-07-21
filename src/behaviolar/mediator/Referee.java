package behaviolar.mediator;


class Referee {
    private Player lakersPlayer;
    private Player bullsPlayer;

    public void registerPlayers(Player p1, Player p2) {
        this.lakersPlayer = p1;
        this.bullsPlayer = p2;
    }

    public void handleEvent(String event, Player sender) {
        if (event.equals("foal")) {
            System.out.println("foal for  " + sender.getName());

            if (sender == lakersPlayer) {
                bullsPlayer.takeFreeThrow();
            } else {
                lakersPlayer.takeFreeThrow();
            }
        }
    }
}
