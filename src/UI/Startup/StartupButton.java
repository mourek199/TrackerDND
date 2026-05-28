package UI.Startup;

import Commands.AppConsole;
import UI.CustomButton;
import UI.WindowMain.MainWindow;

import javax.swing.*;

public class StartupButton extends CustomButton {
    AppConsole appConsole;
    public StartupButton(AppConsole appConsole, JFrame target, String imgFile, String clickedImg, int width, int height) {
        super(imgFile, clickedImg, width, height);
        this.appConsole = appConsole;

        this.addActionListener(e->{
            new MainWindow(appConsole);
            target.dispose();
        });
    }

}
