package devices;

import com.company.Human;

import java.util.Random;

public class Car extends Device{
    private Double value;

    public Car(String producer, String model, Double value, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.value = value;
        this.yearOfProduction = yearOfProduction;
    }

    public Double getValue() {
        return value;
    }
    @Override
    public boolean equals(Object obj){
        Car Audi2 = (Car) obj;
        return this.producer.equals(Audi2.producer) && this.model.equals(Audi2.model) && this.hashcode() == Audi2.hashcode();
    }

    public double hashcode() {
        return value;
    }

    public String toString() {
        return producer + " " + model + " " + value + " " + yearOfProduction;
    }

    public String turnOn(){
        return "Wrrrr, kle kle kle kle ";
    }

    public String sell(Human seller, Human buyer, Double price) {

        if(seller.getCar() != null && seller.getCar().producer.equals(producer) && buyer.Cash >= price) {
            System.out.println("Okay I sell" + this.producer + ". But price is " + price);
            buyer.Cash -= price;
            seller.Cash += price;
            buyer.setCar(seller.getCar());
            System.out.println("Okay it is good deal for both off uss");

        }else if(buyer.Cash < price){
            System.out.println("Dont waste my time, damn");

        }else {
            System.out.println("I never see it before lol");
        }

        return null;
    }
}
