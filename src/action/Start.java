package action;
import clock.GameClock;
import gui.Gui;

import javax.swing.JFrame;

public class Start extends JFrame {

    public static void main(String[] args) {

        try {
            action.Start frame = new action.Start();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Gui g = new Gui();
        GameClock gc = new GameClock();
        g.create();
        gc.start();
    }
}



