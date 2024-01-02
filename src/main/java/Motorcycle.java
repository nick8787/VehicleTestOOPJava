public class Motorcycle extends Vehicle{

@Override
 public void start() {
   System.out.println("Мотоцикл начал движение");
}

@Override
    public void stop() {
        System.out.println("Мотоцикл завершил движение");
}

@Override
    public void uniqPossible() {
        System.out.println("\nМотоцикл Kawasaki");
        System.out.println("Кол-во колес: 2");
        System.out.println("Двигатель обьемом: 3.6");
}

@Override
    public void setSpeed(int speed) {
        System.out.println("Мотоцикл задал скорость: " + speed);
    }
}
