package Interfaces;

public class Dog extends Mammal implements Runner{
    @Override
    public void run() {
        System.out.println("Dog is running!");
    }
}
