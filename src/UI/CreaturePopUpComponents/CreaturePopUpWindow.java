package UI.CreaturePopUpComponents;

import Creatures.Creature;
import UI.Background;
import UI.WindowMain.MainWindow;

import javax.swing.*;
import java.awt.*;

public class CreaturePopUpWindow extends JFrame {
    private Creature creature;
    private Background bg;
    private JPanel panel;
    private MainWindow mainWindow;
    private AddConditionButton addConditionButton;


    public CreaturePopUpWindow(Creature creature, MainWindow mainWindow){
        super(creature.getName());
        this.mainWindow = mainWindow;
        this.creature = creature;
        this.setSize(500, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());

        String paramater = "name";
        CreatureInfoPanel statName = new CreatureInfoPanel(creature, paramater, mainWindow);
        panel.add(statName, BorderLayout.NORTH);

        try {
            bg = new Background("/startupScreenBackground.png");
            bg.setLayout(new BorderLayout());
            this.setContentPane(bg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        bg.add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void saveAndClose(){
        MainWindow mainWindow;
        this.dispose();
    }
}
