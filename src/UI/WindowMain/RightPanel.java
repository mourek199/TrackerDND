package UI.WindowMain;

import UI.CustomButton;

import javax.swing.*;
import java.awt.*;

public class RightPanel extends JPanel {

    private CustomButton nextTurn;

    public RightPanel(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(new Color(171, 171, 171));
        this.add(Box.createVerticalStrut(500));
        nextTurn = new CustomButton("/dndLogo.png", "/dndLogo.png", 100,100);
        this.add(nextTurn);
        this.add(new JButton("dsfsg"));

    }
}
