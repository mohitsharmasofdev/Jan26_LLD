package GenericsAndCollections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Pair<Integer, String> p = new Pair<>();
        p.addFirst(5);
        p.addSecond("Mohit");

        Pair<String , String> s = new Pair<>();
        Pair<Double , Double> d = new Pair<>();

        // Everything was of Object type
        Pair p1 = new Pair();

        List<Pair<Integer , String>> l = new ArrayList<>();
//        l.add(s);
        l.add(p);

//        Collection
//        List : ordered collection , index , duplicate
//        Queue : holding elements prior to processing
//        Set
    }
}
