package com.composition.room;

public class Celing {
    private int height;
    private int paintedColor;

    public Celing(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        System.out.println(height);
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }
}
