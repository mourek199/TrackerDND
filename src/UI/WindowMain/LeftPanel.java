package UI.WindowMain;

import javax.swing.*;
import java.awt.*;

public class LeftPanel extends JPanel {
    /**
     * Contains QueuePanel and LocationDescriptionPanel
     */
    public LeftPanel(){
        setLayout(new BorderLayout());
        setOpaque(false);
        setBorder(BorderFactory.createLineBorder(Color.black));
        setPreferredSize(new Dimension(800, Integer.MAX_VALUE));
        setMaximumSize(new Dimension(this.getMaximumSize().width, Integer.MAX_VALUE));
    }
}
