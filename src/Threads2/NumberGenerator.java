package Threads2;

import java.util.concurrent.Callable;

// takes a number a returns the square
public class NumberGenerator implements Callable<Integer> {
    private int number;

    public NumberGenerator(int x) {
        number = x;
    }

    @Override
    public Integer call() throws Exception {
        return returnSquare();
    }

    int returnSquare(){
        System.out.println("Thread :" + Thread.currentThread().getName());
        return number * number;
    }
}

