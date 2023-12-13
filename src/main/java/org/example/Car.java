package org.example;

public class Car extends Vehicle{

        @Override
        public void start() {
            System.out.println("Траспортное средство Mercedes начал движение");
        }

        @Override
        public void stop() {
            System.out.println("Транспортное средтсво Mercedes закончило движение");
        }

    @Override
    public void uniqPossible() {
        System.out.println("Автомобиль Mercedes-Benz");
        System.out.println("Кол-во дверей: 4");
        System.out.println("Двигатель обьемом: 5.5");
    }

    @Override
    public void setSpeed(int speed) {
            System.out.println("Автомобиль задал скорость: " + speed);
    }
}
