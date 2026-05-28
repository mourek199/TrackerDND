package UI;

import Commands.AppConsole;
import Creatures.Creature;
import UI.CreatureGraphicsComponents.DetailsPanel;
import UI.CreatureGraphicsComponents.InitPanel;
import UI.CreatureGraphicsComponents.TextPanel;

import javax.swing.*;
import java.awt.*;

public class CreatureGraphics extends JPanel {
    private InitPanel initPanel;
    private TextPanel textPanel;
    private DetailsPanel detailsPanel;
    private AppConsole appConsole;
    private String CreatureType;
    private Creature creature;

    public CreatureGraphics(AppConsole appConsole, Creature creature) {
        this.appConsole = appConsole;
        this.creature = creature;
        initPanel = new InitPanel(appConsole, creature);
        textPanel = new TextPanel(appConsole, creature);

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 50));
        setBorder(BorderFactory.createLineBorder(Color.yellow));
        setBackground(detectBackground());
        setOpaque(true);

        add(initPanel, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);
        
    }

    private Color detectBackground(){
        switch (creature.getType()){
            case -1 -> {
                return new Color(187, 125, 125);
            }
            case 0 -> {
                return new Color(180, 225, 177);
            }
            case 1 -> {
                return new Color(151, 192, 241);
            }
            default -> {
                return new Color(255, 255, 255);
            }
        }

    }
}
