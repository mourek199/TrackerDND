package Commands;

import Conditions.CreatureCondition;
import Creatures.Creature;
import GameLogic.GameWorld;
import UI.Startup.StartupMenu;
import Utilities.GameData;
import lombok.Getter;

import java.util.HashMap;

/**
 * manages the app cycle
 * @author Tony
 */

@Getter
public class AppConsole {

    private GameData gameData = new GameData();
    private GameWorld world = new GameWorld();
    private HashMap<String, Command> availableCommands;
    private boolean shouldExit;

    public AppConsole() {
        shouldExit = false;
        availableCommands = new HashMap<>();
    }

    /**
     *Initializes the game and creates the commands
     */
    public void innit(){
        availableCommands.put("nextTurn", new CmdNextTurn(world.getCreatureQueue(), world));
        loadStuff();
        world.buildConditionMap();
        new StartupMenu(this);
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
    public void execute(String commandName){
        availableCommands.get(commandName).execute();
    }

    public void start(){
        innit();
    }
}

