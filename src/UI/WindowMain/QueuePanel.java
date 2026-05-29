package UI.WindowMain;

import Commands.AppConsole;
import Creatures.Creature;
import UI.CreatureGraphics;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class QueuePanel extends JPanel {

    private JPanel contentPanel;
    private JScrollPane scrollPane;

    public QueuePanel(AppConsole appConsole) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(new Color(229, 141, 141));
        scrollPane = new JScrollPane(contentPanel);
        add(scrollPane);

        reloadQueue(appConsole);
    }

    public void reloadQueue(AppConsole appConsole) {

        contentPanel.removeAll();
        List<Creature> tempList = appConsole.getWorld().getCreatureQueue().convertToList(appConsole.getWorld().getCreatureQueue().getQueue());
        JPanel addedPanel = null;
        for (int i = 0; i < 10; i++) {

            if (i<tempList.size()){
                contentPanel.add(new CreatureGraphics(appConsole, tempList.get(i)));
            }else{
                addedPanel = new JPanel();
                addedPanel.setLayout(new BorderLayout());
                addedPanel.setPreferredSize(new Dimension(700, 30));
                addedPanel.setOpaque(false);

                contentPanel.add(addedPanel);
            }

        }
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}