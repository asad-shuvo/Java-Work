package com.oop.challenge;

public class DeluxBurger extends Hamburger{
    public DeluxBurger() {
        super("Delux","Sausage & meat",14.44,"White");
        super.addHamBurgerAddition1("Chips",2.75);
        super.addHamBurgerAddition2("Drink",3.44);
    }

    @Override
    public void addHamBurgerAddition1(String name, double price) {
        System.out.println("Cant add here");
    }

    @Override
    public void addHamBurgerAddition2(String name, double price) {
        System.out.println("Cant add here");
    }

    @Override
    public void addHamBurgerAddition3(String name, double price) {
        System.out.println("Cant add here");
    }

    @Override
    public void addHamBurgerAddition4(String name, double price) {
        System.out.println("Cant add here");
    }
}
