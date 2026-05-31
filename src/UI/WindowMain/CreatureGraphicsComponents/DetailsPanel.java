package UI.WindowMain.CreatureGraphicsComponents;

import Commands.AppConsole;
import Creatures.Creature;
import UI.WindowMain.MainWindow;
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
    private MainWindow mainWindow;

    /**
     * displays creature conditions panel and creature settings button
     * @param mainWindow
     * @param appConsole
     * @param creature
     */
    public DetailsPanel(MainWindow mainWindow,AppConsole appConsole, Creature creature) {
        this.mainWindow = mainWindow;
        this.creature = creature;
        setLayout(new BorderLayout());
        conditionPanel = new ConditionPanel(mainWindow, appConsole, creature);
        settingsPanel = new CreatureSettingsPanel(creature, mainWindow);
        this.add(conditionPanel, BorderLayout.WEST);
        this.add(settingsPanel, BorderLayout.EAST);
        this.setOpaque(false);
    }

}
