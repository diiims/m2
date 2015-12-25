package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by pc on 22.12.2015.
 */
public class DrawPanel extends JPanel {
    static int x=100;
    static int y=100;

    public void paintComponent(Graphics g) {

            g.clearRect(0, 0, 800, 800);
            if (x > 600)
                x = x - 100;
            if (y > 600)
                y = y - 100;
            if (x < 1)
                x = x + 1;
            if (y < 1)
                y = y + 1;


            int dx = 0;
            if (Math.random() < 0.5) {
                dx = -1;
            } else {
                dx = 1;
            }

            int dy = 0;
            if (Math.random() < 0.5) {
                dy = -1;
            } else {
                dy = 1;
            }


            if (Math.random() < 0.5) {
                x = x + dx;
            }
            if (Math.random() < 0.5) {
                y = y + dy;
            }



        g.drawOval(x, y, 16, 16);
        g.fillOval(x+4, y+4, 8, 8);

        g.drawOval(x+20, y, 16, 16);
        g.fillOval(x+4+20, y+4, 8, 8);



        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x=x+(int)(Math.random()*5);
                y=y+(int)(Math.random()*5);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("");
            }
        });


        repaint();


       // System.out.println("-----"+x);
        //System.out.println(y);
      // repaint();



//        g.clearRect(0,0,800,800);
//
//        for (int i = 0; i < 1; i++) {
//            float f1=(float) (Math.random()*100);
//            float f2=(float) Math.random()*100;
//            float f3=(float) Math.random()*100;
//            g.setColor(Color.getHSBColor(f1,f2,f3));
//            g.fillRect(0,0,800,800);
//            g.setColor(Color.getHSBColor(f3,f2,f1));
//            g.fillOval((int) (Math.random() * 600), (int) (Math.random() * 600), (int) (Math.random() * 200), (int) (Math.random() * 200));
//repaint();
            //this.removeAll();
//            try {
//                Thread.sleep(800);
//            }
//            catch (Exception e) {
//            }



        }



    }

    ;



