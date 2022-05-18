package com.company;

public class Animal {
    public final String species;
    public Double weight;
    public Integer age;
    public String name;
    public Boolean isAlive;

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

    public void feed() {
        if (weight >= 0){
            weight++;
        } else {
            System.out.println("twoj pet nie zyje");
        }
    }
    public void takeForAWalk() {
        if (weight >= 0){
            weight--;
        } else {
            System.out.println("twoj pet nie zyje");
        }
    }
}
