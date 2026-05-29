package UI.WindowMain.CreatureGraphicsComponents;

import Creatures.Creature;
import UI.CustomButton;

import javax.swing.*;
import java.awt.*;

public class CreatureSettingsPanel extends JPanel {
    private CreatureSettingsButton creatureSettingsButton;
    private Creature creature;

    public CreatureSettingsPanel(Creature creature) {
        this.creature = creature;
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setOpaque(false);
        this.setBorder(BorderFactory.createLineBorder(new Color(238, 238, 238), 1));

        creatureSettingsButton = new CreatureSettingsButton(creature, "/CreatureSettings.png", "/CreatureSettings.png", 30,30);
        creatureSettingsButton.setAlignmentY(CENTER_ALIGNMENT);
        add(creatureSettingsButton);
    }


}
