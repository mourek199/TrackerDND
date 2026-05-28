package Commands;

import GameLogic.CreatureQueue;

public class CmdNextTurn implements Command{

    CreatureQueue creatureQueue;

    public CmdNextTurn(CreatureQueue creatureQueue) {
        this.creatureQueue = creatureQueue;
    }

    @Override
    public String execute() {
        System.out.println("NEW TURN STARTED");
        creatureQueue.nextTurn();
        System.out.println(creatureQueue);
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
