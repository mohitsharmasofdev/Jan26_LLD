package InventoryManagmentSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

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
    }
}

// Default sorting of items
// Collection

// Collections

// Is it possible to define natural sorting order for custom classes ?
// Yes : Comparable
