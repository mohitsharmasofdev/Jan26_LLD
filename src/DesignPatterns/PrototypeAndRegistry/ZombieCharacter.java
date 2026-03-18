package DesignPatterns.PrototypeAndRegistry;

public class ZombieCharacter extends Character{
    public ZombieCharacter(String id, String name, int power, String icon) {
        super(id, name, power, icon);
    }

    public ZombieCharacter(ZombieCharacter other) {
        super(other);
    }
}
