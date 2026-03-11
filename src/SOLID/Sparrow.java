package SOLID;

public class Sparrow extends Bird implements Flyable{
    private FlyingBehaviour flyingBehaviour;

    public Sparrow(FlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }
    @Override
    public void makeSound() {
        System.out.println("Sparrow is producing sound");
    }

    @Override
    public void fly() {
        flyingBehaviour.executeFlying();
    }
}
