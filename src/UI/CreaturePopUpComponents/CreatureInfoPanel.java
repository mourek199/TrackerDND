package UI.CreaturePopUpComponents;

import Creatures.Creature;
import UI.WindowMain.MainWindow;

import javax.swing.*;
import java.awt.*;

public class CreatureInfoPanel extends JPanel {
    private Creature creature;
    private CreatureInfoLabel label;

    public CreatureInfoPanel(Creature creature, String parameter, MainWindow mainWindow) {
        this.creature = creature;
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.label = new CreatureInfoLabel(creature, parameter);
        label.setMaximumSize(new Dimension(500,50));
        this.setMaximumSize(new Dimension(500,50));
        CreatureInfoSaveButton saveButton = new CreatureInfoSaveButton(creature, label,"/flopyDisk.png", "/flopyDisk.png", 20,20, mainWindow, parameter);
        add(label);
        add(saveButton);
        setOpaque(false);
    }

}
