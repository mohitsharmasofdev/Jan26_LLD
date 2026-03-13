package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        SoldItemBuilder soldItemBuilder1 = new SoldItemBuilder();
        soldItemBuilder1.setId(1);
        soldItemBuilder1.setDiscount(5);

        SoldItem soldItem = new SoldItem(soldItemBuilder1);


//        SoldItemHelper soldItemHelper = new SoldItemHelper();
        SoldItemBuilder soldItemBuilder =
                SoldItem
                .getBuilder()
                .setId(1)
                .setItem("Book")
                .setDiscount(5.0)
                .setQuantity(5)
                .setPrice(50);

        SoldItem soldItem1 = soldItemBuilder.build();


        SoldItem soldItem2 =
                    SoldItem
                        .getBuilder() // ->SoldItemBuilder
                        .setId(1)
                        .setItem("Book")
                        .setDiscount(5.0)
                        .setQuantity(5)
                        .setPrice(50) // ready
                        .build(); // soldItemBuilder.build


//        SoldItem soldItem = new SoldItem(soldItemHelper);
    }
}
