package devices;
import com.company.Human;
import  java.io.Serializable;
import java.net.URL;
import javax.swing.*;



public class Phone  extends Device implements Serializable{

    public String operationSystem;
    public Double screenSize;
    public String[] data = {"Google Store", "Google Chrome", "Gmail", "'Spotify", "Youtube"};

    public static final  String defaultProtocol = "https";
    public static final String defaultNameVersion = "GoogleStore";
    public static final java.net.URL defaultAppURL = makeUrl("https://play.google.com/store/apps?hl=pl&gl=US");

    public static java.net.URL makeUrl(String urlString) {
        try {
            return new java.net.URL(urlString);
        } catch (java.net.MalformedURLException e) {
            return null;
        }
    }


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
    public String sell(Human seller, Human buyer, Double price) {

        if (seller.getMobilePhone() != null && seller.mobilePhone.producer.equals(producer) && buyer.Cash >= price) {
            System.out.println("Okay I sell" + this.producer + ". But price is " + price);
            buyer.Cash -= price;
            seller.Cash += price;
            buyer.setMobilePhone(seller.getMobilePhone());
            System.out.println("Okay it is good deal for both off uss");

        } else if (buyer.Cash < price) {
            System.out.println("Dont waste my time, damn");

        } else {
            System.out.println("I never see it before lol");
        }
        return null;
    }

    public void installAnnApp(String appName){
        System.out.println(appName + " install now");
    }

    public void installAnnApp1(String appName, Double appVersion){
        System.out.println("The " + appName + " version: " + appVersion + " now installing");
    }

    public void installAnnApp2(String appName, Double appVersion, URL defaultAppURL){
        System.out.println("The " + appName + " version: " + appVersion + " now installing" + " From:" + defaultAppURL);
    };



}
