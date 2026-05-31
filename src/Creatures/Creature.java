package Creatures;

import Conditions.CreatureCondition;
import UI.WindowMain.CreatureGraphicsComponents.ConditionPanel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

/**
 * an entity with an initiative
 * @author Tony
 */
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

    /**
     * adds a condition to desired creature
     * @param creatureCondition added condition
     * @return added condition
     */
    public CreatureCondition addCondition(CreatureCondition creatureCondition){
        conditions.add(creatureCondition);
        return creatureCondition;
    }

    /**
     * removes a condition from a creature
     * @param conditionName name of removed condition
     * @return removed condition
     */
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
