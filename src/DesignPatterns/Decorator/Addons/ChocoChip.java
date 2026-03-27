package DesignPatterns.Decorator.Addons;

import DesignPatterns.Decorator.Beverage;

public class ChocoChip implements Addon{
    private Beverage beverage;

    public ChocoChip(Beverage beverage){
        if(beverage == null){
            throw new RuntimeException("Please first select the base Beverage!");
        }
        this.beverage = beverage;
    }
    @Override
    public void getDesc() {
        beverage.getDesc();
        System.out.println("Added ChocoChip");
    }

    @Override
    public int getCost() {
        return 8 + beverage.getCost();
    }
}
