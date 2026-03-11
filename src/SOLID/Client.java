package SOLID;

public class Client {
    public static void main(String[] args) {
        FlyingBehaviour lowFlying = new LowFlying();
        FlyingBehaviour highFlying = new HighFlying();

        Sparrow sparrow = new Sparrow(lowFlying);
        Eagle eagle = new Eagle(highFlying);

        Eagle eagle2 = new Eagle(lowFlying);

        sparrow.fly();
        eagle.fly();
        eagle2.fly();
    }
}
