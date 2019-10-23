package com.composition.pc;

public class Case {
    private String model;
    private String manufatrure;
    private String powerSupply;
    private Dimension dimension;

    public Case(String model, String manufatrure, String powerSupply, Dimension dimension) {

        this.model = model;
        this.manufatrure = manufatrure;
        this.powerSupply = powerSupply;
        this.dimension = dimension;
    }
    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufatrure() {
        return manufatrure;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
