package UI.CreatureGraphicsComponents;

import Commands.AppConsole;
import Creatures.Creature;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JPanel {
    private AppConsole appConsole;
    private TextArea textArea;
    private String renderedText;

    public TextPanel(AppConsole appConsole, Creature creature) {
        renderedText = creature.getName();
        this.appConsole = appConsole;
        add(textArea = new TextArea(renderedText));
        setOpaque(false);
    }
}
