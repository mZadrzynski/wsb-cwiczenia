package com.company.creature;

public class Pet extends Animal {
    public Pet (String species) {
        super(species);
    }
    public String toString() {
        return this.species + " " + this.name;
    }

    @Override
    public void feed(double foodWeight) {

    }

    @Override
    public void sell(Human buyer, Human seller, Double price) {

    }
}
