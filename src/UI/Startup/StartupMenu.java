package UI.Startup;

import UI.Background;
import UI.CustomButton;
import UI.WindowMain.MainWindow;

import javax.swing.*;
import java.awt.*;


public class StartupMenu extends JFrame {

    private JPanel panel;
    private StartupButton button;
    private Background bg;

    public StartupMenu(){
        super("startup");

        this.setSize(600, 100);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            bg = new Background("/StartupScreenBackground.png");
            bg.setLayout(new BoxLayout(bg, BoxLayout.Y_AXIS));
            this.setContentPane(bg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        JPanel panel = new JPanel();
        bg.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        Dimension panel2Dimension = new Dimension(30,30);
        button = new StartupButton("/dndLogo.png", "/dndLogo.png", 40,40);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createVerticalStrut(10));
        panel.add(button);

        this.setVisible(true);
    }
}
