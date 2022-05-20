package com.company.creature;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public String toString() {
        return this.species + " " + this.getWeight();
    }

    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println("omniomniomniom");
    }

    @Override
    public void feed(double foodWeight) {

    }
}
