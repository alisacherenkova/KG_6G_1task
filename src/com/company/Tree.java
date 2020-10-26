package com.company;

import java.awt.*;

public class Tree implements Drawable{
    int x ;
    int y = 450;

    Tree(int x, int y) {
        this.x = x;
        this.x = y;
    }


    @Override
    public void draw(Graphics2D g) {
        drawTree(g, x, y);
    }

    private void drawTree(Graphics2D g, int x, int y) {
        drawCrown(g, x, y);
        drawTrunk(g, x, y);

    }

    private static void drawCrown(Graphics2D g, int x, int y) {
        g.setColor(Color.green);
        //g.fillPolygon(new int[]{90, 240, 390}, new int[]{450, 400, 450}, 3);
        g.fillPolygon(new int[]{x, x + 150, x + 300}, new int[]{y, y - 50 , y}, 3);
        g.setColor(Color.green);
        g.fillPolygon(new int[]{x + 20, x + 150, x + 270}, new int[]{y - 50 , y - 100, y - 50}, 3);
        g.setColor(Color.green);
        g.fillPolygon(new int[]{x + 40 , x + 150 , x + 250 }, new int[]{y - 100, y - 150, y - 100}, 3);
    }

    private static void drawTrunk(Graphics2D g, int x, int y) {
        g.setColor(Color.black);
        //g.fillRect(220, 450, 35, 70);
        g.fillRect(x + 130, y, 25, 70 );
    }
}
