package com.company;

public class Animal implements Saleable {
    String species;
    String name;
    private Double weight;

    static public final Double DEFAULT_ANIMAL_WEIGHT=1.0;

    Animal(String species) {
        this.species = species;
        switch(this.species) {
            case "dog":
                this.weight = 25.0; break;
            case "cat":
                this.weight = 5.0; break;
            case "Bear":
                this.weight = 500.0; break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT; break;
        }
    }

    void feed() {
        if (this.weight > 0) {
            this.weight += 1;
            System.out.println("thx for food");
        } else {
            System.out.println("Nooo!? Wrrrr!");
        }
    }
    void takeForAWalk() {
            if(weight > 0){
                this.weight -= 1;
                System.out.println("thx for walk, my weight now it " + this.weight);
            }
            else{
                System.out.println("Nooo!? Wrrrr!");
            }
        }

    public String toString() {
        return species + " " + name + " " + weight;
    }

    @Override
    public String sell(Human seller, Human buyer, Double price) {

        if(seller.getPet() != null && seller.pet.species.equals(species) && buyer.Cash >= price) {
            System.out.println("Okay I sell" + this.species + ". But price is " + price);
            buyer.Cash -= price;
            seller.Cash += price;
            buyer.setPet(seller.getPet());
            System.out.println("Okay it is good deal for both off uss");

        }else if(buyer.Cash < price){
            System.out.println("Dont waste my time, damn");

        }else {
            System.out.println("I never see it before lol");
        }

        return null;
    }
}
