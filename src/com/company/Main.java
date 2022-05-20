package com.company;

import com.company.creature.Animal;
import com.company.creature.Human;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
       Human marcin = new Human();
       marcin.firstName = "Marcin";
       marcin.lastName = "Zadrzynski";
       marcin.cash = 1000.0;


       Car karlos = new Car("coroll", "toyota", 1992);
       karlos.value = 11000.0;

       Car wiesWagen = new Car( "wv", "golf", 1987);
       wiesWagen.value = 10000.0;

       Animal Ares = new Animal("dog", 2.0) {
           @Override
           public void feed(double foodWeight) {
           }
           @Override
           public String toString() {
               return null;
           }
       };

        Car pasat1 = new Car("pasat", "vw", 2001);
        pasat1.value = 1200.0;
        Car pasat2 = new Car("pasat", "vw", 2001);
        pasat1.value = 1200.0;

        marcin.setSalary(2000);

        marcin.pet = Ares;
       marcin.setCar(karlos);


       marcin.getCar(wiesWagen);

        System.out.println(pasat1.hashCode());
        System.out.println(pasat2.hashCode());
        System.out.println(pasat1);

        if (pasat1.equals(pasat2)) {
            System.out.println("sa takie same");
        } else {
            System.out.println("inne auto");
        }

        pasat1.turnOn();

        System.out.println(marcin.cash);




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
