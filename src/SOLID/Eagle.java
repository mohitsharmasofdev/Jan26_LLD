package SOLID;

public class Eagle extends Bird implements Flyable{
    private FlyingBehaviour flyingBehaviour;

    public Eagle(FlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }
    @Override
    public void fly() {
        flyingBehaviour.executeFlying();
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle is producing sound");
    }
}
