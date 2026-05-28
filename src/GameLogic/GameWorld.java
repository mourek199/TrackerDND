package GameLogic;

import Conditions.CreatureCondition;
import Creatures.CreatureEnemy;
import Creatures.CreatureNeutral;
import Creatures.CreaturePlayer;
import lombok.Setter;

public class GameWorld {
    private CreatureQueue creatureQueue;
    @Setter
    private CreatureCondition[] conditions;

    public GameWorld() {
        creatureQueue = new CreatureQueue();
        creatureQueue.addToQueue(new CreaturePlayer("tony"));
        creatureQueue.addToQueue(new CreatureEnemy("mari (goblin)"));
        creatureQueue.addToQueue(new CreatureNeutral("goblin"));
    }

    public CreatureCondition[] getConditions() {
        return conditions;
    }

    public CreatureQueue getCreatureQueue() {
        return creatureQueue;
    }
}
