package Interfaces;

public class Car extends Vehicle implements Runner{
    @Override
    public void run() {
        System.out.println("ZOOOOOOOOOOM!");
    }
}
