package com.company;

import com.company.creature.Animal;
import com.company.creature.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
       Human marcin = new Human();
       marcin.firstName = "Marcin";
       marcin.lastName = "Zadrzynski";
       marcin.cash = 1000.0;

        Human zenon = new Human();
        marcin.firstName = "Zenon";
        marcin.lastName = "Marian";
        marcin.cash = 1000.0;

        Phone samsung = new Phone("gaalaxy", "samsung",2008);
        marcin.mobile = samsung;



        Car karlos = new Car("coroll", "toyota", 1992);
       karlos.value = 11000.0;

       Car wiesWagen = new Car( "wv", "golf", 1987);
       wiesWagen.value = 10000.0;



        Car pasat1 = new Car("pasat", "vw", 2001);
        pasat1.value = 1200.0;
        Car pasat2 = new Car("pasat", "vw", 2001);
        pasat1.value = 1200.0;

        marcin.setSalary(2000);

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


        System.out.println(marcin.mobile);
        samsung.sell(zenon,marcin,200.0);


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
