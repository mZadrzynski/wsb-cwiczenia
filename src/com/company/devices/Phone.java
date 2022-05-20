package com.company.devices;

import com.company.creature.Human;

public class Phone extends Device {
    public Double sceenSize;

    protected Phone(String model, String producer, Integer yearOfProduction) {
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
    public void sell(Human Buyer, Human Seller, Double price) {

    }
}
