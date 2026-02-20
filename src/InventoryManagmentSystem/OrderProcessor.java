package InventoryManagmentSystem;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
    private Queue<Order> ordersToBeProcessed;

    public OrderProcessor(){
        ordersToBeProcessed = new PriorityQueue<>();
    }

    public OrderProcessor(PriorityQueue<Order> pq){
        ordersToBeProcessed = pq;
    }

    public void addOrder(Order order){
        ordersToBeProcessed.add(order);
    }

    public void processOrder(){
        Order order = ordersToBeProcessed.poll();
        System.out.println("Processing Order : " + order.getId());
    }

    public void processAllOrders(){
        while(!ordersToBeProcessed.isEmpty()){
            processOrder();
        }
    }
}
