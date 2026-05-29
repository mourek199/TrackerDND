package CreaturePopUpComponents;

import Commands.AppConsole;
import Creatures.Creature;
import GameLogic.CreatureQueue;
import UI.CustomButton;

public class AddConditionButton extends CustomButton {

    private Creature creature;

    public AddConditionButton(Creature creature, String imgFile, String clickedImg, int width, int height) {
        super(imgFile, clickedImg, width, height);
        this.creature = creature;
    }
}
