package ProducerConsumer;

public class Consumer implements Runnable{
    private Store store;

    public Consumer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        consume();
    }

    private void consume(){
        while(true){
            if(store.getSize() > 0){
                store.removeItem();
                System.out.println("Consumed item , curr size of the store :" + store.getSize());

            }
        }
    }
}
