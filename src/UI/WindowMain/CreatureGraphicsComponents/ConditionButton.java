package UI.WindowMain.CreatureGraphicsComponents;

import Conditions.CreatureCondition;
import Creatures.Creature;
import UI.CustomButton;

import java.util.concurrent.locks.Condition;

public class ConditionButton extends CustomButton {

    private Creature creature;
    private CreatureCondition condition;

    public ConditionButton(CreatureCondition condition, Creature creature, String imgFile, String clickedImg, int width, int height) {
        super(imgFile, clickedImg, width, height);
        this.creature = creature;
        this.condition = condition;

        setOpaque(false);
        addActionListener(e->{
            creature.removeCondition(condition.getConditionName());
        });
    }
}
