package Commands;

import Commands.Command;
import GameLogic.GameWorld;
import UI.Startup.StartupMenu;
import Utilities.GameData;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Scanner;

/**
 * This class is used for typing and executing commands.
 * @author Tony
 */
public class GameConsole {

    private Scanner sc;
    private GameData gameData = new GameData();
    private GameWorld world = new GameWorld();
    private HashMap<String, Command> availableCommands;
    private boolean shouldExit;

    public GameConsole() {
        shouldExit = false;
        availableCommands = new HashMap<>();
    }

    /**
     *Initializes the game and creates the commands
     */
    public void innit(){
        availableCommands.put("nextTurn", new CmdNextTurn(world.getCreatureQueue()));
        loadStuff();
        new StartupMenu();
    }

    /**
     * loads data from resource root
     */
    public void loadStuff(){
        try {
            gameData.loadConditions(world);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * Scans for input and executes desired command
     */
    public void execute(){

    }

    public void start(){
        innit();
        do {
            execute();
        } while (true);
    }


}

