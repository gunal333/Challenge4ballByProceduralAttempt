package com.tw;
import processing.core.PApplet;

public class Challenge extends PApplet {

    public static final int WIDTH = 720;
    public static final int HEIGHT = 520;
    public static final int DIAMETER = 10;
    int i=0,j=0,k=0,l = 0;
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void draw() {
        drawCircle();
    }
    private void drawCircle() {
        ellipse(i,HEIGHT/5, DIAMETER, DIAMETER);
        ellipse(j,(HEIGHT*2)/5, DIAMETER, DIAMETER);
        ellipse(k,(HEIGHT*3)/5, DIAMETER, DIAMETER);
        ellipse(l,(HEIGHT*4)/5, DIAMETER, DIAMETER);
        i++;
        j+=2;
        k+=3;
        l+=4;
    }

    public static void main(String[] args) {
        PApplet.main("com.tw.Challenge",args);
    }
}
