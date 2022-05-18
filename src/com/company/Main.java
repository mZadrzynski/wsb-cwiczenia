package com.company;

public class Main {

    public static void main(String[] args) {
       Human marcin = new Human();
       Car karlos = new Car("corolla","toyota");


       Animal Ares = new Animal("dog", 2.0);

       System.out.println(Ares.weight);
       Ares.feed();
       Ares.takeForAWalk();
       System.out.println(Ares.weight);
       Ares.takeForAWalk();
       System.out.println(Ares.weight);
        Ares.takeForAWalk();
        Ares.takeForAWalk();
        Ares.takeForAWalk();
        System.out.println(Ares.weight);

    }
}
