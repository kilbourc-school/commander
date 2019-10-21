package csce247.commandHW;

public class FireCommand implements Command {
    private Player player;

    public FireCommand(Player player) {
        this.player = player;
    }

    @Override
    /**
     *calls player method
     */
    public void execute() {
        player.fire();
    }

}
