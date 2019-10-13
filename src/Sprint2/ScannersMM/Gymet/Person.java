package Sprint2.ScannersMM.Gymet;

import java.sql.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;

public class Person {
    public Person() {
    }

    String personNr;
    String firstName;
    String lastName;
    String avgifttBetald;
    LocalDate membershipDate;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static LocalDate converter(String input) {
        int year = Integer.parseInt(input.substring(0, 4));
        int month = Integer.parseInt(input.substring(5, 7));
        int day = Integer.parseInt(input.substring(8, 10));
        LocalDate d = LocalDate.of(year, month, day);
        return d;
    }

    public boolean validMembership() {
        long paidDateEpoch = this.membershipDate.toEpochDay();
        long todayEpoch = LocalDate.now().toEpochDay();
        //System.out.println(paidDateEpoch);
        return (todayEpoch - paidDateEpoch) <= 365;
    }

    public boolean existingCustomerr(String input) {
        if ((input.equals(this.firstName + " " + this.lastName)) || input.equals(this.personNr)) {
            return true;
        } else return false;
    }

    public static void getCustomerStatus(String input) {
        boolean notinregister = true;
        for (Person temp : CustomerStorage.register) {
            if (temp.existingCustomerr(input) && temp.validMembership()) {
                System.out.println("Befintlig medlem, giltigt träningskort");
                notinregister = false;
                break;
            } else if (temp.existingCustomerr(input)) {
                System.out.println("Befintlig medlem, ogiltigt träningskort");
                notinregister = false;
                break;
            }
        }
        if (notinregister) {
            System.out.println("Finns ej i kundregistret");
        }
    }

    @Override
    public String toString() {
        return personNr + firstName + lastName;
    }
}