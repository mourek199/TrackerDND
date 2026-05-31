package UI.CreaturePopUpComponents;

import Creatures.Creature;
import UI.WindowMain.MainWindow;

import javax.swing.*;
import java.awt.*;

public class CreatureTypePicker extends JPanel{

    private MainWindow mainWindow;
    private Integer[] options;
    private JComboBox<Integer> dropdown;

    public CreatureTypePicker(MainWindow mainWindow, Creature creature) {
        this.mainWindow = mainWindow;
        options = new Integer[3];
        for (int i = 0; i < options.length; i++) {
            options[i] = i-1;
        }

        dropdown = new JComboBox<>(options);
        dropdown.setMaximumSize(new Dimension(200, 35));

        JButton button = new JButton("+");

        button.addActionListener(e -> {
            int selected = (int) dropdown.getSelectedItem();
            creature.setType(selected);
            mainWindow.reloadMainWindow();
        });

        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        setOpaque(false);
        add(dropdown);
        add(button);
    }
}
