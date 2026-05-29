package CreaturePopUpComponents;

import Creatures.Creature;

import javax.swing.*;
import java.awt.*;

public class CreatureInfoPanel extends JPanel {
    private Creature creature;
    private JPanel properties;

    public CreatureInfoPanel(Creature creature) {
        this.creature = creature;
        properties = new JPanel(new BorderLayout());
        setOpaque(false);
    }

}
