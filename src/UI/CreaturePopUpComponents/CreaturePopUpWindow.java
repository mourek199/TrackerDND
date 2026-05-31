package UI.CreaturePopUpComponents;

import Creatures.Creature;
import UI.Background;
import UI.WindowMain.MainWindow;

import javax.swing.*;
import java.awt.*;

public class CreaturePopUpWindow extends JDialog {
    private final Creature creature;
    private final Background bg;
    private final JPanel panel;
    private final MainWindow mainWindow;
    private final ConditionPicker conditionPicker;
    private final CreatureTypePicker creatureTypePicker;

    /**
     * a window that pops up when you click a creature setting button
     * @param creature specified creature
     * @param mainWindow
     */
    public CreaturePopUpWindow(Creature creature, MainWindow mainWindow) {
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

        creatureTypePicker = new CreatureTypePicker(mainWindow, creature);
        conditionPicker = new ConditionPicker(mainWindow, creature);
        panel.add(propertiesLabel);
        panel.add(statName);
        panel.add(statInit);
        panel.add(Box.createVerticalStrut(5));
        panel.add(conditionPicker);
        panel.add(Box.createVerticalStrut(5));
        panel.add(creatureTypePicker);


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
}
