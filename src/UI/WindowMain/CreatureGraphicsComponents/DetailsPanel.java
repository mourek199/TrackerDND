package UI.WindowMain.CreatureGraphicsComponents;

import Commands.AppConsole;
import Creatures.Creature;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

public class DetailsPanel extends JPanel {

    private AppConsole appConsole;
    private JLabel textPane;
    private String renderedText;
    private Creature creature;
    @Getter
    private ConditionPanel conditionPanel;
    private CreatureSettingsPanel settingsPanel;

    public DetailsPanel(AppConsole appConsole, Creature creature) {
        this.creature = creature;
        setLayout(new BorderLayout());
        conditionPanel = new ConditionPanel(appConsole, creature);
        settingsPanel = new CreatureSettingsPanel(creature);
        this.add(conditionPanel, BorderLayout.WEST);
        this.add(settingsPanel, BorderLayout.EAST);
        this.setOpaque(false);
    }

}
