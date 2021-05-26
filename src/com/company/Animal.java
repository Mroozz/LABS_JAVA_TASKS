package com.company;

public class Animal<weight> {
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
}
