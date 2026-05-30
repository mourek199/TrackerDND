package UI.WindowMain.CreatureGraphicsComponents;

import Creatures.Creature;
import Main.Main;
import UI.CustomButton;
import UI.WindowMain.MainWindow;

import javax.swing.*;
import java.awt.*;

public class CreatureSettingsPanel extends JPanel {
    private CreatureSettingsButton creatureSettingsButton;
    private Creature creature;
    private MainWindow mainWindow;

    public CreatureSettingsPanel(Creature creature, MainWindow mainWindow) {
        this.creature = creature;
        this.mainWindow = mainWindow;
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setOpaque(false);
        this.setBorder(BorderFactory.createLineBorder(new Color(238, 238, 238), 1));

        creatureSettingsButton = new CreatureSettingsButton(mainWindow, creature,"/CreatureSettings.png", "/CreatureSettings.png", 30,30);
        creatureSettingsButton.setAlignmentY(CENTER_ALIGNMENT);
        add(creatureSettingsButton);
    }


}
