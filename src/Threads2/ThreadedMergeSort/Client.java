package Threads2.ThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> array = List.of(8 , 1 , 2, 9 , 6 , 3 , 7 ,5);

        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(array, executorService);
        System.out.println(executorService.submit(sorter).get());
    }
}
