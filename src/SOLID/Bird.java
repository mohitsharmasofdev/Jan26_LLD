package SOLID;

public abstract class Bird {
    private String name;

    public void eat(){
        System.out.println("Bird is eating");
    }

    public abstract void makeSound();

}
