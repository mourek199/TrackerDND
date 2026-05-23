package UI.WindowMain;

import UI.Background;
import UI.CustomButton;
import UI.CustomImage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MainWindow extends JFrame {

    /*
    private JPanel mainPanel;
    private LeftPanel leftPanel;
    private RightPanel rightPanel;
    private BottomPanel bottomPanel;
    private JLayeredPane myLayerPane;
    private JPanel layer0;
    private JPanel layer1;
    private CustomButton newTurnButton;
     */

    private JPanel rightPanel;
    private JPanel leftPanel;
    private JPanel queuePanel;
    private JPanel turnsPanel;
    private Background bg;

    public MainWindow(){

        this.setExtendedState(MAXIMIZED_BOTH);
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
        queuePanel = new QueuePanel();
        rightPanel = new RightPanel();
        turnsPanel = new TurnsPanel();

        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setOpaque(false);
        //CustomImage customImage = new CustomImage("/tapir.png", 40,40, true);
        CustomImage dndLogo = new CustomImage("res/tapir.png", 500, 200, true);
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        leftPanel.setMaximumSize(new Dimension(leftPanel.getMaximumSize().width, Integer.MAX_VALUE));

        queuePanel.setLayout(new BoxLayout(queuePanel, BoxLayout.X_AXIS));
        queuePanel.setOpaque(false);

        leftPanel.add(queuePanel);
        leftPanel.add(dndLogo.getPicLabel());


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


/*
        Dimension mainPanelSize = new Dimension(this.getSize());
        mainPanel = new JPanel();
        mainPanel.setPreferredSize(mainPanelSize);
        mainPanel.setSize(mainPanelSize);
        mainPanel.setMinimumSize(mainPanelSize);
        mainPanel.setMaximumSize(mainPanelSize);
        mainPanel.setBackground(new Color(118, 149, 217));

        Dimension leftPanelSize = new Dimension(100, this.getHeight());
        leftPanel = new LeftPanel();
        leftPanel.setPreferredSize(leftPanelSize);
        leftPanel.setSize(leftPanelSize);
        leftPanel.setMinimumSize(leftPanelSize);
        leftPanel.setMaximumSize(leftPanelSize);

        Dimension bottomPanelSize = new Dimension(this.getWidth(), 200);
        bottomPanel = new BottomPanel();
        bottomPanel.setPreferredSize(bottomPanelSize);
        bottomPanel.setSize(bottomPanelSize);
        bottomPanel.setMaximumSize(bottomPanelSize);
        bottomPanel.setMinimumSize(bottomPanelSize);

        Dimension rightPanelSize = new Dimension(500, this.getHeight());
        rightPanel = new RightPanel();
        rightPanel.setPreferredSize(rightPanelSize);
        rightPanel.setSize(rightPanelSize);
        rightPanel.setMaximumSize(rightPanelSize);
        rightPanel.setMinimumSize(rightPanelSize);

        layer0 = new JPanel(new BorderLayout());
        layer0.add(rightPanel, BorderLayout.EAST);
        layer0.add(leftPanel, BorderLayout.WEST);
        layer0.setOpaque(false);

        layer1 = new JPanel(new BorderLayout());
        layer1.add(bottomPanel, BorderLayout.SOUTH);

        initializeLayerPane();

    }

    private void initializeLayerPane(){
        myLayerPane = new JLayeredPane();
        myLayerPane.setLayout(new OverlayLayout(myLayerPane));
        myLayerPane.add(mainPanel, JLayeredPane.DEFAULT_LAYER);
        myLayerPane.add(layer0, JLayeredPane.PALETTE_LAYER);
        myLayerPane.add(layer1, JLayeredPane.PALETTE_LAYER);
        this.add(myLayerPane);


 */
    }
}
