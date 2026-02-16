package ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Object> items;
    private int MAX_SIZE;

    public Store(int max_size){
        items = new ArrayList<>(max_size);
        MAX_SIZE = max_size;
    }

    public void addItem(Object item){
        items.add(item);
    }

    public void removeItem(){
        items.remove(items.size() - 1);
    }

    public int getMAX_SIZE(){
        return MAX_SIZE;
    }

    public int getSize(){
        return items.size();
    }
}
