package Sprint5.Generics.Uppg3.LambdaKataFacit;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;


public class KidsNames {

    public static List<String> getKidNames(List<Person> people) {

        Predicate<Person> p = person -> person.getAge() < 5;
        Predicate<Person> p2 = person -> person.getAge() == 20;

        people.stream().filter(p).map(Person::getName).collect(toList());

        return people.stream().filter(person -> person.getAge() < 18).map(Person::getName).collect(toList());
    }

}

