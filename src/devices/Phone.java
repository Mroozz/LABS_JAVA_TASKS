package devices;

public class Phone {
    public String producer;
    public String model;
    public String operationSystem;
    public Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
    }
    public String toString() {
        return producer + " " + model + " " + operationSystem + " " + screenSize;
    }
}
