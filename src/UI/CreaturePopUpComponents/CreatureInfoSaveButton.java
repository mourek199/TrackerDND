package UI.CreaturePopUpComponents;

import Creatures.Creature;
import UI.CustomButton;
import UI.WindowMain.MainWindow;

/**
 * Saves the value that has been set in the label next to it
 */
public class CreatureInfoSaveButton extends CustomButton {

    private final Creature creature;
    private final CreatureInfoLabel label;

    public CreatureInfoSaveButton(Creature creature, CreatureInfoLabel label, String imgFile, String clickedImg, int width, int height, MainWindow mainWindow, String parameter) {
        super(imgFile, clickedImg, width, height);
        this.creature = creature;
        this.label = label;
        switch (parameter) {
            case "name" -> {
                this.addActionListener(e -> {
                    creature.setName(label.getTextArea().getText());
                    System.out.println(label.getTextArea().getText());
                    mainWindow.reloadMainWindow();
                });
            }
            case "init" -> {
                this.addActionListener(e -> {
                    creature.setInitiative(Integer.parseInt(label.getTextArea().getText()));
                    System.out.println(label.getTextArea().getText());
                    mainWindow.reloadMainWindow();
                });
            }
        }
    }
}
