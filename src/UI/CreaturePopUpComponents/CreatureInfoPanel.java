package UI.CreaturePopUpComponents;

import Creatures.Creature;
import UI.WindowMain.MainWindow;

import javax.swing.*;
import java.awt.*;

public class CreatureInfoPanel extends JPanel {
    private Creature creature;
    private CreatureInfoLabel label;

    private String parameter;

    public CreatureInfoPanel(Creature creature, String parameter, MainWindow mainWindow) {
        this.creature = creature;
        this.parameter = parameter;
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.label = new CreatureInfoLabel(creature, parameter);
        CreatureInfoSaveButton saveButton = new CreatureInfoSaveButton(creature, label,"/play.png", "/play.png", 40,40, mainWindow);
        add(label);
        add(saveButton);


        setOpaque(false);
    }

}
