package GameLogic;

import Conditions.CreatureCondition;

public class GameWorld {
    private CreatureQueue creatureQueue;
    private CreatureCondition[] conditions;

    public GameWorld() {
        creatureQueue = new CreatureQueue();
    }

    public void setConditions(CreatureCondition[] conditions) {
        this.conditions = conditions;
    }
    public CreatureCondition[] getConditions() {
        return conditions;
    }

    public CreatureQueue getCreatureQueue() {
        return creatureQueue;
    }
}
