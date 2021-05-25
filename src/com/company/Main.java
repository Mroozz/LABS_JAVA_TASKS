package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");
        dog.name = "Wolf";

        Phone Samsung = new Phone("Samsung", "S10", "Android12", 6.0);
        Car Audi = new Car("Volkswagen", "RS6", 60000.0);

        System.out.println("Phone producer = " + Samsung.producer);
        System.out.println("Dog name = " + dog.name);

        Human me = new Human(9636.9);
        me.mobilePhone = Samsung;

        Double mySalary = me.getSalary();
        Double newSalary = mySalary * 1.2;
        me.setSalary(newSalary);

        me.setCar(Audi);
    }
}
