package com.Inheritance.car;

public class Volvo extends Car {
    private int made;
    private int series;

    public Volvo(String name, int serial_num, int engine, int wheal, int speed, int size, int made, int series) {
        super(name, serial_num, engine, wheal, speed, size);
        this.made = made;
        this.series = series;
    }
}
