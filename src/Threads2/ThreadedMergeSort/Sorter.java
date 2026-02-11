package Threads2.ThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> toSort;
    private ExecutorService executorService;
//    private Exe

    public Sorter(List<Integer> input, ExecutorService executorService){
        toSort = input;
        this.executorService = executorService;
    }
    @Override
    public List<Integer> call() throws Exception {
        return sort();
    }

    List<Integer> sort() throws ExecutionException, InterruptedException {
        System.out.println("Sort this data : " + toSort + " in Thread : " + Thread.currentThread().getName()) ;
        if(toSort.size() <= 1){
            return  toSort;
        }
        int mid = toSort.size() / 2;

        List<Integer> leftArray = toSort.subList(0 , mid);
        List<Integer> rightArray = toSort.subList(mid , toSort.size());

        Sorter leftArraySorter = new Sorter(leftArray, executorService);
        Sorter rightArraySorter = new Sorter(rightArray, executorService);

        // TODO : pass these tasks to two threads
        Future<List<Integer>> leftArrayFuture = executorService.submit(leftArraySorter);
        Future<List<Integer>> rightArrayFuture = executorService.submit(rightArraySorter);

        List<Integer> leftSortedArray =  leftArrayFuture.get();
        List<Integer> rightSortedArray =  rightArrayFuture.get();

        // merge these two together

        int i =0, j = 0;
        List<Integer> sortedArray = new ArrayList<>();
        while(i < leftSortedArray.size() && j < rightSortedArray.size()){
            if(leftSortedArray.get(i) <= rightSortedArray.get(j)){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            } else {
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
        }

        while(i < leftSortedArray.size()){
            sortedArray.add(leftSortedArray.get(i));
            i++;
        }

        while(j < rightSortedArray.size()){
            sortedArray.add(rightSortedArray.get(j));
            j++;
        }

        return sortedArray;
    }
}
