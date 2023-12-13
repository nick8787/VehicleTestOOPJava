package org.example;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.uniqPossible();
        car.start();
        car.setSpeed(180);
        car.stop();

        Motorcycle kawasaki = new Motorcycle();
        kawasaki.uniqPossible();
        kawasaki.start();
        kawasaki.setSpeed(250);
        kawasaki.stop();

        Bycicle comacnhe = new Bycicle();
        comacnhe.uniqPossible();
        comacnhe.start();
        comacnhe.setSpeed(30);
        comacnhe.stop();
    }
}