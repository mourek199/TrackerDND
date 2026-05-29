package UI.WindowMain.CreatureGraphicsComponents;

import Commands.AppConsole;
import Conditions.CreatureCondition;
import Creatures.Creature;
import UI.CustomButton;
import UI.WindowMain.MainWindow;

import java.util.concurrent.locks.Condition;

public class ConditionButton extends CustomButton {

    private Creature creature;
    private CreatureCondition condition;
    private ConditionPanel conditionPanel;
    private MainWindow mainWindow;

    public ConditionButton(MainWindow mainWindow,ConditionPanel conditionPanel, CreatureCondition condition, Creature creature, String imgFile, String clickedImg, int width, int height) {
        super(imgFile, clickedImg, width, height);
        this.creature = creature;
        this.mainWindow = mainWindow;
        this.conditionPanel = conditionPanel;
        this.condition = condition;
        this.setToolTipText("Remove " + condition.getConditionName() + ".");

        setOpaque(false);
        addActionListener(e->{
            creature.removeCondition(condition.getConditionName());
            conditionPanel.reloadConditions();
            mainWindow.reloadMainWindow();
        });
    }
}
