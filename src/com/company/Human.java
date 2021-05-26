package com.company;
import devices.Car;
import devices.Phone;

import java.util.Date;

public class Human {
    public String firstName;
    public String lastName;
    public String Sex;
    public Integer   Age;

    Phone mobilePhone;
    Animal pet;

    private Car Audi;

    private Double salary;

    public Human (String firstName, String lastName, String Sex, Integer Age, Double salary) {
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Sex = Sex;
        this.Age = Age;
    }

    public Double getSalary() {
        System.out.println("Wage charged: " + this.salary);
        System.out.println("Date information was retrieved: " + new Date());
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0.0) {
            System.out.println("No thanks, I'm out");
        }
        else{
            System.out.println("Posted");
            System.out.println("Receive the annex from the accountant");
            System.out.println("ZUS and US are already informed");
            this.salary = salary;
        }
    }

    public Car getAudi() { return Audi; }

    public void setCar(Car Audi) {
        if(this.salary > Audi.getValue()) {
            System.out.println("For cash");
            this.Audi = Audi;
        }
        else if(this.salary > Audi.getValue() / 12.0) {
                System.out.println("On credit");
            }
        else {
            System.out.println("Sorry but no");
        }
    }

    public String toString() {
        return firstName + " " + lastName + " " + Sex + " " + Age + " " + salary;
    }
}
