package UI.WindowMain.CreatureGraphicsComponents;

import Creatures.Creature;
import UI.CreaturePopUpComponents.CreaturePopUpWindow;
import UI.CustomButton;
import UI.WindowMain.MainWindow;

public class CreatureSettingsButton extends CustomButton {

    private Creature creature;
    private MainWindow mainWindow;

    public CreatureSettingsButton(MainWindow mainWindow, Creature creature, String imgFile, String clickedImg, int width, int height) {
        super(imgFile, clickedImg, width, height);
        this.creature = creature;
        this.mainWindow = mainWindow;
        this.setToolTipText("Creature Settings");
        addActionListener(e -> {
            clicked();
        });
    }

    private void clicked(){
        new CreaturePopUpWindow(creature, mainWindow);
    }

}
