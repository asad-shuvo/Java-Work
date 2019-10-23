package com.Inheritence;

public class cat extends Animal {

    private int leg;
    private int teeth;

    public cat(String name, int age, String gender, int weight, int leg, int teeth) {
        super(name, age, gender, weight);
        this.leg = leg;
        this.teeth = teeth;
    }

    @Override
    public void eat() {
        System.out.println("cat eat");
        super.eat();
    }
}
