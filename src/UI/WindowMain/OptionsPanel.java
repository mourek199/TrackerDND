package UI.WindowMain;

import Commands.AppConsole;
import Creatures.Creature;
import GameLogic.CreatureQueue;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * This class stores buttons that can modify the app. For example creature removal buttons by category
 */
public class OptionsPanel extends JButton {
    private AppConsole appConsole;
    private JButton removeEnemies;
    private JButton removePlayers;
    private JButton removeNeutral;
    private JButton removeAll;
    private JButton newCreature;
    private JButton sortQueue;
    public OptionsPanel(AppConsole appConsole, MainWindow mainWindow) {
        this.appConsole = appConsole;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        removeAll = new JButton("REMOVE ALL");
        removeNeutral = new JButton("REMOVE ALL NEUTRAL");
        removeEnemies = new JButton("REMOVE ALL ENEMIES");
        removePlayers = new JButton("REMOVE ALL PLAYERS");
        newCreature = new JButton("ADD NEW CREATURE");
        sortQueue = new JButton("SORT QUEUE");

        add(removeAll);
        add(removeEnemies);
        add(removeNeutral);
        add(removePlayers);
        add(newCreature);
        add(sortQueue);

        removeNeutral.addActionListener(e -> {
            CreatureQueue queue = appConsole.getWorld().getCreatureQueue();
            List<Creature> creatures = queue.convertToList(queue.getQueue());
            creatures.removeIf(creature -> creature.getType() == 0);
            queue.listToQueue(creatures);
            mainWindow.reloadMainWindow();
        });
        removeEnemies.addActionListener(e -> {
            CreatureQueue queue = appConsole.getWorld().getCreatureQueue();
            List<Creature> creatures = queue.convertToList(queue.getQueue());
            creatures.removeIf(creature -> creature.getType() == -1);
            queue.listToQueue(creatures);
            mainWindow.reloadMainWindow();
        });
        removePlayers.addActionListener(e -> {
            CreatureQueue queue = appConsole.getWorld().getCreatureQueue();
            List<Creature> creatures = queue.convertToList(queue.getQueue());
            creatures.removeIf(creature -> creature.getType() == 1);
            queue.listToQueue(creatures);
            mainWindow.reloadMainWindow();
        });
        removeAll.addActionListener(e -> {
            CreatureQueue queue = appConsole.getWorld().getCreatureQueue();
            List<Creature> creatures = queue.convertToList(queue.getQueue());
            creatures.removeAll(creatures);
            queue.listToQueue(creatures);
            mainWindow.reloadMainWindow();
        });
        newCreature.addActionListener(e->{
            mainWindow.getAppConsole().execute("addCreature");
            mainWindow.reloadMainWindow();
        });
        sortQueue.addActionListener(e-> {
            mainWindow.getAppConsole().execute("sortQueue");
            mainWindow.reloadMainWindow();
        });
        changeButtonsStyle();
    }
    private void changeButtonsStyle(){
        for (Component component : this.getComponents()){
            if (component.getClass() == JButton.class){
                component.setBackground(new Color(0, 63, 255));
            }
        }
    }
}
