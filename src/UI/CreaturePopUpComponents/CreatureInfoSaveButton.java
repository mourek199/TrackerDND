package UI.CreaturePopUpComponents;

import Creatures.Creature;
import UI.CustomButton;
import UI.WindowMain.MainWindow;

public class CreatureInfoSaveButton extends CustomButton {

    private Creature creature;
    private CreatureInfoLabel label;

    public CreatureInfoSaveButton(Creature creature, CreatureInfoLabel label, String imgFile, String clickedImg, int width, int height, MainWindow mainWindow) {
        super(imgFile, clickedImg, width, height);
        this.creature = creature;
        this.label = label;
        this.addActionListener(e->{
            creature.setName(label.getTextArea().getText());
            System.out.println(label.getTextArea().getText());
            mainWindow.reloadMainWindow();
        });
    }
}
