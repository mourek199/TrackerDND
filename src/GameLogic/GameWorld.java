package GameLogic;

import Conditions.CreatureCondition;
import Creatures.CreatureEnemy;
import Creatures.CreatureNeutral;
import Creatures.CreaturePlayer;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Setter
@Getter
public class GameWorld {
    private CreatureQueue creatureQueue;
    private CreatureCondition[] conditions;
    private HashMap<String, CreatureCondition> mapConditions;

    /**
     * Stores the most important data such as creatures and conditions
     */
    public GameWorld() {
        mapConditions = new HashMap<>();
        creatureQueue = new CreatureQueue();
        creatureQueue.addToQueue(new CreaturePlayer("Tony"), 5);
        creatureQueue.addToQueue(new CreaturePlayer("Mari"));
        creatureQueue.addToQueue(new CreatureEnemy("Goblin"), 9);
        creatureQueue.addToQueue(new CreatureEnemy("Elemental"));
        creatureQueue.addToQueue(new CreatureNeutral("Sheep"), 19);
        creatureQueue.addToQueue(new CreaturePlayer("Bartolomej"));
        creatureQueue.addToQueue(new CreatureEnemy("Warg"), 9);
        creatureQueue.addToQueue(new CreatureEnemy("Pig"));
    }

    /**
     * creates a hash map of conditions
     * @return hash map
     */
    public HashMap buildConditionMap(){
        for (CreatureCondition condition : conditions){
            mapConditions.put(condition.getConditionName(), condition);
        }
        return mapConditions;
    }
}
