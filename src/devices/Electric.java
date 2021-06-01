package devices;

import com.company.Human;

public class Electric extends Car{
    public Electric(String producer, String model, Double value, Integer yearOfProduction) {
        super(producer, model, value, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println(this.model +": Okay, I'm full. Get out of here");
    }

    @Override
    public int compareTo(Human o) {
        return yearOfProduction;
    }
}
