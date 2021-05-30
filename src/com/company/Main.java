package com.company;
import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;
import static devices.Phone.defaultAppURL;

public class Main {

    public static void main(String[] args){
        Pet dog = new Pet("dog");
        dog.name = "Wolf";
        System.out.println("Dog name = " + dog.name);

        Pet cat = new Pet("cat");
        cat.name = "Suzie";

        dog.feed(); dog.feed(); dog.feed();
        dog.takeForAWalk();dog.takeForAWalk();

        Phone Samsung = new Phone("Samsung", "S10", "Android12", 6.0, 2020);
        Human Man = new Human("John", "Smith", "Male",24,9636.9,66666.0);
        Human Women = new Human("Angie","Jolie", "female",23,9969.9, 66666.0);

        Car Audi = new Diesel("Volkswagen", "RS6", 60000.0, 2011) {
            public double hashcode() {
                return getValue();
            }
        };
        Car Audi2 = new Diesel("Volkswagen", "RS6", 60000.0, 2011) {
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
        Audi2.sell(Man,Women,30000.0);
        Audi.sell(Man,Women,60000.0);

        Animal bear = new FarmAnimal("bear");
        bear.name = "Lotek";
        bear.feed();
        bear.feed(200);

        bear.beEaten();

        Samsung.installAnnApp("Youtube");
        Samsung.installAnnApp1("Youtube", 2.0);
        Samsung.installAnnApp2("Youtube",1.0, defaultAppURL);

        Car Panda = new LPG("Fiat","Panda",15000.0,2015);
        System.out.println(Panda);
        System.out.println(bear);

        Car Tesla = new Electric("Tesla","S",200000.0,2019);
        System.out.println(Tesla);

        Samsung.installAnnApp2("Gmail",2.5, defaultAppURL);
        Panda.refuel();

        }
    }

