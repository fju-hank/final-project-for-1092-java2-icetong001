package com.fju;

import javax.swing.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Drinks[] List = {new Pricew(), new Priceb(), new Prices()};


        Scanner scanner = new Scanner(System.in);

        int usertype;

        System.out.println("請輸入0來看酒類清單(品種，價錢，濃度)" + "\n" + "請輸入1來啟動販賣機" + "\n" + "請輸入2來確認年紀"+"\n" + "請輸入3來查看新竹酒商資料");
        usertype = scanner.nextInt();

        for (Drinks list : List) {
            if (usertype == 0) {

                System.out.println(list.drink+"\t"  +"$" + list.price+ "\t" +list.concentration);


            } else if (usertype == 1) {
                JFrame frame = new JFrame();

                frame.pack();
                frame.setSize(500, 400);
                frame.setLocationRelativeTo(null);
                frame.setContentPane(new Demogui().panelMain);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);


                new Demogui();

                break;
            } else if (usertype == 2) {
                int insert;
                System.out.println("How old are you ?");

                insert = scanner.nextInt();
                System.out.println("Your age:" + insert);
                if (insert > 17) {
                    System.out.println("Congratulations~~ You can buy some drinks");
                } else {
                    System.out.println("Goodbye~~  little kid !!!");
                }
                break;
            } else if (usertype == 3) {
                System.out.println("新竹酒類業者明細");
                try {
                    URL url = new URL("http://odws.hccg.gov.tw/001/Upload/25/opendataback/9059/238/3ab2e3ee-a106-4032-9f9e-b410e3503113.json");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    InputStream input = connection.getInputStream();

                    BufferedReader in = new BufferedReader(new InputStreamReader(input));
                    StringBuffer sb = new StringBuffer();
                    String line = in.readLine();

                    while (line != null) {
                        System.out.println(line);
                        sb.append(line);
                        line = in.readLine();
                    }

                } catch (IOException e) {
                    e.printStackTrace();

                } break;

            }

        }
        System.out.println("Thanks for using");
    }
}
