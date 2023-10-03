package com.wild;

public class Hangar {
    public static void main(String[] args) {
        Car car = new Car("Tesla", 1500);
        Boat boat = new Boat("Zodiac", 500);

        System.out.println(car.doStuff());
        System.out.println(boat.doStuff());
    }
}
