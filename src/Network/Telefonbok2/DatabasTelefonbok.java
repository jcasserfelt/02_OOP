package Network.Telefonbok2;

import java.util.ArrayList;
import java.util.List;

public class DatabasTelefonbok {

    Person p1 = new Person("molgan", "0701234567", "molgan@gmail.com");
    Person p2 = new Person("maggan", "0707654321", "maggan@gmail.com");

    private final List<Person> allPerson = new ArrayList<>();

    public DatabasTelefonbok() {
        allPerson.add(p1);
        allPerson.add(p2);
    }

    public Person getPersonDataByName(String input) {
        for (Person p : allPerson) {
            if (p.getNamn().equalsIgnoreCase(input)) {
                return p;
            }
        }
        return null;
    }


}
