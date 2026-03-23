package DesignPatterns.PrototypeAndRegistry;

public class HumanCharacter extends Character{
    private int age;
    public HumanCharacter(String id, String name, int power, String icon) {
        super(id, name, power, icon);
    }

    public HumanCharacter(HumanCharacter other) {
        super(other);
//        this.id = other.id;
        this.age = other.age;
        // copy anything else as well
    }

    @Override
    public HumanCharacter copy() {
        System.out.println("Human character copy is called");
        HumanCharacter humanCharacter = new HumanCharacter(this);
        return  humanCharacter;
    }
}
