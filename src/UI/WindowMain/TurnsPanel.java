package UI.WindowMain;

import Commands.AppConsole;
import UI.CustomButton;
import javax.swing.*;
import java.awt.*;

public class TurnsPanel extends JPanel {
    private CustomButton customButton;
    private AppConsole appConsole;
    private MainWindow mainWindow;

    public TurnsPanel(AppConsole appConsole, MainWindow mainWindow) {
        this.appConsole = appConsole;
        this.mainWindow = mainWindow;
        this.setBackground(new Color(0,0,0));
        customButton = new CustomButton("/dndLogo.png", "/dndLogo.png", 50,50);
        customButton.addActionListener(e -> {
            System.out.println(appConsole.getWorld().getCreatureQueue());
            appConsole.execute("nextTurn");
            mainWindow.reloadMainWindow();
        });
        this.add(customButton);
    }
}
