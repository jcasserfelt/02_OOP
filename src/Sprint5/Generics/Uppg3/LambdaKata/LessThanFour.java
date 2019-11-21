package Sprint5.Generics.Uppg3.LambdaKata;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;


public class LessThanFour {

    public static List<String> transform(List<String> l) {
        return l.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> liste = asList("My", "name", "is", "John", "Doe");
        List<String> liste2 = LessThanFour.transform(liste);
        System.out.println(liste);
        System.out.println(liste2);
    }
}
