package UI.WindowMain;

import Commands.CmdNextTurn;
import GameLogic.GameWorld;
import UI.CustomButton;

import javax.swing.*;
import java.awt.*;

public class TurnsPanel extends JPanel {
    private CustomButton customButton;

    public TurnsPanel() {
        this.setBackground(new Color(0,0,0));
        customButton = new CustomButton("/dndLogo.png", "/dndLogo.png", 50,50);
        customButton.addActionListener(e -> {
            System.out.println("its new turn!");
        });
        this.add(customButton);
    }
}
