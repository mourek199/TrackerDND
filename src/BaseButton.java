import javax.swing.*;
import java.awt.*;

public class BaseButton {

    public static void changeStyle(JButton button){
        button.setBackground(new Color(0, 43, 123, 255));
        button.setForeground(new Color(255, 255, 255, 255));
        button.setBorderPainted(false);

        button.setFont(new Font("Times new Roman", Font.BOLD, 14));

        button.setVisible(true);

    }
}
