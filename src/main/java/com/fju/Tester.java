package com.fju;

import javax.swing.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {


            JFrame frame = new JFrame();

            frame.pack();
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setContentPane(new Demogui().panelMain);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setVisible(true);
            new Demogui();



        }





}
