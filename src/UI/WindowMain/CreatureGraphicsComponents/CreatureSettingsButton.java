package UI.WindowMain.CreatureGraphicsComponents;

import Creatures.Creature;
import UI.CreatureGraphics;
import UI.CreaturePopUpWindow;
import UI.CustomButton;
import UI.Startup.StartupMenu;

public class CreatureSettingsButton extends CustomButton {

    private Creature creature;

    public CreatureSettingsButton(Creature creature, String imgFile, String clickedImg, int width, int height) {
        super(imgFile, clickedImg, width, height);
        this.creature = creature;
        addActionListener(e -> {
            clicked();
        });
    }

    private void clicked(){
        new CreaturePopUpWindow(creature);
    }

}
