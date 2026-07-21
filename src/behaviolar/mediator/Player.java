package behaviolar.mediator;

class Player {
    private String name;
    private Referee referee;

    public Player(String name, Referee referee) {
        this.name = name;
        this.referee = referee;
    }

    public String getName() { return name; }

    public void commitFoul() {
        System.out.println(name + " foal");
        referee.handleEvent("foal", this);
    }

    public void takeFreeThrow() {
        System.out.println(name + " shoot free");
    }
}

