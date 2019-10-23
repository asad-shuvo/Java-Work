package com.abstractionBasic.Animal;

public abstract class Birds extends Animal implements CanFly {

    public Birds(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"  is peckig");
    }

    @Override
    public void breathe() {
        System.out.println("Breate In,Breate Out,Repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName()+ "  Flapping its wings");
    }
}
