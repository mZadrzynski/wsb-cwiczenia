package com.company.devices;

import com.company.creature.Human;

import java.util.Objects;

public class Car extends Device{
    public Double value;
    public Double millage;
    public Double engineVolume;
    public String color;

    public Car(String model, String producer, Integer yearOfProduce) {
        super(model, producer, yearOfProduce);
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", millage=" + millage +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                '}';
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return car.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, producer, millage, engineVolume, color, value);
    }

    @Override
    public void sell(Human Buyer, Human Seller, Double price) {

    }
}
