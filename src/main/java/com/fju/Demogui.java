package com.fju;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demogui extends JFrame {

    private JButton appleJuiceButton;
    private JButton beerButton;
    private JButton colaButton;
    private JButton okButton;
    private JPanel panelMain;

    public Demogui() {
        $$$setupUI$$$();
        appleJuiceButton = new JButton();

    }

    private void createUIComponents() {

        // TODO: place custom component creation code here
        appleJuiceButton = new JButton();
        appleJuiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "hello");
            }
        });
    }


//    public Demogui() {
//        super("demo");
//        setContentPane(panelMain);
//        Frame frame = new JFrame("vending machine");
//        frame.setLocation(200, 100);
//        frame.setSize(1000, 500);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        setVisible(true);
//    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("vending machine");
        frame.setLocation(200, 100);
        frame.setSize(1500, 200);
        frame.setContentPane(new Demogui().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        panelMain = new JPanel();
        panelMain.setLayout(new GridBagLayout());
        appleJuiceButton.setEnabled(true);
        appleJuiceButton.setHideActionText(false);
        appleJuiceButton.setText("apple juice");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelMain.add(appleJuiceButton, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        panelMain.add(spacer1, gbc);
        beerButton = new JButton();
        beerButton.setText("Beer");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(beerButton, gbc);
        colaButton = new JButton();
        colaButton.setText("Cola");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(colaButton, gbc);
        okButton = new JButton();
        okButton.setText("ok");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelMain.add(okButton, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panelMain;
    }


//    private void createUIComponents() {
//        // TODO: place custom component creation code here
//        appleJuiceButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                JOptionPane.showMessageDialog(null, "hello");
//            }
//        });
//    }

}

