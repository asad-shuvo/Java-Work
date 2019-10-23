package com.Inheritance.car;

public class Car extends Vehicle {
    private int size;

    public Car(String name, int serial_num, int engine, int wheal, int speed, int size) {
        super(name, serial_num, engine, wheal, speed);
        this.size = size;
    }

    @Override
    public void move(int speed) {
        System.out.println("Move From Car class");
        super.move(speed);
    }
}
