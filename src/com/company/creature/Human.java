package com.company.creature;
import com.company.creature.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Date;

public class Human implements Salleable {
    public String firstName;
    public String lastName;
    public Double cash;

    public Phone mobile;
    public Animal pet;
    private Car car;
    private Double salary;
    public Date nowDate = new Date();

    public Car getCar(Car car){
        return this.car;
    }

    public void setCar(Car car){
        if(this.salary > car.value){
            System.out.println("gratulacje kupiłes za gotówke");
            this.car = car;
        } else if (this.salary > (car.value/12)){
            System.out.println("gratulacje kupiłes na kredyt");
            this.car = car;
        } else {
            System.out.println("zmień prace wez kredyt");
        }
    }

    double getSalary(){
        System.out.println("salary: ");
        System.out.println(nowDate);
        return this.salary;
    }

    public void setSalary(double salary){
        if(salary >= 0) {
            this.salary = salary;
            System.out.println("informacje zostały wysłane do systemu ksiegowego");
            System.out.println("konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        } else {
            System.out.println("jak to jestes niewolnikiem?");
        }

    }

    @Override
    public void sell(Human Buyer, Human Seller, Double price) {

    }
}

