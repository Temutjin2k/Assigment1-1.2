package com.company.vehicles;

public class Cars {
    String carBrand;
    String carClass;
    String driverType;
    String engineType;
    double weight;

    public Cars(String carBrand, String carClass, String driverType, String engineType, double weight){
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.driverType = driverType;
        this.engineType = engineType;
        this.weight = weight;
    }


    public void display(){
        System.out.println("Car brand: " + carBrand);
        System.out.println("Car Class: " + carClass);
        System.out.println("Driver type: " + driverType);
        System.out.println("Engine type: " + engineType);
        System.out.println("Weight: " + weight);
    }

    public void start(){
        System.out.println("Let's go");
    }
    public void stop(){
        System.out.println("Let's stop");
    }
    public void turnRight(){
        System.out.println("Turn right");
    }
    public void turnLeft(){
        System.out.println("Turn left");
    }

}

class Lorry extends Cars{
    double carryingCapacity;
    public Lorry(String carBrand, String carClass, String driverType, String engineType, double weight, double carryingCapacity) {
        super(carBrand, carClass, driverType, engineType, weight);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void display(){
        System.out.println("Car brand: " + carBrand);
        System.out.println("Car Class: " + carClass);
        System.out.println("Driver type: " + driverType);
        System.out.println("Engine type: " + engineType);
        System.out.println("Weight: " + weight);
        System.out.println("Carrying capacity: " + carryingCapacity);
    }

}

class SportCar extends Cars {
    double topSpeed;
    public SportCar(String carBrand, String carClass, String driverType, String engineType, double weight, double topSpeed) {
        super(carBrand, carClass, driverType, engineType, weight);
        this.topSpeed = topSpeed;
    }

    @Override
    public void display(){
        System.out.println("Car brand: " + carBrand);
        System.out.println("Car Class: " + carClass);
        System.out.println("Driver type: " + driverType);
        System.out.println("Engine type: " + engineType);
        System.out.println("Weight: " + weight);
        System.out.println("Top speed: " + topSpeed);
    }
}

/*⦁	The Car class contains the fields - car brand, car class, weight, Driver type driver, Engine type motor.
Methods start(), stop(), turnRight(), turnLeft(), which print: "Let's go", "Let's stop",
"Turn right" or "Turn left". As well as the toString() method,
 which displays complete information about the car, its driver and motor*/