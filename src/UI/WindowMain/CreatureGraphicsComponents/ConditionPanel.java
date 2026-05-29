package UI.WindowMain.CreatureGraphicsComponents;

import Commands.AppConsole;
import Conditions.CreatureCondition;
import Creatures.Creature;
import UI.CustomButton;
import UI.CustomImage;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ConditionPanel extends JPanel {
    private AppConsole appConsole;
    private Creature creature;
    private List<CreatureCondition> graphicConditions;


    public ConditionPanel(AppConsole appConsole, Creature creature) {
        this.creature = creature;
        graphicConditions = new ArrayList<>();
        resetList(graphicConditions);
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.appConsole = appConsole;
        this.creature = creature;
        this.setOpaque(false);
        reloadConditions();
    }

    public void reloadConditions() {
        CustomButton addedButton;
        for (CreatureCondition condition : graphicConditions) {
            addedButton = new ConditionButton(condition, creature, condition.getConditionIconPath(), condition.getConditionIconPath(), 50,50);
            add(addedButton);
            add(Box.createHorizontalStrut(5));
        }
    }
    private List resetList(List list){
        list.clear();
        for (CreatureCondition condition : creature.getConditions()){
            list.add(condition);
        }
        return list;
    }
}
