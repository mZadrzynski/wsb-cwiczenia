package com.company;
import java.util.Date;

import org.w3c.dom.ls.LSOutput;

public class Human {
    public String firstName;
    public String lastName;
    public Phone mobile;
    public Animal pet;
    public Car car;
    private Double salary;
    public Date nowDate = new Date();


    double getSalary(){
        System.out.println("salary: ");
        System.out.println(nowDate);
        return this.salary;
    }

    void setSalary(double salary){
        if(salary >= 0) {
            this.salary = salary;
            System.out.println("informacje zostały wysłane do systemu ksiegowego");
            System.out.println("konieczności odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
        } else {
            System.out.println("jak to jestes niewolnikiem?");
        }

    }
}
