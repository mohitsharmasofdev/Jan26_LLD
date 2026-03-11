package SOLID;

public class Eagle extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Flying high!!");
        // some more lines for the algo
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is producing sound");
    }
}
