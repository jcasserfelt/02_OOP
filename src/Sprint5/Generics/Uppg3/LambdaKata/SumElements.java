package Sprint5.Generics.Uppg3.LambdaKata;

import java.util.List;


public class SumElements {

    public static int calculate(List<Integer> numbers) {

        return numbers.stream().mapToInt(value -> value).sum();
    }
}
