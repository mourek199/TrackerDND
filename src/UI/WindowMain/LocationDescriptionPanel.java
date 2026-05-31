package UI.WindowMain;

import javax.swing.*;
import java.awt.*;

public class LocationDescriptionPanel extends JPanel {

    private JTextArea textArea;
    private JPanel header;
    private JLabel headerText;

    /**
     * Displays current location setting and objectives which the DM writes in
     */
    public LocationDescriptionPanel() {
        textArea = new JTextArea();
        textArea.setText(
                "- Trpaslící se hemží úplně všude a město si s nimi neví rady.\n" +
                "- Legendární žábobijec zmizel.\n" +
                "- Kolem vás se nenachází žádná pomoc.");
        textArea.setFont(new Font("Candara",Font.PLAIN, 30));
        textArea.setMargin(new Insets(5,5,5,5));
        textArea.setOpaque(false);
        textArea.setForeground(new Color(255, 255, 255));

        header = new JPanel();
        header.setBackground(new Color(0, 0, 0));
        header.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        header.setPreferredSize(new Dimension(0, 50));
        header.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        header.setMinimumSize(new Dimension(0, 50));
        headerText = new JLabel("SITUATION DESCRIPTION AND OBJECTIVES");
        headerText.setFont(new Font("Candara", Font.BOLD, 32));
        headerText.setForeground(new Color(255, 255, 255));

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(90, 119, 51));

        setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        setPreferredSize(new Dimension(0, 300));
        header.add(headerText);
        add(header);
        add(textArea);
    }
}
