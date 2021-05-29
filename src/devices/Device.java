package devices;

import com.company.Saleable;

public abstract class Device implements Saleable {

    public String producer;
    public String model;
    public Integer yearOfProduction;

    public String toString(){
        return producer + " " + model + " " + yearOfProduction;
    }

    public abstract String turnOn();


}
