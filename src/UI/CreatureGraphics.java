package UI;

import Commands.AppConsole;
import Creatures.Creature;
import UI.WindowMain.CreatureGraphicsComponents.DetailsPanel;
import UI.WindowMain.CreatureGraphicsComponents.InitPanel;
import UI.WindowMain.CreatureGraphicsComponents.TextPanel;
import UI.WindowMain.MainWindow;

import javax.swing.*;
import java.awt.*;

public class CreatureGraphics extends JPanel {
    private InitPanel initPanel;
    private TextPanel textPanel;
    private DetailsPanel detailsPanel;
    private AppConsole appConsole;
    private String CreatureType;
    private Creature creature;
    private MainWindow mainWindow;

    public CreatureGraphics(MainWindow mainWindow, AppConsole appConsole, Creature creature) {
        this.mainWindow = mainWindow;
        this.appConsole = appConsole;
        this.creature = creature;
        initPanel = new InitPanel(appConsole, creature);
        textPanel = new TextPanel(appConsole, creature);
        detailsPanel = new DetailsPanel(mainWindow, appConsole, creature);

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(700, 30));
        setBorder(BorderFactory.createLineBorder(new Color(238, 238, 238), 2));
        setBackground(detectBackground());
        setOpaque(true);

        add(initPanel, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);
        add(detailsPanel, BorderLayout.EAST);

        initPanel.setAlignmentY(CENTER_ALIGNMENT);
        textPanel.setAlignmentY(CENTER_ALIGNMENT);
        detailsPanel.setAlignmentY(CENTER_ALIGNMENT);

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
