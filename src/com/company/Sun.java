package com.company;

import com.company.Drawable;

import java.awt.*;

public class Sun implements Drawable {
    private int x, y, r, R, n;
    private Color c;

    public Sun(int x, int y, int r, int r1, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.n = n;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawSun(g, x, y, r, R, n, c);
    }
    public static void drawSun(Graphics2D g, int x, int y, int r, int R, int n, Color c){
        g.setColor(c);
        g.fillOval(x - r, y - r,r + r, r + r);
        double da = 2 * Math.PI / n;
        BasicStroke s = new BasicStroke(2);
        g.setStroke(s);
        for(int i = 0; i < n; i++){
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            g.drawLine(x + (int)dx1,y + (int)dy1,x + (int)dx2,y +  (int)dy2);
        }
    }
}
