package UI.CreaturePopUpComponents;

import Creatures.Creature;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

public class CreatureInfoLabel extends JPanel {

    private Creature creature;
    @Getter
    private TextArea textArea;

    public CreatureInfoLabel(Creature creature, String parameter) {
        this.creature = creature;

        textArea = new TextArea();
        setOpaque(false);

        switch (parameter){
            case "name" -> {
                textArea.setText(creature.getName());
            }

            case "init" -> {
                textArea.setText(String.valueOf(creature.getInitiative()).trim());
            }
        }

        textArea.setSize(new Dimension(100,50));
        this.add(textArea);
    }


}
