import javax.swing.*;
import java.awt.*;

public class StartupMenu extends JFrame {

    private JPanel panel1;
    private JButton button;

    public StartupMenu(){
        super("startup");

        this.setSize(400, 100);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        ImageIcon startIcon = new ImageIcon("res/tapir.png");
        button = new JButton(startIcon);
        this.add(button, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
