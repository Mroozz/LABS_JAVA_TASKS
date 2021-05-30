package devices;

public class Diesel extends Car{
    public Diesel(String producer, String model, Double value, Integer yearOfProduction) {
        super(producer, model, value, yearOfProduction);
    }
    @Override
    public void refuel() {
        System.out.println(this.model +": Okay, I'm full. Get out of here");
    }
}
