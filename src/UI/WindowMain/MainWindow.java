package UI.WindowMain;

import Commands.AppConsole;
import UI.Background;
import UI.CustomImage;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private RightPanel rightPanel;
    private LeftPanel leftPanel;
    private QueuePanel queuePanel;
    private JPanel turnsPanel;
    private Background bg;
    private AppConsole appConsole;

    public MainWindow(AppConsole appConsole){
        this.appConsole = appConsole;
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        try {
            bg = new Background("/GradientBackground.png");
            bg.setLayout(new BorderLayout());
            this.setContentPane(bg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        leftPanel = new LeftPanel();
        queuePanel = new QueuePanel(this, appConsole);
        rightPanel = new RightPanel();
        turnsPanel = new TurnsPanel(appConsole, this);

        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setOpaque(false);
        //CustomImage customImage = new CustomImage("/tapir.png", 40,40, true);
        CustomImage dndLogo = new CustomImage("res/tapir.png", 500, 300, true);
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        leftPanel.setMaximumSize(new Dimension(leftPanel.getMaximumSize().width, Integer.MAX_VALUE));

        queuePanel.setLayout(new BoxLayout(queuePanel, BoxLayout.X_AXIS));
        queuePanel.setOpaque(false);

        leftPanel.add(queuePanel);
        leftPanel.add(dndLogo.getPicLabel());

        CustomImage arrow = new CustomImage("res/arrowUp.png", 80, 800, true);
        add(arrow.getPicLabel());

        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setOpaque(false);
        CustomImage dndLogo2 = new CustomImage("res/tapir.png", 200, 200, true);
        rightPanel.add(dndLogo2.getPicLabel());
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        rightPanel.setMaximumSize(new Dimension(rightPanel.getMaximumSize().width, Integer.MAX_VALUE));

        turnsPanel.setLayout(new BoxLayout(turnsPanel, BoxLayout.Y_AXIS));
        rightPanel.add(turnsPanel);

        bg.add(leftPanel, BorderLayout.WEST);
        bg.add(rightPanel, BorderLayout.EAST);
        this.setVisible(true);

    }
    public void reloadMainWindow(){
        queuePanel.reloadQueue(appConsole);
    }

    public AppConsole getAppConsole() {
        return appConsole;
    }
}
