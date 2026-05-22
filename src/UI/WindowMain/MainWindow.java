package UI.WindowMain;

import UI.CustomButton;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private LeftPanel leftPanel;
    private RightPanel rightPanel;
    private BottomPanel bottomPanel;
    private JLayeredPane myLayerPane;
    private JPanel layer0;
    private JPanel layer1;
    private CustomButton newTurnButton;

    public MainWindow(){
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new BorderLayout());
        this.setResizable(true);
        this.setVisible(true);


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
    }
}
