package Utilities;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class DataLoading {

    /**
     * loads images into image icons
     * @param path absolute path to the loaded image
     * @param width scale image to this width
     * @param height scale image to this height
     * @return new image icon scaled properly
     */
    public static ImageIcon loadAssets(String path, int width, int height){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(path));
        } catch (Exception e) {
            System.out.println("couldn't load this: "+path);
        }
        return new ImageIcon(image.getScaledInstance(width,height, BufferedImage.SCALE_SMOOTH));
    }

    public static BufferedImage loadBufferedImage(String path) {
        try {
            return ImageIO.read(DataLoading.class.getResource(path));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * loads custom fonts
     * @param path path to the loaded font
     * @param size font size we want to use
     * @return new custom font
     */
    /*
    public Font loadFont(String path, float size){
        Font font = null;
        try {
            InputStream inputStream = getClass().getResourceAsStream(path);
            BufferedInputStream bis = new BufferedInputStream(inputStream);
            font = Font.createFont(Font.TRUETYPE_FONT,bis).deriveFont(size);
        } catch (FontFormatException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("couldn't load this: "+path);
        }
        return font;
    }*/
}
