package com.Inheritance.car;

public class Vehicle {

    private String name;
    private int serial_num;
    private int engine;
    private int wheal;
    private int speed;

    public Vehicle(String name, int serial_num, int engine, int wheal, int speed) {
        this.name = name;
        this.serial_num = serial_num;
        this.engine = engine;
        this.wheal = wheal;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSerial_num() {
        return serial_num;
    }

    public int getEngine() {
        return engine;
    }
    public void move(int speed){
        System.out.println("Move from vehicle class"+ "Speed=="+speed);
    }
    public int getWheal() {
        return wheal;
    }

    public int getSpeed() {
        return speed;
    }
}

