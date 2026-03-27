package DesignPatterns.Decorator.Addons;

import DesignPatterns.Decorator.Beverage;

public class Whip implements Addon{
    private Beverage beverage;

    public Whip(Beverage beverage){
        if(beverage == null){
            throw new RuntimeException("Please first select the base Beverage!");
        }
        this.beverage = beverage;
    }
    @Override
    public int getCost() {
        return 3 + beverage.getCost();
    }

    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.println("Added Whip");
    }
}
