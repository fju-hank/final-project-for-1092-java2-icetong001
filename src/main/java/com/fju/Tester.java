package com.fju;

import javax.swing.*;

import java.util.Scanner;

public class Tester{

    public static void main(String[] args) {
        Drinks[] List = {new Pricea(), new Priceb(),new Pricec()};


        Scanner scanner = new Scanner(System.in);

        int usertype;
        System.out.println("請輸入0來看清單" + "\n" + "請輸入1來啟動販賣機");
        usertype = scanner.nextInt();

        for (Drinks list : List) {
            if (usertype == 0) {
                System.out.println(list.drink + "  " + list.price);

            } else if (usertype == 1) {
                JFrame frame = new JFrame();

                frame.pack();
                frame.setSize(400, 300);
                frame.setLocationRelativeTo(null);
                frame.setContentPane(new Demogui().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);


                new Demogui();

                break;
            }
        }
    }
}
