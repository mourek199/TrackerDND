package UI.WindowMain;

import Commands.AppConsole;
import Creatures.Creature;

import javax.swing.*;
import java.awt.*;



public class FiguresDescriptionPanel extends JPanel {
    private JTextArea textArea;
    private JPanel header;
    private JLabel headerText;
    private AppConsole appConsole;
    private String displayText = "";
    public FiguresDescriptionPanel(AppConsole appConsole) {
        this.appConsole = appConsole;
        textArea = new JTextArea();
        textArea.setFont(new Font("Candara",Font.PLAIN, 30));
        textArea.setMargin(new Insets(5,5,5,5));
        textArea.setOpaque(false);
        textArea.setForeground(new Color(255, 255, 255));
        for (Creature creature : appConsole.getWorld().getCreatureQueue().getQueue()){
            displayText += creature.getName() + " -\n";
        }
        textArea.setText(displayText);

        header = new JPanel();
        header.setBackground(new Color(0, 0, 0));
        header.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        header.setPreferredSize(new Dimension(0, 50));
        header.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        header.setMinimumSize(new Dimension(0, 50));
        headerText = new JLabel("MINIFIGURES EXPLANATORY NOTE");
        headerText.setFont(new Font("Candara", Font.BOLD, 32));
        headerText.setForeground(new Color(255, 255, 255));

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(131, 54, 119));

        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setPreferredSize(new Dimension(0, 600));
        header.add(headerText);
        add(header);
        add(textArea);

    }
}
