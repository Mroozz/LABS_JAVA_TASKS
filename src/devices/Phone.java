package devices;

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
}
