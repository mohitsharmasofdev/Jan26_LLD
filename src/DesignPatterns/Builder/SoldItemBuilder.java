package DesignPatterns.Builder;

public class SoldItemBuilder {
    private int id;
    private String item;
    private double price;
    private int quantity;
    private boolean isExpress;
    private double discount;

    public SoldItem build(){
//        SoldItem soldItem = new SoldItem(soldItemHelper);
        return new SoldItem(this);
    }
    public SoldItemBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public double getDiscount() {
        return discount;
    }

    public SoldItemBuilder setItem(String item) {
        this.item = item;
        return this;
    }

    public SoldItemBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public SoldItemBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public SoldItemBuilder setExpress(boolean express) {
        isExpress = express;
        return this;
    }

    public SoldItemBuilder setDiscount(double discount) {
        this.discount = discount;
        return this;
    }
}
