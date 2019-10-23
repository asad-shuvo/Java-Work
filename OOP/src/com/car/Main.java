package com.car;

public class Main {
    public static void main(String[]args){
        Car car=new Car();
        car.setName("Porshee");
        car.setSpeed(50);
        car.setWheel(4);

        System.out.println(car.getName());
    }
}
