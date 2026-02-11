package Threads2;

public class HelloWorldPrinter implements Runnable{
    // Thread class accepts a Runnable type of object
    // It will contain run()
    // Thread will call this run()
    @Override
    public void run() {
        // whatever you do inside this will be executed
        print();
    }

    public void print(){
        System.out.println("Hello World from " + Thread.currentThread().getName());
    }
}


// Runnable : run()