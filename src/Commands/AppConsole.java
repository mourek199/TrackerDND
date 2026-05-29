package Commands;

import Conditions.CreatureCondition;
import Creatures.Creature;
import GameLogic.GameWorld;
import UI.Startup.StartupMenu;
import Utilities.GameData;
import lombok.Getter;

import java.util.HashMap;

/**
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
        for(Creature creature : world.getCreatureQueue().getQueue()){
            creature.addCondition(world.getMapConditions().get("Charmed"));
            creature.addCondition(world.getMapConditions().get("Blinded"));
        }
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

