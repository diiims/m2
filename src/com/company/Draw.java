package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by pc on 23.12.2015.
 */
public class Draw extends JPanel {
    public void paintComponent(Graphics g) {
        float f1 = (float) (Math.random() * 100);
        float f2 = (float) Math.random() * 100;
        float f3 = (float) Math.random() * 100;
        g.setColor(Color.getHSBColor(f1,f2,f3));
        g.fillOval((int)f1,(int) f2,(int) f3,(int) f1);

        //repaint();
    }

    ;
}
