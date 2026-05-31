package UI.CreaturePopUpComponents;

import Creatures.Creature;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

/**
 * Displays the name of currently edited parameter
 */
public class CreatureInfoLabel extends JPanel {

    private final Creature creature;
    @Getter
    private final TextArea textArea;

    public CreatureInfoLabel(Creature creature, String parameter) {
        this.creature = creature;

        textArea = new TextArea();
        setOpaque(false);

        switch (parameter) {
            case "name" -> {
                textArea.setText(creature.getName());
            }

            case "init" -> {
                textArea.setText(String.valueOf(creature.getInitiative()).trim());
            }
        }

        textArea.setSize(new Dimension(100, 50));
        this.add(textArea);
    }


}
