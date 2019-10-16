package Sprint2.ScannersMM.Gymet;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    public Person() {
    }

    String personNr;
    String name;
    LocalDate membershipDate;

/*    public boolean validMembership() {
        long paidDateEpoch = this.membershipDate.toEpochDay();
        long todayEpoch = LocalDate.now().toEpochDay();
        //System.out.println(paidDateEpoch);
        return (todayEpoch - paidDateEpoch) <= 365;
    }*/

    public boolean validMembership() {
        //LocalDate now = LocalDate.now();
        Period period = this.membershipDate.until(LocalDate.now());
        return period.getYears() < 1;
    }

    public boolean existingCustomerr(String input) {
        if ((input.equals(this.name) || input.equals(this.personNr))) {
            return true;
        } else return false;
    }

    public static void getCustomerStatusMessage(String input) {
        boolean notInRegister = true;
        for (Person temp : CustomerRegister.register) {
            if (temp.existingCustomerr(input) && temp.validMembership()) {
                System.out.println("Befintlig medlem, giltigt träningskort");
                notInRegister = false;
                break;
            } else if (temp.existingCustomerr(input)) {
                System.out.println("Befintlig medlem, ogiltigt träningskort");
                notInRegister = false;
                break;
            }
        }
        if (notInRegister) {
            System.out.println("Finns ej i kundregistret");
        }
    }

    @Override
    public String toString() {
        return personNr + " " + name;
    }
}