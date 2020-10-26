package com.company;

import java.awt.*;

 class Random {
    static int interval(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++ max) + min;
    }

     static void drawAmountFlowers(Graphics2D gr, int amountFlowers) {
        for (int i = 0; i < amountFlowers; i++) {
            int x = Random.interval(0, 2000);
            int y = Random.interval(500 , 800);
            Flower flower = new Flower(x, y);
            flower.draw(gr);
        }
    }

     static void drawAmountTree(Graphics2D gr, int amountTree) {
         for (int i = 0; i < amountTree; i++) {
             int x = Random.interval(0, 1010);
             int y = Random.interval(100 , 800);
             Tree tree = new Tree(x, y);
             tree.draw(gr);
         }
     }
     static void drawAmountAlien(Graphics2D gr, int amountAlien) {
         for (int i = 0; i < amountAlien; i++) {
             int x = Random.interval(0, 300);
             int y = Random.interval(200 , 400);
             Alien alien = new Alien(x, y);
             alien.draw(gr);
         }
     }
}
