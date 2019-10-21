package csce247.commandHW;

public class QuitCommand implements Command {
    private Player player;

    public QuitCommand(Player player) {
        this.player = player;
    }

    @Override
    /**
     *calls player method
     */
    public void execute() {
        System.out.println("Game over :(");
        System.exit(1);
    }


}
