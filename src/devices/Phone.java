package devices;
import com.company.Human;
import  java.io.Serializable;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;
import javax.swing.*;



public class Phone  extends Device implements Serializable{

    public String operationSystem;
    public Double screenSize;
    public ArrayList<Application> appCollection;
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


    public Phone(String producer, String model, String operationSystem, Double screenSize, Integer yearOfProduction, Integer size) {
        this.producer = producer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
        this.yearOfProduction = yearOfProduction;
        this.appCollection = new ArrayList<>(size);
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

    public void reallyInstallApp(Human human, Application app, ArrayList<Application> list){
        if(human.Cash >= app.appValue){
            human.Cash -= app.appValue;
            list.add(list.lastIndexOf(app), app);
        }else {
            System.out.println("Go work and then try buy something :)");
        }
    }

    public void ifInstall(Application app, ArrayList<Application> list) {
        if (list.contains(app)){
                    System.out.println("You have this application in Phone");
                } else {
                    System.out.println("Okay install");
        }
    }

    public void ifInstall2(Application app) {
        if (app.getAppName() == app.appName) {
            System.out.println("You have this application in Phone");
        } else {
            System.out.println("Okay install");
        }
    }


    public void thisFree(Application app, ArrayList<Application> list){
        for(int i = 0; i < list.size(); i++ ){
        if(app.appValue == 0.0){
            appCollection.add(0,app);
        }
            System.out.println(appCollection);
    }
}

    public Double getAppValue(Application app, ArrayList<Application> list){
    double sum = 0.0;
    for(int i = 0; i < list.size(); i++){
        sum += app.appValue;
    } return sum;
}

    public void getAppSortedAlphabet(ArrayList<Application> app) {
        app.sort(Comparator.comparing(Application::getAppName));
        System.out.println(app);
    }

    public void getAppSortedValue(ArrayList<Application> app) {
        app.sort(Comparator.comparing(Application::getAppValue));
        System.out.println(app);
    }
}

