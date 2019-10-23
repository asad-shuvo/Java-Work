package com.car;

public class Car {
private int speed;
private int wheel;
private String name;

    public int getSpeed() {

        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getName() {
        String ret=name.toLowerCase();
        if(ret.equals("porshee"))
        return name;
        else return "Unknown";
    }

    public void setName(String name) {
        this.name = name;
    }
}
