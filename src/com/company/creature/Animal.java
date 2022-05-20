package com.company.creature;

public abstract class Animal implements Feedable, Salleable {
    public final String species;
    public Double weight;
    public Integer age;
    public String name;
    public Boolean isAlive;
    public Double value;

    public Animal(String species, Double defaultWeight){
        this.species = species;
         switch(this.species) {
            case("dog"):
                defaultWeight = 9.0;
            case("cat"):
                defaultWeight = 2.5;
            default:
                weight = defaultWeight;
        }
    }

    public Double getWeight() {
        return this.weight;
    }

    public Animal(String species) {
        this.species = null;
    }


    public void feed() {
        if (weight >= 0){
            weight++;
        } else {
            System.out.println("twoj pet nie zyje");
        }
    }

    public void feed(Double foodWeight) {
        if (isAlive) {
            weight += foodWeight;
            System.out.println("thx for food");
        } else {
            System.out.println("trochę za późno");
        }
    }

    public void takeForAWalk() {
        if (weight >= 0){
            weight--;
        } else {
            System.out.println("twoj pet nie zyje");
        }
    }
    public abstract String toString();

}
