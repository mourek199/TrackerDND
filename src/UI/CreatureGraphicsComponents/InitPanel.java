package UI.CreatureGraphicsComponents;

import UI.CustomButton;
import UI.CustomImage;

import javax.swing.*;

public class InitPanel extends JPanel {

    public InitPanel() {
        CustomImage customImage = new CustomImage("res/dndLogo.png", 50,50, true);
        this.add(customImage.getPicLabel());
        setOpaque(false);
    }
}
