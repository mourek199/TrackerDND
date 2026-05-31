package Commands;

import Creatures.Creature;
import Creatures.CreatureNeutral;
import GameLogic.CreatureQueue;

import java.util.List;

/**
 * Sorts the creature queue
 */
public class CmdSortQueue implements Command{

        CreatureQueue creatureQueue;

        public CmdSortQueue(AppConsole appConsole) {
            creatureQueue = appConsole.getWorld().getCreatureQueue();
        }

        @Override
        public String execute() {
            List<Creature> templist = creatureQueue.convertToList(creatureQueue.getQueue());
            templist = creatureQueue.sortList(templist);
            creatureQueue.setQueue(creatureQueue.listToQueue(templist));
            return "";
        }

        @Override
        public boolean exit() {
            return false;
        }
    }
