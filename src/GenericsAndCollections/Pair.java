package GenericsAndCollections;

public class Pair <T , K>{
    private T first;
    private K second;

    public void addFirst(T input){
        first = input;
    }

    public void  addSecond(K input){
        second = input;
    }

    public T getFirst(){
        return first;
    }

    public K getSecond(){
        return second;
    }
}
