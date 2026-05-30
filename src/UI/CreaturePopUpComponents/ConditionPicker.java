package UI.CreaturePopUpComponents;

import Conditions.CreatureCondition;
import Creatures.Creature;
import UI.WindowMain.MainWindow;
import javax.swing.*;
import java.awt.*;

public class ConditionPicker extends JPanel {

    private MainWindow mainWindow;
    private String[] options;
    private JComboBox<String> dropdown;

    public ConditionPicker(MainWindow mainWindow,Creature creature) {
        this.mainWindow = mainWindow;
        options = new String[mainWindow.getAppConsole().getWorld().getConditions().length];
        for (int i = 0; i < mainWindow.getAppConsole().getWorld().getConditions().length; i++) {
            options[i] = mainWindow.getAppConsole().getWorld().getConditions()[i].getConditionName();
            System.out.println(options[i]);
        }
        dropdown = new JComboBox<>(options);
        dropdown.setMaximumSize(new Dimension(200, 35));

        JButton button = new JButton("+");

        button.addActionListener(e -> {
            String selected = (String) dropdown.getSelectedItem();
            creature.addCondition(mainWindow.getAppConsole().getWorld().getMapConditions().get(selected));
            mainWindow.reloadMainWindow();
        });

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        setOpaque(false);
        add(dropdown);
        add(button);
    }
}
