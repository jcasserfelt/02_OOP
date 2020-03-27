package Lambda;

import Sprint5.Generics.Uppg3.LambdaKata.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.*;

public class LamdaFun {


    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Stina", 28),
                new Person("Anna", 20, "Swedish"),
                new Person("Banna", 30, "Danish"),
                new Person("Canna", 40, "Swedish"),
                new Person("Canne", 50, "Danish"));

        // sortera alfabetisk
        Collections.sort(people, (p1, p2) -> {
            return p1.getName().compareTo(p2.getName());
        });
        selectPeople(
                people,
                (Person p) -> {
                    return p.getAge() == 30;
                },
                (Person p) -> {
                    return p.getNationality();
                }
        );
        people.stream().
                filter(person -> person.getAge() <= 30).
                map(person -> person.getName()).
                forEach(s -> System.out.println(s));

    }

    public static void selectPeople(
            List<Person> people,
            Predicate<Person> tester,
            Function<Person, String> function) {
        for (Person p : people) {
            if (tester.test(p)) {
                System.out.println(function.apply(p));
            }
            ;
        }
    }
}