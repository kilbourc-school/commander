package csce247.commandHW;

public class RunCommand implements Command {
    private Player player;

    public RunCommand(Player player) {
        this.player = player;
    }

    @Override
    /**
     *calls player method
     */
    public void execute() {
        player.runForward();
    }

}
