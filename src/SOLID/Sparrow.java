package SOLID;

public class Sparrow extends Bird implements Flyable{
    @Override
    public void makeSound() {
        System.out.println("Sparrow is producing sound");
    }

    @Override
    public void fly() {
        System.out.println("Flying Low!!");
    }
}
