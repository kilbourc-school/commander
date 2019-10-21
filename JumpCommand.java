package csce247.commandHW;

public class JumpCommand implements Command {
    private Player player;

    public JumpCommand(Player player) {
        this.player = player;
    }


    @Override
    /**
     *calls player method
     */
    public void execute() {
        player.jump();
    }
}
