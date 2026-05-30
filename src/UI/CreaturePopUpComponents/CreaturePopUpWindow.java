package UI.CreaturePopUpComponents;

import Creatures.Creature;
import UI.Background;
import UI.WindowMain.MainWindow;

import javax.swing.*;
import java.awt.*;

public class CreaturePopUpWindow extends JDialog {
    private Creature creature;
    private Background bg;
    private JPanel panel;
    private MainWindow mainWindow;
    private ConditionPicker conditionPicker;

    public CreaturePopUpWindow(Creature creature, MainWindow mainWindow){
        super(mainWindow, creature.getName(), true);
        this.mainWindow = mainWindow;
        this.creature = creature;
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(mainWindow);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);


        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        JLabel propertiesLabel = new JLabel("Properties:");
        propertiesLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        propertiesLabel.setFont(new Font("Candara", Font.BOLD, 20));
        CreatureInfoPanel statName = new CreatureInfoPanel(creature, "name", mainWindow);
        CreatureInfoPanel statInit = new CreatureInfoPanel(creature, "init", mainWindow);

        conditionPicker = new ConditionPicker(mainWindow, creature);
        panel.add(propertiesLabel);
        panel.add(statName);
        panel.add(statInit);
        panel.add(Box.createVerticalStrut(5));
        panel.add(conditionPicker);


        try {
            bg = new Background("/startupScreenBackground.png");
            bg.setLayout(new BorderLayout());
            this.setContentPane(bg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        bg.add(panel, BorderLayout.NORTH);

        setVisible(true);
    }

    public void saveAndClose(){
        MainWindow mainWindow;
        this.dispose();
    }
}
