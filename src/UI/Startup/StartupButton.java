package UI.Startup;

import UI.CustomButton;
import UI.WindowMain.MainWindow;

import javax.swing.*;

public class StartupButton extends CustomButton {
    public StartupButton(JFrame target, String imgFile, String clickedImg, int width, int height) {
        super(imgFile, clickedImg, width, height);

        this.addActionListener(e->{
            new MainWindow();
            target.dispose();
        });
    }

}
