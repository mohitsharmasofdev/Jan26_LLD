package DesignPatterns.Decorator;

import DesignPatterns.Decorator.Addons.AddonHelper;
import DesignPatterns.Decorator.Addons.ChocoChip;
import DesignPatterns.Decorator.Addons.Milk;
import DesignPatterns.Decorator.Addons.Whip;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Beverage b1 = new HouseBlend();
        Beverage b2 = new Decaf();


        b1.getDesc();
        System.out.println("Cost of the beverage :" + b1.getCost());

        b2.getDesc();
        System.out.println("Cost of the beverage :" + b2.getCost());

        System.out.println("********* After adding Addons *******");

        // HouseBlend with Milk and chocohip
        b1 = new Milk(b1);
        b1 = new ChocoChip(b1);
        b1.getDesc();
        System.out.println("Cost of the beverage :" + b1.getCost());

        // Double Whip decaf
        b2 = new Whip(new Whip(b2));
        b2.getDesc();
        System.out.println("Cost of the beverage :" + b2.getCost());

        Beverage b3 = new Decaf();
        System.out.println("Do you want to add something on top of your coffee ? [Y/N]");
        String input = scanner.next();
        while(input.equals("Y")){
            System.out.println("Please select the addon : ");
            System.out.println("1. Milk");
            System.out.println("2. Whip");
            System.out.println("3. ChocoChip");

            input = scanner.next();
            b3 =  AddonHelper.ingestAddon(b3 , input);
            System.out.println("Do you want to add something more on top of your coffee ? [Y/N]");
            input = scanner.next();
        }
        b3.getDesc();
        System.out.println("Cost of the beverage :" + b3.getCost());

    }
}
