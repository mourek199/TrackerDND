package UI.WindowMain;

import Commands.AppConsole;
import Creatures.Creature;
import GameLogic.CreatureQueue;
import GameLogic.GameWorld;
import UI.CreatureGraphics;

import javax.swing.*;
import java.awt.*;

public class QueuePanel extends JPanel{
    private DefaultListModel<Creature> model = new DefaultListModel<>();
    private JList<Creature> queueList = new JList<>(model);
    private JScrollPane scrollPane;
    private AppConsole appConsole;

    public QueuePanel(AppConsole appConsole){
        this.appConsole = appConsole;
        this.setLayout(new BorderLayout());

        queueList.setBackground(new Color(164, 4, 4));
        queueList.setBorder(null);
        queueList.setFont(new Font("SansSerif", Font.BOLD, 16));

        queueList.setCellRenderer((list, creature, index, isSelected, cellHasFocus) -> {
            return new CreatureGraphics(appConsole, creature);
        });

        add(scrollPane = new JScrollPane(queueList), BorderLayout.CENTER);
        scrollPane.setBorder(null);

        reloadQueue();
    }

    public void reloadQueue(){
        model.clear();
        for (Creature creature : appConsole.getWorld().getCreatureQueue().getQueue()){
            model.addElement(creature);
        }
    }
}
