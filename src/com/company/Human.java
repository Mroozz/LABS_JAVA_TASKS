package com.company;
import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Date;

public class Human {
    public String firstName;
    public String lastName;
    public String Sex;
    public Integer   Age;
    public Double Cash;
    public Phone mobilePhone;
    public Animal pet;
    private Car car;
    private Double salary;

    public Human (String firstName, String lastName, String Sex, Integer Age, Double salary, Double Cash) {
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Sex = Sex;
        this.Age = Age;
        this.Cash = Cash;
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



    public Car getCar() { return car; }
    public Animal getPet() { return pet; }
    public Phone getMobilePhone() {return mobilePhone; }

    public void setMobilePhone(Phone phone) { this.mobilePhone = phone; }
    public void setPet(Animal pet) { this.pet = pet; }
    public void setCar(Car car) { this.car = car; }

    public String toString() {
        return firstName + " " + lastName + " " + Sex + " " + Age + " " + salary;
    }



}
