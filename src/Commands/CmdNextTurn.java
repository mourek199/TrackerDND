package Commands;

import Conditions.CreatureCondition;
import GameLogic.CreatureQueue;
import GameLogic.GameWorld;

/**
 * starts next turn
 * @author Tony
 */
public class CmdNextTurn implements Command{

    GameWorld gameWorld;
    CreatureQueue creatureQueue;

    public CmdNextTurn(CreatureQueue creatureQueue, GameWorld gameWorld) {
        this.creatureQueue = creatureQueue;
        this.gameWorld = gameWorld;
    }

    /**
     * starts next turn
     */
    @Override
    public String execute() {
        creatureQueue.nextTurn();
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
