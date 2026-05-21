package UI.Startup;

import UI.Background;

import javax.imageio.ImageIO;
import javax.sound.sampled.BooleanControl;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class StartupMenu extends JFrame {

    private JPanel panel;
    private JPanel panel2;
    private StartupButton button;
    private StartupButton button2;
    private Background bg;

    public StartupMenu(){
        super("startup");

        this.setSize(1000, 750);
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
        JPanel panel2 = new JPanel();

        try {
            File f = new File("res/dndLogo.png");
            BufferedImage myPicture = ImageIO.read(f);
            Image scaledImg = myPicture.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            JLabel picLabel = new JLabel(new ImageIcon(scaledImg));
            panel2.add(picLabel);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        bg.add(panel2);
        bg.add(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setOpaque(false);

        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setOpaque(false);

        Dimension panelDimension = new Dimension(30,30);
        button = new StartupButton("/TrackerLogo.png", "/dndLogo.png", 610,100);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createVerticalStrut(10));
        panel.add(button);

        Dimension panel2Dimension = new Dimension(this.getWidth(), 100);
        panel2.add(Box.createVerticalStrut(10));
        panel2.setPreferredSize(panel2Dimension);
        panel2.setAlignmentY(Component.CENTER_ALIGNMENT);
        panel2.add(new JButton("daaamn"));





        this.setVisible(true);
    }
}
