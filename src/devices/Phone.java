package devices;

import com.company.Human;

import javax.swing.*;

public class Phone extends Device{

    public String operationSystem;
    public Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
        this.yearOfProduction = yearOfProduction;
    }
    public String toString() {
        return producer + " " + model + " " + operationSystem + " " + screenSize + " " + yearOfProduction;
    }

    public String turnOn(){
        return "Phone starts wait ...";
    }
    public String sell(Human seller, Human buyer, Double price) {

        if(seller.getMobilePhone() != null && seller.mobilePhone.producer.equals(producer) && buyer.Cash >= price) {
            System.out.println("Okay I sell" + this.producer + ". But price is " + price);
            buyer.Cash -= price;
            seller.Cash += price;
            buyer.setMobilePhone(seller.getMobilePhone());
            System.out.println("Okay it is good deal for both off uss");

        }else if(buyer.Cash < price){
            System.out.println("Dont waste my time, damn");

        }else {
            System.out.println("I never see it before lol");
        }

        return null;
    }
}
