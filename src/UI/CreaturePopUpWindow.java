package UI;

import Creatures.Creature;

import javax.swing.*;
import java.awt.*;

public class CreaturePopUpWindow extends JFrame {
    private Creature creature;
    private Background bg;
    private JPanel panel;
    private JPanel creatureStats;

    public CreaturePopUpWindow(Creature creature){
        super(creature.getName());
        this.creature = creature;

        this.setSize(500, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
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
