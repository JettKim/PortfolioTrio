import application.Home;
import calculatorfolder.CalculatorUI;

import  javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Portfolio extends JFrame{

    public static void main(String[] args){

        try{
            Portfolio frame = new Portfolio();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    JButton game_button = new JButton("Work In Progress");
    JButton calculator_button = new JButton("calculator");

    public Portfolio(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(500,500));
        setLayout(new FlowLayout());

        game_button.addActionListener(e -> {
            System.out.println("Work In Progress");
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
