package DesignPatterns.PrototypeAndRegistry;

public class Character implements Prototype<Character>{
    private String id;
    private String name;
    private int power;
    private String icon;

    public Character(String id, String name, int power, String icon) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.icon = icon;
    }

    public Character(Character other){
        this.id = other.id;
        this.name = other.name;
        this.power = other.power;
        this.icon = other.icon;
    }

    @Override
    public Character copy() {
        System.out.println("Character copy is called");
        return new Character(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
