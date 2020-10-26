package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel  extends JPanel {

    private Sun s = new Sun( 90, 120, 30, 70, 33, Color.YELLOW);
    private Grass grass = new Grass();
    private Track track = new Track(0, 600);
    private House house = new House(1050, 350);
    //private Alien alien = new Alien(40, 300);
    private UFO ufo = new UFO(350, 90);

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        s.draw(gr);
        grass.draw(gr);
        Random.drawAmountFlowers(gr, 35);
        track.draw(gr);
        house.draw(gr);
        Random.drawAmountTree(gr, 3);
        //alien.draw(gr);
        ufo.draw(gr);
        Random.drawAmountAlien(gr, 3);

    }
}
