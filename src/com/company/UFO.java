package com.company;

import java.awt.*;

public class UFO implements Drawable {
    int x, y;

    public UFO(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawUfo(g, x, y);
    }

    private void drawUfo(Graphics2D g, int x, int y) {
        g.setColor(Color.blue);
        //g.fillOval(350, 90, 300, 120);
        g.fillOval(x, y, 300, 120);
        g.setColor(Color.MAGENTA);
        g.fillOval(x + 20, y, 250, 70);
        g.setColor(Color.PINK);
        g.fillOval( x + 80, y - 20, 150, 50);
        g.setColor(Color.RED);
        g.drawLine(x + 120, y - 10 , x + 80, y - 60);
        g.drawLine(x, y + 60, x, y + 360);
        g.drawLine(x + 300, y + 60, x + 300, y + 360);
        g.drawRect(x, y + 360, 300, 50);
        g.setColor(Color.pink);
        g.fillRect(x, y + 360, 300, 50);
        g.setColor(Color.black);
        g.drawString("мент гаишнику не кент", x + 100, y + 380);
    }

}
