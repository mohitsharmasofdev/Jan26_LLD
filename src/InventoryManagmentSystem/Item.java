package InventoryManagmentSystem;

public class Item implements Comparable<Item>{
    private String id;
    private String name;
    private double price;
    private int quantity;

    public Item() {
    }

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // item.compareTo(item2)
    @Override
    public int compareTo(Item other) {
        // we need to compare two item objects
        // obj1 : this (calling compareTo function)
        // obj2 : other (passed in the arguments)

        // which object should comes first
        // obj1 to come fist => -ve
        // obj2 to come first => +ve


        // Natural order : ascending order of price
        // this object will come first
        if(this.getPrice() < other.getPrice()){
            return -1;
        } else if (this.getPrice() > other.getPrice()){
            return 1;
        }

        return 0;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
