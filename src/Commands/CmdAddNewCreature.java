package Commands;

import Creatures.Creature;
import Creatures.CreatureNeutral;
import GameLogic.CreatureQueue;

/**
 * Adds a new entity.
 * @author Tony
 */
public class CmdAddNewCreature implements Command {

    private final CreatureQueue creatureQueue;

    public CmdAddNewCreature(AppConsole appConsole) {
        this.creatureQueue = appConsole.getWorld().getCreatureQueue();
    }

    @Override
    public String execute() {
        Creature creature = new CreatureNeutral("NEW CREATURE");
        creature.setInitiative(0);
        creatureQueue.addToQueue(creature);
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}