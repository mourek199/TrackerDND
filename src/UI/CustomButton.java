package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

/**
 * A custom button class
 * @author Matej Pospisil, modified by Tony
 */
public class CustomButton extends JButton {

    private Image img;
    private Image idleImg;
    private Image clickedImg;
    private boolean hoovered;
    private boolean clicked;

    public CustomButton() {
    }

    public CustomButton(String imgFile, String clickedImg, int width, int height) {
        super();
        URL imageURL = getClass().getResource(imgFile);
        URL clickedURL = getClass().getResource(clickedImg);

        this.idleImg = new ImageIcon(imageURL).getImage();
        this.clickedImg = new ImageIcon(clickedURL).getImage();


        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);

        this.img = idleImg;

        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);

        setSizeOfButton(width, height);

        setMouseListener();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);

        int w = getWidth();
        int h = getHeight();

        int offset2 = calculateOffset();
        g.drawImage(img, offset2, offset2, w - (offset2 * 2), h - (offset2 * 2), this);


    }

    private int calculateOffset() {
        if (clicked) {
            return 3;
        }
        if (hoovered) {
            System.out.println("test");
            return 3;
        }
        return 1;
    }

    private void setMouseListener() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                CustomButton.this.hoovered = false;
                repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                CustomButton.this.hoovered = true;
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                CustomButton.this.img = clickedImg;
                CustomButton.this.clicked = true;
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                CustomButton.this.img = idleImg;
                CustomButton.this.clicked = false;
                repaint();
            }
        });
    }

    private void setSizeOfButton(int width, int height) {
        Dimension dimension = new Dimension(width, height);
        setMaximumSize(dimension);
        setPreferredSize(dimension);
        setMinimumSize(dimension);
    }

//    private void setCursor() {
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Image cursorImg = toolkit.getImage(getClass().getResource("/TitleScreenUI/CLICKED_CURSOR.png"));
//        Cursor customCursor = toolkit.createCustomCursor(cursorImg, new Point(0, 0), "cursorName");
//        this.setCursor(customCursor);
//    }
}
