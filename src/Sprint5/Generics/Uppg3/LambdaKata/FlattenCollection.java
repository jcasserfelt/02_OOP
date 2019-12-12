package Sprint5.Generics.Uppg3.LambdaKata;

import java.util.List;
import java.util.stream.Collectors;


public class FlattenCollection {

    public static List<String> transform(List<List<String>> l) {
        return l.stream().flatMap(strings -> strings.stream()).collect(Collectors.toList());
    }

    //valfri att implementera
    static List<String> goingDeeper(List<List<List<String>>> collection) {
        return collection.stream().
                flatMap(lists -> lists.stream()).flatMap(strings -> strings.stream()).
                collect(Collectors.toList());
    }
}
