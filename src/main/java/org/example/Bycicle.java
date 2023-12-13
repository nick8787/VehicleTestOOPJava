package org.example;

public class Bycicle extends Vehicle{

    @Override
    public void start() {
        System.out.println("Велосипед начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Велосипед завершил движение");
    }

    @Override
    public void uniqPossible() {
        System.out.println("\nВелосипед Comanche");
        System.out.println("Кол-во педалей: 2");
        System.out.println("Отличительная черта: цепь для переключения передач");
    }

    @Override
    public void setSpeed(int speed) {
        System.out.println("Велосипед задал скорость: " + speed);
    }
}
