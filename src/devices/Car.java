package devices;
import com.company.Human;

public abstract class Car extends Device implements Comparable<Human>{

    public Car(String producer, String model, Double value, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.value = value;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void refuel();
    public String getProducer(){ return producer; }
    public String getModel(){ return model; }
    public Double getValue() { return value; }
    public Integer getYear() { return yearOfProduction; }
    public String toString() {
        return producer + " " + model + " " + value + " " + yearOfProduction;
    }
    public String turnOn(){
        return "Wrrrr, kle kle kle kle ";
    }

    public String sell(Human seller, Human buyer, Double price) {

        System.out.println("On which place Your car is? You know, You selling it for price '" + price +
                "' Select Car and confirm Your choice");
        if(seller.getCar(seller.garage).equals(seller.getCar(seller.garage))) {

            System.out.println("Okay I sell it But price is " + price);

                if(buyer.Cash < price) {
                    System.out.println("Don't waste my time, damn");
                }else{
                    buyer.Cash -= price;
                    seller.Cash += price; }

                if(buyer.isArrayFull(buyer.garage)) {
                    System.out.println("Your garage is full. You can't buy a car.");
                }else{

            System.out.println("Fine, car from place number? Set car place please ;)");
                buyer.garage.add(seller.getCar(seller.garage));

            System.out.println("Only one solution work in here, ehh, which car i must remove? Set car place please");
                seller.garage.remove(seller.getCar(seller.garage));

            System.out.println("Okay it is good deal for both off uss");}

        }else {
            System.out.println("I never see it before lol");}
        return null;
    }


}
