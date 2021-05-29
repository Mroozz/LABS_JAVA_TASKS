package com.company;
import devices.Car;
import devices.Device;
import devices.Phone;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Wolf";
        System.out.println("Dog name = " + dog.name);

        Animal cat = new Animal("cat");
        cat.name = "Suzie";

        dog.feed(); dog.feed(); dog.feed();
        dog.takeForAWalk();dog.takeForAWalk();

        Phone Samsung = new Phone("Samsung", "S10", "Android12", 6.0, 2020);
        Human Man = new Human("John", "Smith", "Male",24,9636.9,66666.0);
        Human Women = new Human("Angie","Jolie", "female",23,9969.9, 66666.0);

        Car Audi = new Car("Volkswagen", "RS6", 60000.0, 2011) {
            public double hashcode() {
                return getValue();
            }
        };
        Car Audi2 = new Car("Volkswagen", "RS6", 60000.0, 2011) {
            public double hashcode() {
                return getValue();
            }
        };



        System.out.println("Phone producer = " + Samsung.producer);



        Man.mobilePhone = Samsung;
        Man.pet = dog;
        Man.setCar(Audi);

        Women.mobilePhone = Samsung;
        Women.pet = cat;
        Women.setCar(Audi2);


        Double mySalary = Man.getSalary();
        Double newSalary = mySalary * 1.2;
        Man.setSalary(newSalary);



        System.out.println(Audi.equals(Audi2));
        System.out.println(dog);
        System.out.println(Man);
        System.out.println(Audi);
        System.out.println(Audi.turnOn());
        System.out.println(Samsung);
        System.out.println(Samsung.turnOn());

        cat.sell(Women,Man,20000.0);
        Audi2.sell(Women,Man,40000.0);
        System.out.println(Man.Cash);
        System.out.println(Man.pet);
        System.out.println(Women.Cash);
        System.out.println(Women.pet);
        Audi2.sell(Man,Women,30000.0);
        Audi.sell(Man,Women,60000.0);
    }
}
