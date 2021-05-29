package com.company;

import devices.Car;
import devices.Device;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Wolf";
        System.out.println("Dog name = " + dog.name);

        dog.feed(); dog.feed(); dog.feed();
        dog.takeForAWalk();dog.takeForAWalk();

        Phone Samsung = new Phone("Samsung", "S10", "Android12", 6.0, 2020);
        Human Man = new Human("John", "Smith", "Male",24,9636.9);

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

        Double mySalary = Man.getSalary();
        Double newSalary = mySalary * 1.2;
        Man.setSalary(newSalary);

        Man.setCar(Audi);

        System.out.println(Audi.equals(Audi2));
        System.out.println(dog);
        System.out.println(Man);
        System.out.println(Audi);
        System.out.println(Audi.turnOn());
        System.out.println(Samsung);
        System.out.println(Samsung.turnOn());


    }
}
