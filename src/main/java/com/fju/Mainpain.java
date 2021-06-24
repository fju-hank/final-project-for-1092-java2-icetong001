package com.fju;

import javax.swing.*;
import java.awt.*;

public class Mainpain extends JFrame {

    private JPanel mPanel = new JPanel();
    String name;
    private JPanel panel1;
    private JButton buttonadd1;
    private JButton Buttonadd2;
    private JButton buttonadd3;
    private JButton okButton;
    private JLabel beer;
    private JLabel water;
    private JLabel cola;

    public static void main(String[] args) {
        JFrame frame = new Mainpain();
        frame.setContentPane(new Mainpain().mPanel);

        //panel setting
        frame.setSize(1000, 500);
        frame.setLocation(200, 100);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);


        frame.add(new Button("OK"));
    }

    void init() {
        JLabel beer = new JLabel("Beer");


       // private void createUIComponents () {
            // TODO: place custom component creation code here
        }
    }
