// Lab06vst.java
// Student Version

import java.*;
import java.applet.*;
import java.awt.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g){
        // Draw Grid

        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        int k;
        Random rand = new Random();

        for(k = 1; k <=100; k++){
            int x1 = (rand.nextInt(390)+10);
            int y1 = (rand.nextInt(290)+10);
            int x2 = (rand.nextInt(390)+10);
            int y2 = (rand.nextInt(290)+10);
            int c1 = (rand.nextInt(255));
            int c2 = (rand.nextInt(255));
            int c3 = (rand.nextInt(255));

            g.setColor(new Color(c1,c2,c3));
            g.drawLine(x1,y1,x2,y2);
        }


        // Draw Random Squares
        Random rand2 = new Random();

        for(k = 1; k <= 100; k++) {
            int x1 = (rand2.nextInt(330) + 410);
            int y2 = (rand2.nextInt(240) + 10);
            int c1 = (rand2.nextInt(255));
            int c2 = (rand2.nextInt(255));
            int c3 = (rand2.nextInt(255));

            g.setColor(new Color(c1,c2,c3));
            g.fillRect(x1,y2,50,50);
        }


        // Draw Random Circles
        Random rand1 = new Random();

        for(k = 1; k <= 100; k++) {
            int c1 = (rand1.nextInt(255));
            int c2 = (rand1.nextInt(255));
            int c3 = (rand1.nextInt(255));
            int s1 = (rand1.nextInt(200));
            int y2 = (rand1.nextInt(280)+300);
            int x1 = (rand.nextInt(350)+10);
            int rx1 = x1 - s1;
            int ry2 = y2 - s1;


            g.setColor(new Color(c1,c2,c3));
            g.drawOval(rx1, ry2, s1, s1);
        }

        // Draw 3-D Box





    }

}



    
 