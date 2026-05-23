package UI.WindowMain;

import javax.swing.*;
import java.awt.*;

public class QueuePanel extends JPanel{
    private DefaultListModel<String> model = new DefaultListModel<>();
    private JList<String> queueList = new JList<>(model);
    private JScrollPane scrollPane;

    public QueuePanel(){
        this.add(scrollPane = new JScrollPane(queueList), BorderLayout.CENTER);
        queueList.setBackground(new Color(124, 0, 0));
        queueList.setBorder(null);
        scrollPane.setBorder(null);
    }
}
