package devices;

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
}
