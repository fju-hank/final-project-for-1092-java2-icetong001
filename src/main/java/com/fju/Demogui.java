package com.fju;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demogui extends JFrame {
    private JButton appleJuiceButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panelMain;

//    public Demogui() {
//        appleJuiceButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                 JOptionPane.showMessageDialog(null,"hello");
//            }
//        });
//    }

    public static void main(String[] args) {
        JFrame frame =new JFrame("vending machine");
        frame.setLocation(200,100);
        frame.setSize(1000,500);
        frame.setContentPane (new Demogui().panelMain);

//       error 顯示contentPane cannot be set to null
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
            appleJuiceButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    JOptionPane.showMessageDialog(null,"hello");
                }
            });
        }
    }
//public Demogui(){
//    setContentPane(panelMain);
//      error either
//    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//    setVisible(true);





