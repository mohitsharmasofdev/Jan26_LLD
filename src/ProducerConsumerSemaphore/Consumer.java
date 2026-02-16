package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    private Semaphore producerSemaphore , consumerSemaphore;

    public Consumer(Store store,
                    Semaphore producerSemaphore,
                    Semaphore consumerSemaphore){
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        try {
            consume();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void consume() throws InterruptedException {
        while(true){
//            if(store.getSize() > 0){
            consumerSemaphore.acquire();
                store.removeItem();
                System.out.println("Consumed item , curr size of the store :" + store.getSize());

            producerSemaphore.release();
        }
    }
}
