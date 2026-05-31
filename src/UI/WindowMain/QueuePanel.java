package UI.WindowMain;

import Commands.AppConsole;
import Conditions.CreatureCondition;
import Creatures.Creature;
import UI.CreatureGraphics;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class QueuePanel extends JPanel {

    private JPanel contentPanel;
    private JScrollPane scrollPane;
    private MainWindow mainWindow;
    private JPanel header;
    private JLabel headerText;

    /**
     * Displays the queue with all playing creatures
     * @param mainWindow
     * @param appConsole
     */
    public QueuePanel(MainWindow mainWindow, AppConsole appConsole) {
        this.mainWindow = mainWindow;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBackground(new Color(89, 119, 201));
        scrollPane = new JScrollPane(contentPanel);

        header = new JPanel();
        header.setBackground(new Color(0, 0, 0));
        header.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        header.setPreferredSize(new Dimension(0, 50));
        header.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        header.setMinimumSize(new Dimension(0, 50));
        headerText = new JLabel("CREATURE QUEUE");
        headerText.setFont(new Font("Candara", Font.BOLD, 32));
        headerText.setForeground(new Color(255, 255, 255));

        header.add(headerText);
        add(header);
        add(scrollPane);


        reloadQueue(appConsole);
    }

    public void reloadQueue(AppConsole appConsole) {

        contentPanel.removeAll();
        List<Creature> tempList = appConsole.getWorld().getCreatureQueue().convertToList(appConsole.getWorld().getCreatureQueue().getQueue());
        JPanel addedPanel = null;
        for (Creature creature : appConsole.getWorld().getCreatureQueue().getQueue()){
            contentPanel.add(new CreatureGraphics(mainWindow, appConsole, creature));
        }

        contentPanel.revalidate();
        contentPanel.repaint();
    }
}