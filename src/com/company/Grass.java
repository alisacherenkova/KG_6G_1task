package com.company;

import java.awt.*;

public class Grass implements Drawable {

    @Override
    public void draw(Graphics2D g) {
        drawGrass(g);
    }

    private static void drawGrass(Graphics2D gr) {
        gr.setColor(Color.GREEN);
        gr.fillRect(0, 500, 2000, 1200);
        //drawFlowers(gr);
    }
}