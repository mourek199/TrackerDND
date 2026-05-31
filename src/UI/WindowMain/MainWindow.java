package UI.WindowMain;

import Commands.AppConsole;
import UI.Background;
import UI.CustomImage;

import javax.swing.*;
import java.awt.*;

/**
 * The main panel. This is the UI that the user is looking at 99% of the time. Contains queue, description panels and other buttons
 */
public class MainWindow extends JFrame {

    private RightPanel rightPanel;
    private LeftPanel leftPanel;
    private QueuePanel queuePanel;
    private JPanel centerPanel;
    private LocationDescriptionPanel locationDescriptionPanel;
    private FiguresDescriptionPanel figuresDescriptionPanel;
    private OptionsPanel optionsPanel;
    private TurnsPanel turnsPanel;
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
        centerPanel = new JPanel();
        locationDescriptionPanel = new LocationDescriptionPanel();
        figuresDescriptionPanel = new FiguresDescriptionPanel(appConsole);
        optionsPanel = new OptionsPanel(appConsole, this);

        centerPanel.setOpaque(false);
        centerPanel.setLayout(new BorderLayout());
        centerPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 500));
        centerPanel.add(figuresDescriptionPanel, BorderLayout.SOUTH);

        queuePanel.setMinimumSize(new Dimension(0, 800));
        setPreferredSize(new Dimension(0, 800));
        queuePanel.setOpaque(false);

        leftPanel.add(queuePanel, BorderLayout.CENTER);
        leftPanel.add(locationDescriptionPanel, BorderLayout.SOUTH);

        rightPanel.add(optionsPanel);
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        rightPanel.setBackground(new Color(93, 147, 70));
        rightPanel.setMaximumSize(new Dimension(rightPanel.getMaximumSize().width, Integer.MAX_VALUE));

        turnsPanel.setLayout(new BoxLayout(turnsPanel, BoxLayout.Y_AXIS));
        rightPanel.add(turnsPanel);

        bg.add(leftPanel, BorderLayout.WEST);
        bg.add(rightPanel, BorderLayout.EAST);
        bg.add(centerPanel, BorderLayout.CENTER);
        this.setVisible(true);

    }
    public void reloadMainWindow(){
        queuePanel.reloadQueue(appConsole);
        turnsPanel.refresh();
    }

    public AppConsole getAppConsole() {
        return appConsole;
    }
}
