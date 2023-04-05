package org.example;

public class Main {
    public static void main(String[] args) {

        Car carReferance = new Car();
        carReferance.name = "Ferrari";
        carReferance.maxSpeed = 300;
        carReferance.fuelLevel = 60;
        carReferance.mileage = 12.5;
        carReferance.totalTraveledDistance = 0;
        carReferance.damaged = true;
        carReferance.doorCount = 2;
        carReferance.color = "black";

        Engine engine1 = new Engine();
        engine1.manufracturer = "Ferrari";
        engine1.capacity = 3000;

        carReferance.engine = engine1;

        //System.out.println("Engine1 capacity "+ engine1.capacity);
        System.out.println("Car engine1 capacity " + carReferance.engine.capacity);

        engine1.capacity = 4000;
        System.out.println("Car engine1 capacity after update " + carReferance.engine.capacity);


        //concatenation
        System.out.println("Name of car " + carReferance.name);
        System.out.println("Max speed: " + carReferance.maxSpeed);
        System.out.println("Fuel lever: " + carReferance.fuelLevel);
        System.out.println("Mileage: " + carReferance.mileage);
        System.out.println("Total traveled distance: " + carReferance.totalTraveledDistance);
        System.out.println("Damaged: " + carReferance.damaged);
        System.out.println("Door count: " + carReferance.doorCount);
        System.out.println("Color: " + carReferance.color);

        
        Car car2 = new Car();
        car2.name = "Mercedes";
        car2.fuelLevel = 50;
        car2.totalTraveledDistance = 100;

        car2.engine = new Engine();
        car2.engine.capacity = 2000;

        System.out.println("Name of car " + car2.name);
        System.out.println("Max speed: " + car2.maxSpeed);
        System.out.println("Fuel lever: " + car2.fuelLevel);
        System.out.println("Mileage: " + car2.mileage);
        System.out.println("Total traveled distance: " + car2.totalTraveledDistance);
        System.out.println("Damaged: " + car2.damaged);
        System.out.println("Door count: " + car2.doorCount);
        System.out.println("Color: " + car2.color);
        System.out.println("Car2 engine capacity " + carReferance.engine.capacity);


        System.out.println("Initial name for car1: " + carReferance.name);

        carReferance.name = "Audi";
        System.out.println("Change name for car1: " + carReferance.name);

        carReferance = new Car();
        System.out.println("Name of a new car: " + carReferance.name);
        carReferance.name = "BMW";

        carReferance = car2;
        System.out.println("Name of car referanced from 2 variables CarReferance " + carReferance.name);
        System.out.println("Name of car referanced from 2 variables Car2 " + car2.name);

        car2.name = "Dacia";
        System.out.println("Updated name of car referanced from 2 variables CarReferance " + carReferance.name);
        System.out.println("Updated name of car referanced from 2 variables Car2 " + car2.name);

        car2=null;
        System.out.println(carReferance.name);


    }
}