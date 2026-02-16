package ProducerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Store {
//    private List<Object> items;
    // Use a concurrent data structure : Thread safe
    private ConcurrentLinkedQueue<Object> items;
    private int MAX_SIZE;

    public Store(int max_size){
        items = new ConcurrentLinkedQueue<>();
        MAX_SIZE = max_size;
    }

    public void addItem(Object item){
        items.add(item);

        // get the current_index
        // items[current_index] = item
        // we actually one produced one item
    }

    public void removeItem(){
        // size = 2 , 2  consumers entered
        items.remove();

        // items[1] , items[1]
        // actual consumption 1
    }

    public int getMAX_SIZE(){
        return MAX_SIZE;
    }

    public int getSize(){
        return items.size();
    }
}
