package Creatures;

import Conditions.CreatureCondition;
import UI.WindowMain.CreatureGraphicsComponents.ConditionPanel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public abstract class Creature {
    private String name;
    private int type;
    private ArrayList<CreatureCondition> conditions;
    private int initiative;

    public Creature(String name) {
        this.name = name;
        conditions = new ArrayList<>();
    }

    public CreatureCondition addCondition(CreatureCondition creatureCondition){
        conditions.add(creatureCondition);
        return creatureCondition;
    }

    public CreatureCondition removeCondition(String conditionName){
        for (CreatureCondition creatureCondition : conditions){
            if (creatureCondition.getConditionName().equalsIgnoreCase(conditionName)){
                conditions.remove(creatureCondition);
                return creatureCondition;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "{" +this.initiative + " " + this.name + "}";

    }
}
