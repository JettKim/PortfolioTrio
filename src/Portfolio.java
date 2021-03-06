import application.Home;
import View.CalculatorUI;
import application.TicTacToe;
import action.Start;
import  javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Portfolio extends JFrame{

    public static void main(String[] args){

        try{
            Portfolio frame = new Portfolio();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    JButton snake_button = new JButton("Snake");
    JButton game_button = new JButton("Tic-Tac-Toe");
    JButton calculator_button = new JButton("calculator");

    public Portfolio(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        setLayout(new FlowLayout());

        snake_button.addActionListener(e -> {
            System.out.println("Snake");
            Start.main(null);
        });
        add(snake_button);

        game_button.addActionListener(e -> {
            System.out.println("Tic-Tac-Toe");
            Home.main(null);
        });
        add(game_button);

        calculator_button.addActionListener(e -> {
            System.out.println("calculator");
            CalculatorUI.main(null);
        });
        add(calculator_button);

        pack();
    }
}