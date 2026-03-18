package DesignPatterns.PrototypeAndRegistry;

public class PlantCharacter extends Character{
    public PlantCharacter(String id, String name, int power, String icon) {
        super(id, name, power, icon);
    }

    public PlantCharacter(PlantCharacter other) {
        super(other);
    }
}
