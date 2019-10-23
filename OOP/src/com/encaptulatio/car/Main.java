package com.encaptulatio.car;

class Car{
    private int engine;
    private int cylinders;
    private int wheels;

    public Car(int engine, int cylinders, int wheels) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }
public void startEngineee(){
        System.out.println("Engine Start");
}
public void accelerate(){
    System.out.println("Pressed Accelerate");
}

public void brake(){
    System.out.println("Break Pressed");
}
    public int getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Honda extends Car{
    public Honda(int engine, int cylinders, int wheels) {
        super(engine, cylinders, wheels);
    }

    @Override
    public void startEngineee() {
        System.out.println("Enginee Start at Honda");
    }

    @Override
    public void accelerate() {
        System.out.println("accelator pressed at Honda class");
    }

    @Override
    public void brake() {
        System.out.println("Break pressed at Honda class");
    }
}
class Marcedes extends Car{
    public Marcedes(int engine, int cylinders, int wheels) {
        super(engine, cylinders, wheels);
    }

    @Override
    public void startEngineee() {
        System.out.println("Enginee Start at Marcedes");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerator pressed at Marcedes class");
    }

    @Override
    public void brake() {
        System.out.println("Brake pressed at Marcedes class");
    }
}
class Jaguar extends Car{
    public Jaguar() {
        super(1, 2, 4);
    }

    @Override
    public void startEngineee() {
        System.out.println("Enginee Start at Jaguar");
    }

    @Override
    public void accelerate() {
        System.out.println("Acceleartor in Jaguar class");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSuperclass()+"  "+"Break Pressed ");
    }
}

public class Main {
    public static  void main(String[] args){
        Jaguar jaguar=new Jaguar();
        jaguar.accelerate();
        jaguar.brake();
    }
}
