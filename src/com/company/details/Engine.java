package com.company.details;

public class Engine {
    String manufacturer;
    int power;

    public Engine(String manufacturer, int power){
        this.manufacturer = manufacturer;
        this.power = power;
    }

    public void display(){
        System.out.println("Manufacture: " + manufacturer);
        System.out.println("Power: " + power);
    }
}


