package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        SoldItemHelper soldItemHelper = new SoldItemHelper();
        soldItemHelper.setId(1);
        soldItemHelper.setItem("Book");
        soldItemHelper.setDiscount(5.0);
        soldItemHelper.setQuantity(5);
        soldItemHelper.setPrice(50);

        SoldItem soldItem = new SoldItem(soldItemHelper);
    }
}
