package com.company;
import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

import java.util.List;

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

        Phone Samsung = new Phone("Samsung", "S10", "Android12", 6.0, 2020, 20);

        Human Man = new Human("John", "Smith", "Male",24,9636.9,66666.0, 2);
        Human Women = new Human("Angie","Jolie", "female",23,9969.9, 66666.0, 2);

        Car Audi = new Diesel("Volkswagen", "RS6", 60000.0, 2011) ;
        Car Audi2 = new Diesel("Volkswagen", "RS6", 60000.0, 2011);

        System.out.println("Phone producer = " + Samsung.producer);

        Man.mobilePhone = Samsung;
        Man.pet = dog;
        Man.setCar(Man.garage, Audi);
        Audi.ownerList.add(Man);

        Women.mobilePhone = Samsung;
        Women.pet = cat;
        Women.setCar(Women.garage, Audi2);
        Audi2.ownerList.add(Women);

        Double mySalary = Man.getSalary();
        Double newSalary = mySalary * 1.2;
        Man.setSalary(newSalary);

        System.out.println(dog);
        System.out.println(Man);

        System.out.println(Audi);
        System.out.println(Audi.turnOn());

        System.out.println(Samsung);
        System.out.println(Samsung.turnOn());

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
        Man.setCar(Man.garage, Panda);
        Man.getSorted(Man.garage);
        Women.getSorted(Women.garage);

        System.out.println(Audi.ownerList);

        Audi.sell(Man,Women,1.0);
        Women.getSorted(Women.garage);
        Women.addValueOfCars(Women.garage);

        System.out.println("Audi owners: " + Audi.ownerList);

        System.out.println("You be the first Tesla owner! " + Tesla.firstOwner());

        System.out.println("Yes, I sell You my car. " + Audi.youBuyIt(Audi.ownerList,Man));

        System.out.println("You'll first owner in country ;) But on the world, you  " + Audi.howManyOwners(Audi.ownerList));

        Application Gmail = new Application("Gmail",2.0,0.0);
        Application Rich = new Application("IAmRich",1.0,1000.0);


        Samsung.appCollection.add(0,Rich);
        Samsung.ifInstall(Rich, Samsung.appCollection);

        }
    }

