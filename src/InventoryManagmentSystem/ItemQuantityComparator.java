package InventoryManagmentSystem;

import java.util.Comparator;
// Desc order of Quantity
public class ItemQuantityComparator implements Comparator<Item> {
    // Unlike comparable , both objects are passed in argument
    @Override
    public int compare(Item o1, Item o2) {
        // o1 to come before o2 in the final order -> -ve
        // o2 to come before o1 in the final order -> +ve
        if(o1.getQuantity() > o2.getQuantity()){
            return -1;
        } else if(o1.getQuantity() < o2.getQuantity()){
            return 1;
        }
        return 0;
    }
}
