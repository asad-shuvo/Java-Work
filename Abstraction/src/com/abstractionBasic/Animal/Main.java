package com.abstractionBasic.Animal;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat("Puffy");
        cat.breathe();
        cat.eat();
    Parrot parrot=new Parrot("Bangladeshi Parrot");
    parrot.breathe();
    parrot.eat();
    parrot.fly();

    Penguin penguin=new Penguin("Emporer");
    penguin.fly();

    }
}
