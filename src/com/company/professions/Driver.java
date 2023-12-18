package com.company.professions;

public class Driver extends Person{
    int drivingExperience;

    public Driver(String fullName, int age, int drivingExperience) {
        super(fullName, age);
        this.drivingExperience = drivingExperience;
    }

    @Override
    public void display(){
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Driving Experience: " + drivingExperience + " years");
    }
}
