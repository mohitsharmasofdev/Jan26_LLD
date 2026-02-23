package StreamsAndLambdas;

import java.util.function.Predicate;

public class EvenOddPredicate implements Predicate<Integer> {
    // filter out odd
    @Override
    public boolean test(Integer integer) {
        if(integer % 2 == 0){
            return true;
        }
        return false;
    }
}
