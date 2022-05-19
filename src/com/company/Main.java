package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
       Human marcin = new Human();
       marcin.firstName = "Marcin";
       marcin.lastName = "Zadrzynski";


       Car karlos = new Car("corolla","toyota");
       karlos.value = 11000.0;

       Car wiesWagen = new Car( "wv", "golf");
       wiesWagen.value = 10000.0;

       Animal Ares = new Animal("dog", 2.0);


       marcin.pet = Ares;
       marcin.setCar(karlos);


       marcin.getCar(wiesWagen);
       System.out.println(marcin.getCar(karlos));



        marcin.setSalary(2000);
        marcin.setCar(karlos);

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
