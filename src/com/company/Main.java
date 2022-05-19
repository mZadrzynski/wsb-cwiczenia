package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
       Human marcin = new Human();
       Car karlos = new Car("corolla","toyota");
       Animal Ares = new Animal("dog", 2.0);
       marcin.car = karlos;
       marcin.pet = Ares;



        marcin.setSalary(2000);
        System.out.println(marcin.getSalary());


        /*
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
       */

    }
}
