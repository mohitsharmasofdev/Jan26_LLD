package Interfaces;

public class ArrayStack implements Stack{
    int[] arr;
    int index = 0;
    public ArrayStack(int size){
        arr = new int[size];
        index = 0;
    }
    @Override
    public void push(int x) {
        arr[index] = x;
        index ++;
    }

    @Override
    public void pop() {
        index --;
    }

    @Override
    public int top() {
        return arr[index];
    }
}
