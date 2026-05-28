package UI.CreatureGraphicsComponents;

import Commands.AppConsole;
import Creatures.Creature;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private AppConsole appConsole;
    private JLabel textPane;
    private String renderedText;

    public TextPanel(AppConsole appConsole, Creature creature) {
        renderedText = creature.getName();
        this.appConsole = appConsole;
        add(textPane = new JLabel(renderedText));
        textPane.setFont(new Font("Cascadia Code", Font.BOLD, 32));
        setOpaque(false);
    }
}
