package com.Inheritance.car;

public class Main {
    public static void main(String[]args) {
        Vehicle vehicle = new Vehicle("Truck", 1, 2, 6, 1200);
        Car car = new Car("Porshaa", 2, 2, 4, 1900, 30);
        Volvo volvo = new Volvo("New Volvo", 3, 3, 4, 1000, 39, 19990, 5);

    System.out.println(car.getName());
    System.out.println(volvo.getName());
   car.move(70);
    }
}
