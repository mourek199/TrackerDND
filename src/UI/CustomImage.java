package UI;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CustomImage extends JLabel{

    File f;
    BufferedImage myPicture;
    Image scaledImage;
    JLabel picLabel;

    public CustomImage(String filepath, int width, int height, Boolean smooth){
        try {
            f = new File(filepath);
            myPicture = ImageIO.read(f);
            if (smooth){
                scaledImage = myPicture.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            }else {
                scaledImage = myPicture.getScaledInstance(width, height, Image.SCALE_DEFAULT);
            }
            picLabel = new JLabel(new ImageIcon(scaledImage));
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    public JLabel getPicLabel() {
        return picLabel;
    }
}
