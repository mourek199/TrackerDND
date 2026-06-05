package UI.WindowMain;

import Commands.AppConsole;
import UI.CustomButton;
import javax.swing.*;
import java.awt.*;

public class TurnsPanel extends JPanel {
    private CustomButton customButton;
    private AppConsole appConsole;
    private MainWindow mainWindow;
    private JLabel label;

    /**
     * Class storing next turn button and turns count
     * @param appConsole
     * @param mainWindow
     */
    public TurnsPanel(AppConsole appConsole, MainWindow mainWindow) {
        this.appConsole = appConsole;
        this.mainWindow = mainWindow;
        this.setBackground(new Color(0,0,0));
        this.setLayout(new BorderLayout());
        label = new JLabel();
        label.setBackground(new Color(128, 10, 128));
        label.setForeground(new Color(255, 255, 255));
        label.setFont(new Font("Candara", Font.BOLD, 32));
        customButton = new CustomButton("/newTurn.png", "/newTurn.png", 64*2,32*2);
        customButton.addActionListener(e -> {
            appConsole.execute("nextTurn");
            mainWindow.reloadMainWindow();
        });
        this.add(label, BorderLayout.SOUTH);
        this.add(customButton, BorderLayout.NORTH);

        setLabel();
    }
    public void refresh(){
        setLabel();
    }
    public void setLabel(){
        label.setText("Move " + mainWindow.getAppConsole().getWorld().getCreatureQueue().getTurnNumber());
    }
}
