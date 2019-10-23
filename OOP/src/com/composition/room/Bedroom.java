package com.composition.room;

public class Bedroom {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Lamp lamp;
    private Celing celling;
    private Bed bed;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Lamp lamp, Celing celling, Bed bed) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.lamp = lamp;
        this.celling = celling;
        this.bed = bed;
    }
public Lamp getLamp(){
        return this.lamp;
}
public Wall getWall(){
    return this.wall1;
}
public Celing getCelling(){
    return this.celling;
}
public void makeBed(){
    System.out.println("Bedroom -> Making Bed");
    bed.make();
}
}
