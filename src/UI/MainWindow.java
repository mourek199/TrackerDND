package UI;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {



    private JPanel mainPanel;
    private JPanel leftPanel;
    private JPanel rightPanel;
    private JPanel bottomPanel;
    private JLayeredPane myLayerPane;
    private JPanel layer0;
    private JPanel layer1;

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
        leftPanel = new JPanel();
        leftPanel.setPreferredSize(leftPanelSize);
        leftPanel.setSize(leftPanelSize);
        leftPanel.setMinimumSize(leftPanelSize);
        leftPanel.setMaximumSize(leftPanelSize);
        leftPanel.setBackground(new Color(255, 112, 112));

        Dimension bottomPanelSize = new Dimension(this.getWidth(), 200);
        bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(bottomPanelSize);
        bottomPanel.setSize(bottomPanelSize);
        bottomPanel.setMaximumSize(bottomPanelSize);
        bottomPanel.setMinimumSize(bottomPanelSize);
        bottomPanel.setBackground(new Color(182, 222, 191));

        Dimension rightPanelSize = new Dimension(500, this.getHeight());
        rightPanel = new JPanel();
        rightPanel.setPreferredSize(rightPanelSize);
        rightPanel.setSize(rightPanelSize);
        rightPanel.setMaximumSize(rightPanelSize);
        rightPanel.setMinimumSize(rightPanelSize);
        rightPanel.setBackground(new Color(171, 171, 171));

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
