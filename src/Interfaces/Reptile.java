package Interfaces;

public class Reptile extends Animal implements Runner{
    @Override
    public void run() {
        System.out.println("Reptile is Running");
    }
}
