package InventoryManagmentSystem;

import java.util.HashMap;

public class Inventory<T extends Item> {
    // we should be easily lookup for items with id
    private HashMap<String, T> items;

    public Inventory(){
        items = new HashMap<>();
    }

    public void add(T item){
        items.put(item.getId() , item);
    }

    public void remove(T item){
        items.remove(item.getId());
    }
}


// ElectronicINventoryt
// BooksInventory

// Java provides Generics Bound