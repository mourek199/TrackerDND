package Commands;

import Creatures.Creature;
import GameLogic.CreatureQueue;
import GameLogic.GameWorld;

/**
 * adds new entity
 * @author Tony
 */
public class CmdAddNewCreature implements Command{

    GameWorld gameWorld;
    CreatureQueue creatureQueue;
    Creature fakeCreature;

    public CmdAddNewCreature(CreatureQueue creatureQueue, GameWorld gameWorld) {
        this.creatureQueue = creatureQueue;
        this.gameWorld = gameWorld;
    }

    /**
     * starts next turn
     */
    @Override
    public String execute() {

        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}

