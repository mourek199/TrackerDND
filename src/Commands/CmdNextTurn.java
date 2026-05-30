package Commands;

import Conditions.CreatureCondition;
import GameLogic.CreatureQueue;
import GameLogic.GameWorld;

public class CmdNextTurn implements Command{

    GameWorld gameWorld;
    CreatureQueue creatureQueue;

    public CmdNextTurn(CreatureQueue creatureQueue, GameWorld gameWorld) {
        this.creatureQueue = creatureQueue;
        this.gameWorld = gameWorld;
    }

    @Override
    public String execute() {
        System.out.println("NEW TURN STARTED");
        creatureQueue.nextTurn();
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
