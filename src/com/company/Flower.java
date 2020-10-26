package com.company;

import java.awt.*;

public class Flower implements Drawable {
    int x;
    int y;

    Flower(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D gr) { drawFlowers(gr);}

    private void drawFlowers(Graphics2D gr) {
        int centerR = 10;
        int petalR = 8;
        drawPetals(gr, centerR, petalR, x, y);
        drawCenter(gr, centerR, x, y);
    }

    private static void drawPetals(Graphics2D gr, int centerR, int petalR, int x, int y) {
            gr.setColor(Color.YELLOW);
            gr.fillOval(x - petalR, y, petalR, petalR);
            gr.fillOval(x, y + petalR, petalR,  petalR);
            gr.fillOval(x + petalR, y,  petalR, petalR);
            gr.fillOval(x, y - petalR,  petalR,   petalR);

    }

    private static void drawCenter(Graphics2D gr, int centerR, int x, int y) {
            gr.setColor(Color.WHITE);
            gr.fillOval(x, y, centerR, centerR);
    }
}

