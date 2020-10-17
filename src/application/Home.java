package application;

import  javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame{

    public static void main(String[] args){

        try{
            Home frame = new Home();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

