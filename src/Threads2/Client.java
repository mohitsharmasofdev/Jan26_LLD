package Threads2;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Runnable task = new HelloWorldPrinter();
        Thread t1 = new Thread(task);
        t1.start();
        Runnable task2 = new NumberPrinter();
        Thread t2 = new Thread(task2);
//        t2.start();

//        for(int i = 1; i<=100; i++){
//            Runnable task3 = new NumberPrinterV1(i);
//            Thread t3 = new Thread(task3);
//            t3.start();
//        }

        // To create a Thread Pool
//        ExecutorService executorService =  Executors.newFixedThreadPool(10);
        ExecutorService executorService =  Executors.newCachedThreadPool();
//        for(int i = 1; i<= 100; i++){
//            Runnable task4 = new NumberPrinterV1(i);
//            executorService.execute(task4);
//        }

        NumberGenerator numberGenerator = new NumberGenerator(6);
        Future<Integer> ansFuture = executorService.submit(numberGenerator);
        System.out.println("Doing SOmetrhing");
        System.out.println("Doing somethign else ");
        Thread.sleep(20);
        System.out.println("Doing something something");
        Integer ans = ansFuture.get();
        System.out.println(ans);
        //
    }
}


// Object object
//Thread(HelloWorldPrinter helloWorldPrinter)


// Thread: Main
// Class.main

// we want to print but not in main thread