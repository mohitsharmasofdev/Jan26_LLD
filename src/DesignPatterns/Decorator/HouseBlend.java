package DesignPatterns.Decorator;

public class HouseBlend implements Beverage{
    @Override
    public void getDesc() {
        System.out.println("Produced HouseBlend");
    }

    @Override
    public int getCost() {
        return 30;
    }
}
