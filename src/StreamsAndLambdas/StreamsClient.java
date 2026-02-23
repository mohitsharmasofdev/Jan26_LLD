package StreamsAndLambdas;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsClient {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 7, 3, 4, 6, 6, 10, 1, 9, 8, 9, 12);

        // Collection : List

        Stream<Integer> stream =  list.stream();

        // filter : helps you to filter the data on the basis of some condition
        List<Integer> updatedList =
                stream
//                .filter(new EvenOddPredicate())
                .filter((x) -> {
                    System.out.println("filtering : " + x);
                    return x % 2 == 0;
                })
                        .map((x) -> {
                            System.out.println("mapping : " + x);
                            return x * x;
                        })
                        .distinct()
                        .sorted((a , b) -> { return b - a;})
//                .collect(Collectors.toList());
                .toList();

//        stream has already been operated upon or closed
        Set<Integer> set =
                        list
                        .stream()
                        .filter((x) -> {
                            return x % 2 == 0;
                        })
                        .collect(Collectors.toSet());

        System.out.println(updatedList);
        System.out.println(set);

        List<Integer> updatedList1 =
                        list.stream()
                        .filter((x) -> x % 2 == 0)
                        .map(x -> x * x)
                        .distinct()
                        .sorted((a , b) ->  b - a)
                        .toList();


        Optional<Integer> data =
                list.stream()
//                .filter(new EvenOddPredicate())
                        .filter((x) -> {
                            System.out.println("filtering : " + x);
                            return x % 2 == 0;
                        })
                        .map((x) -> {
                            System.out.println("mapping : " + x);
                            return x * x;
                        })
                        .distinct()
//                        .sorted((a , b) -> { return b - a;})
//                .collect(Collectors.toList());
                        .findFirst();

    }
}
// int & Integer : Open question!