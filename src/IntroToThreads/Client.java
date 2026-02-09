package IntroToThreads;

public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Runnable task = new HelloWorldPrinter();
        Thread t1 = new Thread(task);
        t1.start();
        Runnable task2 = new NumberPrinter();
        Thread t2 = new Thread(task2);
//        t2.start();

        for(int i = 1; i<=100; i++){
            Runnable task3 = new NumberPrinterV1(i);
            Thread t3 = new Thread(task3);
            t3.start();
        }


    }
}


// Object object
//Thread(HelloWorldPrinter helloWorldPrinter)


// Thread: Main
// Class.main

// we want to print but not in main thread