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

    public CreatureGraphics(AppConsole appConsole, Creature creature) {
        this.appConsole = appConsole;
        initPanel = new InitPanel();
        textPanel = new TextPanel(appConsole, creature);

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 50));
        setBorder(BorderFactory.createLineBorder(Color.yellow));
        setOpaque(false);

        add(initPanel, BorderLayout.WEST);
        add(textPanel, BorderLayout.CENTER);
        
    }
}
