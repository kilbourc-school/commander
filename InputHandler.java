package csce247.commandHW;

import java.util.HashMap;

public class InputHandler {
    HashMap<String, Command> Commands = new HashMap<>();
    /**
     * handle user input, calls respective command
     */
    public InputHandler(Player player) {
        Commands.put("jump", new JumpCommand(player));
        Commands.put("run", new RunCommand(player));
        Commands.put("fire", new FireCommand(player));
        Commands.put("quit", new QuitCommand(player));

    }
    /**
     *executes hashmap commands
     */
    public void buttonPressed(String button){
        if(Commands.containsKey(button))
Commands.get(button).execute();
        else
            System.out.println("wrong input");

    }

}
