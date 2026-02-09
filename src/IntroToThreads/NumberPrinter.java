package IntroToThreads;

import java.util.TreeMap;

public class NumberPrinter implements Runnable{
    @Override
    public void run() {
        print();
    }

    public void print(){
        for(int i = 1; i<= 100; i++){
            System.out.println("Number : " + i + " from Thread : " + Thread.currentThread().getName());
        }
    }
}
