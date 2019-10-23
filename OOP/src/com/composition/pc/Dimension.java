package com.composition.pc;

public class Dimension {
    private int height;
    private int weight;
    private int depth;

    public Dimension(int height, int weight, int depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }

    public int getHeight() {

        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getDepth() {
        return depth;
    }
}
