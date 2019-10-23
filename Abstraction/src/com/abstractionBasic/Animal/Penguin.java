package com.abstractionBasic.Animal;

public class Penguin extends Birds {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I Can't Fly, instead can i swim?");
    }
}
