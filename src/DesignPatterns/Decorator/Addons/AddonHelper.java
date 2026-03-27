package DesignPatterns.Decorator.Addons;

import DesignPatterns.Decorator.Beverage;

public class AddonHelper {
    public static Beverage ingestAddon(Beverage beverage , String addon){
        if(addon.equals("Milk")){
            beverage = new Milk(beverage);
        } else if (addon.equals("ChocoChip")){
            beverage = new ChocoChip(beverage);
        } else if(addon.equals("Whip")){
            beverage = new Whip(beverage);
        }
        return beverage;
    }
}
