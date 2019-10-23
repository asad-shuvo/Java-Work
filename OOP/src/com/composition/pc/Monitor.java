package com.composition.pc;

public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resolutaion resolutation;

    public Monitor(String model, String manufacture, int size, Resolutaion resolutation) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.resolutation = resolutation;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println("Drwaing Pixel At "+ x+ " "+ y +" in color "+ color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolutaion getResolutation() {
        return resolutation;
    }
}
