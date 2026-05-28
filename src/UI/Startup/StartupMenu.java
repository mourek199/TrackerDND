package UI.Startup;

import Commands.AppConsole;
import UI.Background;
import UI.CustomImage;
import lombok.Getter;

import javax.imageio.ImageIO;
import javax.sound.sampled.BooleanControl;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Getter
public class StartupMenu extends JFrame {

    private JPanel panel;
    private StartupButton button;
    private Background bg;
    private AppConsole appConsole;

    public StartupMenu(AppConsole appConsole){
        super("startup");
        this.appConsole = appConsole;

        this.setSize(1000, 750);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            bg = new Background("/startupScreenBackground.png");
            bg.setLayout(new BoxLayout(bg, BoxLayout.Y_AXIS));
            this.setContentPane(bg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        panel = new JPanel();
        bg.add(panel);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        CustomImage dndLogo = new CustomImage("res/dndLogo.png", 200, 200, true);
        dndLogo.getPicLabel().setAlignmentX(Component.CENTER_ALIGNMENT);
        CustomImage trackerLogo = new CustomImage("res/TrackerLogo.png", 630, 100, true);
        trackerLogo.getPicLabel().setAlignmentX(Component.CENTER_ALIGNMENT);


        panel.add(Box.createVerticalStrut(10));
        panel.add(dndLogo.getPicLabel());
        panel.add(Box.createVerticalStrut(10));
        panel.add(trackerLogo.getPicLabel());

        button = new StartupButton(appConsole,this,"/StartButtonLogo.png", "/StartButtonLogo.png", 270,80);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createVerticalStrut(200));
        panel.add(button);

        this.setVisible(true);


    }
}
