package com.company;

import java.awt.*;

public class Alien implements Drawable {
    int x, y;

    public Alien(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawALien(g);
    }

    private void drawALien(Graphics2D g) {
        drawHead(g, x, y);
        drawFlesh(g, x, y);
    }


    private static void drawHead(Graphics2D g, int x, int y) {
        g.setColor(Color.GREEN);
        //g.fillArc(40, 300, 100 , 100, 0, 180);
        g.fillArc(x, y, 100 , 100, 0, 180);
        g.fillArc(x, y - 30,100, 150, 360, -180);
        g.setColor(Color.BLACK);
        g.fillArc(x + 15, y + 30, 20 , 40, -45, 180);
        g.fillArc(x + 60, y + 30,20, 40, -135, -180);
        g.fillArc(x + 45,y + 80, 10, 10, 0, -180);
    }
    private static void drawFlesh(Graphics2D g, int x, int y) {
        g.fillRect(x + 43, y + 120, 10, 20);
        g.drawOval(x + 17, y + 140, 60, 150);
        g.setColor(Color.GREEN);
        g.fillOval(x + 17, y + 140, 60, 150);
        g.setColor(Color.black);
        g.drawLine(x - 20, y + 200, x + 45, y + 140);
        g.drawLine(x + 50, y + 140, x + 110, y + 200);
        g.drawLine(x - 20, y + 350, x + 35, y + 280);
        g.drawLine(x + 60, y + 280, x + 105, y + 340);
    }
}
