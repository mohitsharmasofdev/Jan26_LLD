package InventoryManagmentSystem;

import java.util.LinkedList;
import java.util.List;

public class RecentlyViewedItems {
    private LinkedList<Item> items;
    private Integer MAX_SIZE = 3;

    public RecentlyViewedItems(){
        items = new LinkedList<>();
    }
    public RecentlyViewedItems(int size){
        items = new LinkedList<>();
        this.MAX_SIZE = size;
    }

    public void addRecentlyViewedItem(Item item){
        // If this element is already present, we should remove it
        items.remove(item);

        items.addFirst(item);
        if(items.size() > MAX_SIZE){
            items.removeLast();
        }

    }

    public List<Item> getRecentlyViewedItems(){
        return items;
    }

}
