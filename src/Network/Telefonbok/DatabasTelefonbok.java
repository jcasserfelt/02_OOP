package Network.Telefonbok;

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

    public String getPersonData(String s) {
        for (Person p : allPerson) {
            if (p.getNamn().equalsIgnoreCase(s)) {
                return p.toString();
            }
        }
        return null;
    }
}
