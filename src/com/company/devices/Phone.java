package com.company.devices;

import com.company.creature.Human;

public class Phone extends Device {
    public Double sceenSize;

    public Phone(String model, String producer, Integer yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("wciskam przycisk");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("o! jest logo, jednak działa");
    }


    @Override
    public void sell(Human buyer, Human seller, Double price) {
        if (seller.mobile == null ) {
            System.out.println(seller.firstName + " nie masz telefonu do sprzedaży");
        } else if (buyer.cash < price) {
            System.out.println(buyer.firstName + " nie masz wystarczajaco kasy by kupic");
        } else {
            System.out.println("brawo kupiles");
            seller.cash = seller.cash + price;
            buyer.cash = buyer.cash - price;

        }
    }
}
