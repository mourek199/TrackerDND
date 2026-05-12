package UI.Startup;

import UI.CustomButton;
import UI.WindowMain.MainWindow;

public class StartupButton extends CustomButton {
    public StartupButton(String imgFile, String clickedImg, int width, int height) {
        super(imgFile, clickedImg, width, height);

        this.addActionListener(e->{
            new MainWindow();
        });
    }

}
