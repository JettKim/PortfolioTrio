package application;
import javax.swing.JFrame;

public class Home extends JFrame {

    public static void main(String[] args) {

        try {
            Home frame = new Home();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    TicTacToe tictactoe = new TicTacToe();
}



