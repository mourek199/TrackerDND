package Commands;

import GameLogic.CreatureQueue;

public class CmdNextTurn implements Command{

    CreatureQueue creatureQueue;

    public CmdNextTurn(CreatureQueue creatureQueue) {
        this.creatureQueue = creatureQueue;
    }

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
