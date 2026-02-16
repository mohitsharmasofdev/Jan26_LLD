package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSemaphore ,consumerSemaphore;

    public Producer(
            Store store,
            Semaphore producerSemaphore,
            Semaphore consumerSemaphore
                    ){
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        try {
            produce();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void produce() throws InterruptedException {
        while(true) {
//            if(store.getSize() < store.getMAX_SIZE()){
            producerSemaphore.acquire();
                store.addItem(new Object());
                System.out.println("Produced item , curr size of the store :" + store.getSize());
            consumerSemaphore.release();
        }
    }
}
