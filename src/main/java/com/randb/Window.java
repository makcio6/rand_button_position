package com.randb;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Window {

    JLabel label = new JLabel("Ты гей?");
    JFrame f = new JFrame("Ты гей?");
    JLabel tlabel = new JLabel("Я тоже :)");


    public final void mainComp () {

        f.add(label);
        label.setBounds(95,1,200,50);

        JButton yes = new JButton("Да");
        yes.setBounds(90, 50, 60, 30);
        f.add(yes);

        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame too = new JFrame(":)");
                too.setSize(150, 150);
                too.setVisible(true);
                too.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                too.setLayout(null);
                too.add(tlabel);
                tlabel.setBounds(50, 1, 100, 100);
            }
        });

        final Random rn = new Random();
        final JButton no = new JButton("Нет");
        no.setBounds(rn.randomx, rn.randomy, 60, 30);
        f.add(no);
        no.addMouseListener(new MouseListener() {

            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}

            public void mouseEntered(MouseEvent e) {

            rn.setRandomx();
            no.setBounds(rn.randomx, rn.randomy, 60, 30);

            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 200);
        f.setLayout(null);
        f.setVisible(true);

    }
}