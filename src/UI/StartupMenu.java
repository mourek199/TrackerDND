package UI;

import Main.Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class StartupMenu extends JFrame {

    private JPanel panel;
    private CustomButton button;
    private Background bg;

    public StartupMenu(){
        super("startup");

        this.setSize(600, 100);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        try {
            bg = new Background("/StartupScreenBackground.png");
            this.setContentPane(bg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        panel = new JPanel();
        panel.setBackground(new Color(0,0,0,0));
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
//        Image image = new ImageIcon("/dndLogo.png");

        JPanel logoLabel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(loadImg("/dndlogo.png"), 0, 0, null);

            }

            private BufferedImage loadImg(String path){
                BufferedImage img = null;
                try(InputStream is = Main.class.getResourceAsStream(path)){
                    img = ImageIO.read(is);
                } catch (IOException e) {
                    System.err.println("Neexistuje");
                }
                return img;
            }
        };
        logoLabel.setBackground(new Color(0,0,0,0));
        logoLabel.setSize(100,100);
        this.add(logoLabel, BorderLayout.WEST);

        button = new CustomButton("/play.png", "/play.png", 50,50);

        button.addActionListener(e -> {
            this.dispose();
            new MainWindow();
        });

        panel.add(button);
        this.add(panel);

        this.setVisible(true);
    }
}
