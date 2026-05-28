package UI.CreatureGraphicsComponents;

import Commands.AppConsole;
import Creatures.Creature;
import UI.CustomButton;
import UI.CustomImage;

import javax.swing.*;
import java.awt.*;

public class InitPanel extends JPanel {

    private String renderedText;
    private AppConsole appConsole;
    private JLabel textPane;

    public InitPanel(AppConsole appConsole, Creature creature) {
        renderedText = String.valueOf(creature.getInitiative());
        this.appConsole = appConsole;
        add(textPane = new JLabel(renderedText));
        textPane.setFont(new Font("Cascadia Code", Font.BOLD, 32));
        setOpaque(false);
    }
}
