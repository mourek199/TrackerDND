package UI;

import CreaturePopUpComponents.AddConditionButton;
import CreaturePopUpComponents.CreatureInfoPanel;
import Creatures.Creature;

import javax.swing.*;
import java.awt.*;

public class CreaturePopUpWindow extends JFrame {
    private Creature creature;
    private Background bg;
    private JPanel panel;
    private AddConditionButton addConditionButton;
    private CreatureInfoPanel creatureStats;

    public CreaturePopUpWindow(Creature creature){
        super(creature.getName());
        this.creature = creature;
        this.setSize(500, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        try {
            bg = new Background("/startupScreenBackground.png");
            bg.setLayout(new BoxLayout(bg, BoxLayout.Y_AXIS));
            this.setContentPane(bg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        panel = new JPanel();
        bg.add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
