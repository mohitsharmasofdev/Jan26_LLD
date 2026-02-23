package StreamsAndLambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaClient {
    public static void main(String[] args) {
        Runnable helloWorldPrinterTask = new HelloWorldPrinter();
        Thread t = new Thread(helloWorldPrinterTask);
        t.start();

        // Instead of creating a new class
        // You can define the run function directly
        // Runnable has only a single method
        // Lambda Expression : You can ONLY write this for functional interfaces
        Runnable newTask = () -> {
            // definition of the method
            System.out.println("hello world!");
        };

        Thread t1 = new Thread(newTask);


        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(1);
        l.add(6);
        l.add(5);
        l.add(4);

        // sort this : Even elements first and then odd elements
        // Write a comparator

        Comparator<Integer> comparator = (first , second) -> {
            if(first % 2 == 0 && second % 2 != 0){
                return -1;
            } else if (second % 2 ==0 && first % 2 !=0){
                return 1;
            }
            return 0;
        };
        Collections.sort(l, comparator);

        Collections.sort(l , (first , second) -> {
            if(first % 2 == 0 && second % 2 != 0){
                return -1;
            } else if (second % 2 ==0 && first % 2 !=0){
                return 1;
            }
            return 0;
        });
        System.out.println(l);
    }
}

//class Temp implements Runnable {
//    @Override
//    public void run() {
//        System.out.println("hello world!");
//    }
//}
//
//new Temp();
// We want to print "Hello World!" in a diff thread