package Sprint5.Generics.Uppg3.LambdaKata;

import java.util.List;
import java.util.stream.Collectors;


public class KidsNames {

    public static List<String> getKidNames(List<Person> people) {
        return people.stream().
                filter(person -> person.getAge() < 18).map(Person::getName).
                collect(Collectors.toList());
    }

}

