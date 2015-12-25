package com.company;

/**
 * Created by pc on 21.12.2015.
 */

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


public class GUI {
    public static void main(String args[]) {
        Parenthesis.par(3,0,0,"");



        JFrame JF = new JFrame("Окно");
        JF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JF.setSize(800,800);

       JButton jb= new JButton("Нажми меня!");
        JButton jb1 = new JButton("OK");
       //JPanel jp = new JPanel();
       //jp.add(BorderLayout.WEST,jb);
       // jp.add(BorderLayout.EAST,jb1);
       // Label L=new Label("Text here");
      //  jp.add(L);
JPanel jp1 = new JPanel();

        Draw D = new Draw();
        jp1.add(D);
        jp1.setSize(600,600);
      // JF.add(jp);
      //  D.setSize(600,600);
        JF.add(BorderLayout.NORTH,jp1);
        JF.getContentPane().add(BorderLayout.WEST,jb);
        Midi.play(D);


       // JF.add(BorderLayout.EAST,jb1);
jb.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        jb.setText("нажата");
        Midi.play(D);
    }
});
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jb1.setText("qqq");
            }
        });

            JF.setVisible(true);

    }

    void refresh(){

    }
}
