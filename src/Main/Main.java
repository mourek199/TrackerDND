package Main;

import UI.StartupMenu;

public class Main {

    // Makes the graphics run on graphics driver using opengl
    static void setProperties() {
        System.setProperty("sun.java2d.opengl", "true");
        System.setProperty("sun.java2d.noddraw", "true");
        System.setProperty("sun.awt.noerasebackground", "true");
        System.setProperty("sun.java2d.pmoffscreen", "false");
        System.setProperty("awt.useSystemAAFontSettings", "on");
        System.setProperty("swing.aatext", "true");
    }

    public static void main(String[] args) {
        setProperties();
        new StartupMenu();
    }
}