package Main;

import Commands.CmdNextTurn;
import Creatures.CreatureEnemy;
import Creatures.CreatureNeutral;
import GameLogic.CreatureQueue;
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
        CreatureQueue queue = new CreatureQueue();
        System.out.println(queue);
        queue.addToQueue(new CreatureNeutral("Tony"));
        queue.addToQueue(new CreatureEnemy("Elemental"));
        queue.addToQueue(new CreatureNeutral("Borvoooj"));
        System.out.println(queue);
        new StartupMenu();

        CmdNextTurn cmd1 = new CmdNextTurn(queue);
        cmd1.execute();
        System.out.println(queue);
    }
}