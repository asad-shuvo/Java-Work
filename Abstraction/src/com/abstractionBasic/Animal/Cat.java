package com.abstractionBasic.Animal;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "   is Eating");
    }

    @Override
    public void breathe() {

        System.out.println("Breate In,Breate Out,Repeat");

    }
}
