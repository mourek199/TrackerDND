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

    public GameWorld() {
        mapConditions = new HashMap<>();
        conditions = new CreatureCondition[11];
        creatureQueue = new CreatureQueue();
        creatureQueue.addToQueue(new CreaturePlayer("tony"), 5);
        creatureQueue.addToQueue(new CreaturePlayer("mari"));
        creatureQueue.addToQueue(new CreatureEnemy("goblin"), 9);
        creatureQueue.addToQueue(new CreatureEnemy("Elemental"));
        creatureQueue.addToQueue(new CreatureNeutral("Sheep"), 19);
        creatureQueue.addToQueue(new CreaturePlayer("Bartolomej"));
        creatureQueue.addToQueue(new CreatureEnemy("Warg"), 9);
        creatureQueue.addToQueue(new CreatureEnemy("Pig"));
        creatureQueue.addToQueue(new CreatureNeutral("Gerda"), 19);

    }

    public HashMap buildConditionMap(){
        for (CreatureCondition condition : conditions){
            mapConditions.put(condition.getConditionName(), condition);
        }
        return mapConditions;
    }
}
