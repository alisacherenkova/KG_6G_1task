package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args){
        MainWindow mw = new MainWindow();
        mw.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mw.setSize(3000, 1600);
        mw.setVisible(true);
    }
}
