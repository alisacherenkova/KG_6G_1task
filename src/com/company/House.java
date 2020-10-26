package com.company;

import java.awt.*;

public class House implements Drawable {
    int x, y;

    public House(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawHouse(g);
    }
    private void drawHouse(Graphics2D g){
        drawWall(g, x, y);
        drawRoof(g, x , y);
        drawWindow(g, x, y);
        drawDoor(g, x, y);
        drawChimney(g, x, y);
    }

    private static void drawWall(Graphics2D g, int x, int y) {
        g.setColor(Color.CYAN);
        //g.fillRect(1050, 350, 300, 300);
        g.fillRect(x, y, 300, 300);
    }

    private static void drawRoof(Graphics2D g, int x, int y) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(new int[]{x, x + 150,  x + 300}, new int[]{y, y - 150, y}, 3);
    }

    private static void drawWindow(Graphics2D g, int x, int y){
        g.setColor(Color.black);
        g.drawLine(x + 25, y + 50,x + 125 ,y + 50 );
        g.setColor(Color.black);
        g.drawLine(x + 25, y + 50,x + 25 ,y + 150 );
        g.setColor(Color.black);
        g.drawLine(x + 125, y + 50,x + 125 , y + 150);
        g.setColor(Color.black);
        g.drawLine(x + 25, y + 150,x + 125 ,y + 150 );
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(1075, 400, 100, 100);
        g.setColor(Color.black);
        g.drawLine(x + 75, y + 50,x + 75 ,y + 150);
        g.setColor(Color.black);
        g.drawLine(x + 25, y + 100,x + 75 ,y + 100);
    }

    private static void drawDoor(Graphics2D g, int x, int y){
        g.setColor(Color.lightGray);
        g.fillRect(x + 180, y + 50, 100, 250);
        g.setColor(Color.black);
        g.fillRect(x + 190, y + 150, 5, 10 );
    }

    private static void drawChimney(Graphics2D g, int x, int y){
        g.setColor(Color.black);
        g.fillRect(x + 50, y - 100, 20, 70);
    }
    /* g.drawLine(x + 30, y + 200, x + 15, y + 140);
        g.drawLine(x, y + 140, x + 110, y + 200);
        g.drawLine(x - 20, y + 350, x + 35, y + 280);
        g.drawLine(x + 60, y + 280, x + 105, y + 340);*/
}
