package com.company;

import java.awt.*;

public class Track implements Drawable{
    int x, y;

    public Track(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawTrack(g, x, y);
    }

    public void drawTrack(Graphics2D g, int x, int y) {
        g.setColor(Color.lightGray);
        //g.fillRect(0, 600, 1000, 80);
        g.fillRect(x, y, 1000, 80);
        g.setColor(Color.WHITE);
        g.fillRect(x,y + 35, 1000, 10);
        g.setColor(Color.BLACK);
        g.fillRect(x,y - 5, 1000, 5);
        g.setColor(Color.BLACK);
        g.fillRect(x,y + 80, 1000, 5);
    }
}
