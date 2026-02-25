package InventoryManagmentSystem;

import javax.swing.text.html.Option;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        Item item = new Item("1" , "Pen", 10.0, 5);
        Item item2 = new Item("2" , "Calendar", 15.0, 3);

        Electronics electronics = new Electronics("3", "Ipad", 100 , 2, 3);
        Book book = new Book("4" , "Clean Code", 30, 3, "ABC");
        Clothing clothing = new Clothing("5" , "Socks", 2.0, 3, "S");

        List<Item> items = new ArrayList<>();
        items.add(item);
        items.add(item2);
        items.add(electronics);
        items.add(book);
        items.add(clothing);
//        items.add(1);

        Collections.sort(items , new ItemQuantityComparator());

        // Comparable : Define Natural Sorting order
        // Comparator : Explicit comparison logic

        for(Item i : items){
            System.out.println(i.getName() + " " + i.getPrice() + " " + i.getQuantity());
        }

        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(1);
        l.add(4);
        l.add(2);
        // natural sorting order
        Collections.sort(l);

        Inventory electronicsInventory = new Inventory();
        electronicsInventory.add(book);

//        Inventory<Integer> i = new Inventory<>();
        Inventory<Electronics> electronicsInventory1 = new Inventory<>();
//        electronicsInventory1.add(book);
        electronicsInventory1.add(electronics);
        Inventory<Item> itemInventory = new Inventory<>();
        itemInventory.add(book);
        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.add(book);




        Order order1 = new Order(1 , true, 100);
        Order order2 = new Order(2 , true, 20);
        Order order3 = new Order(3 , false, 150);
        Order order4 = new Order(4 , true, 180);
        Order order5 = new Order(5 , false, 10);
        Order order6 = new Order(6 , true, 900);
        // 1 2 4 6 3 5
//        OrderProcessor orderProcessor = new OrderProcessor();
        PriorityQueue<Order> pq = new PriorityQueue<>(new OrderAmountComparator());
        OrderProcessor orderProcessor = new OrderProcessor(pq);
        orderProcessor.addOrder(order1);
        orderProcessor.addOrder(order2);
        orderProcessor.addOrder(order3);
        orderProcessor.addOrder(order4);
        orderProcessor.addOrder(order5);
        orderProcessor.addOrder(order6);

        orderProcessor.processAllOrders();
//
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }



        // List<Item> : Print id of each item using Streams
                items
                .stream()
                .map((x) -> {
                    return x.getName();
                })
                .forEach((x) -> {
                    System.out.println(x);
                });

//        Generate a list of the lengths of item names

        List<Integer> nameLengths =         items
                .stream()
                .map((x) -> {
                    return x.getName().length();
                })
                .toList();

//        System.out.println(itemIds);

//        Perform the following in a single stream pipeline:
//
//        Filter items with price > 1000 and quantity > 0.
//        Extract item names.
//        Remove duplicates.
//        Sort names alphabetically.
//        Limit to top 5 results.
//        Collect into a list and print.


        List<String> names =
                items
                .stream()
                .filter(itemInput -> itemInput.getPrice() > 1000 && itemInput.getQuantity() > 0)
                .map(itemInput -> itemInput.getName())
                .distinct()
                .sorted()
                .limit(5)
                .toList();

        // Reduce : aggregates the data in a single result

        // Sum of the prices

        int total = 0;
        for(Item item1 : items){
            total += item1.getPrice();
        }

        items
                .stream()
                .map(itemInput -> itemInput.getPrice())// <10 , 20 , 30 , 5 , 60>
                .reduce(0.0 , (totalSum , price) -> { // totalSum = totalSUm + price
                    return totalSum + price;
                });


//        int totalSum = 0.0;
//        totalSum = fun1(totalSum , 10) {
//            return totalSum + 10;
//        }

        // Most expensive item : Price

            items
                .stream()
                .map(itemInput -> itemInput.getPrice())
                .reduce(Double.MIN_VALUE , (max_price, price) -> {
                    return max_price > price ? max_price : price;
                });

            // I want to concatenate all the names together , comma seprated

            Optional<String> cnames =  items
                    .stream()
                    .map(itemInput -> itemInput.getName())
                    .reduce((ans , input) -> {
                        System.out.println(ans);
                        return ans + "," + input;
                    });
        if(cnames.isPresent()){
            System.out.println(cnames.get());
        }
    }
}

// Default sorting of items
// Collection

// Collections

// Is it possible to define natural sorting order for custom classes ?
// Yes : Comparable
