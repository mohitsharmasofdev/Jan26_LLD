package ProducerConsumer;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store){
        this.store = store;
    }

    @Override
    public void run() {
        produce();
    }

    private void produce(){
        while(true) {
            if(store.getSize() < store.getMAX_SIZE()){
                store.addItem(new Object());
                System.out.println("Produced item , curr size of the store :" + store.getSize());

            }
        }
    }
}
