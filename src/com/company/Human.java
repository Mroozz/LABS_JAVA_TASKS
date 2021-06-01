package com.company;
import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.*;

public class Human {
    public String firstName;
    public String lastName;
    public String Sex;
    public Integer Age;
    public Double Cash;
    public Phone mobilePhone;
    public Animal pet;
    public ArrayList<Car> garage;
    private Double salary;
    public Integer size;

    public Human(String firstName, String lastName, String Sex, Integer Age, Double salary, Double Cash, Integer size) {
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Sex = Sex;
        this.Age = Age;
        this.Cash = Cash;
        this.size = size;
        this.garage = new ArrayList<Car>(size   );
        this.garage.trimToSize();
    }

    public Double getSalary() {
        System.out.println("Wage charged: " + this.salary);
        System.out.println("Date information was retrieved: " + new Date());
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0.0) {
            System.out.println("No thanks, I'm out");
        } else {
            System.out.println("Posted");
            System.out.println("Receive the annex from the accountant");
            System.out.println("ZUS and US are already informed");
            this.salary = salary;
        }
    }

    public Car getCar(ArrayList<Car> cars) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return cars.get(i);
    }

    public Animal getPet()                  { return pet; }
    public Phone getMobilePhone()           { return mobilePhone; }
    public void setMobilePhone(Phone phone) { this.mobilePhone = phone; }
    public void setPet(Animal pet)          { this.pet = pet; }

    public void setCar(ArrayList<Car> list, Car car) {
        if(list.size() < size + 1){
             list.add(0, car);}
        else {
            System.out.println("Garage is full");
        }

    }

    public Double addValueOfCars(ArrayList<Car> cars) {
        double sum = 0.0;
        for (int i = 0; i < cars.toArray().length; i++) {
            System.out.println("Select all your cars from list, in sequence, remember 0 is first")
            sum += getCar(cars).value;
        }
        System.out.println("All Your cars cost: " + sum);
        return sum;
    }

    public void getSorted(ArrayList<Car> c) {
        c.sort(Comparator.comparing(Car::getYear));
        System.out.println(c);
    }

    public boolean isArrayFull(ArrayList<Car> array) {
        for (int i = 0; i < array.toArray().length; i++) {
            if(i == array.toArray().length - 1){
                return false;
            }else{
                return true;
            }
        }
        return true;
    }

    public String toString() {
        return firstName + " " + lastName + " " + Sex + " " + Age + " " + salary;
    }

}
