package Sprint2.ScannersMM.Gymet;

import java.sql.*;

public class Person {
    public Person() {
    }

    String personNr;
    String firstName;
    String lastName;
    String avgifttBetald;
    Date membershipDate;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public static Date converter(String input) {
        int year = Integer.parseInt(input.substring(0, 4));
        int month = Integer.parseInt(input.substring(5, 7));
        int day = Integer.parseInt(input.substring(8, 10));
        Date d = new Date(year - 1900, month - 1, day);
        return d;
    }
}
