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
            int x1 = (rand.nextInt(391)+10);
            int y1 = (rand.nextInt(291)+10);
            int x2 = (rand.nextInt(391)+10);
            int y2 = (rand.nextInt(291)+10);
            int c1 = (rand.nextInt(255));
            int c2 = (rand.nextInt(255));
            int c3 = (rand.nextInt(255));

            g.setColor(new Color(c1,c2,c3));
            g.drawLine(x1,y1,x2,y2);
        }


        // Draw Random Squares
        Random rand2 = new Random();

        for(k = 1; k <= 100; k++) {
            int x1 = (rand2.nextInt(341) + 400);
            int y2 = (rand2.nextInt(241) + 10);
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
            int y2 = (rand1.nextInt(291-s1)+300);
            int x1 = (rand.nextInt(391-s1)+10);



            g.setColor(new Color(c1,c2,c3));
            g.drawOval(x1, y2, s1, s1);
        }

        // Draw 3-D Box
        g.setColor(new Color(255,255,0));
        g.fillRect(550,350,100,100);

        g.setColor(new Color(255,0,0));
        g.fillRect(600,400,100,100);

        g.setColor(new Color(0,255,0));
        Polygon green = new Polygon();
            green.addPoint(550,350);
            green.addPoint(600,400);
            green.addPoint(600,500);
            green.addPoint(550,450);
            g.fillPolygon(green);


        g.setColor(new Color(0,0,255));
        Polygon blue = new Polygon();
            blue.addPoint(650,350);
            blue.addPoint(650,400);
            blue.addPoint(700,400);
            g.fillPolygon(blue);

    }

}



    
 