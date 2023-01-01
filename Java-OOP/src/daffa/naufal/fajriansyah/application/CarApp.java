package daffa.naufal.fajriansyah.application;

import daffa.naufal.fajriansyah.data.Avanza;
import daffa.naufal.fajriansyah.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
