package DesignPatterns.Builder;

public class SoldItemHelper {
    private int id;
    private String item;
    private double price;
    private int quantity;
    private boolean isExpress;
    private double discount;

    public void setId(int id) {
        this.id = id;
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

    public void setItem(String item) {
        this.item = item;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
