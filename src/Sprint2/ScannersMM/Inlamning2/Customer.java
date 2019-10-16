package Sprint2.ScannersMM.Inlamning2;

import java.time.LocalDate;
import java.time.Period;

public class Customer {
    private String name;
    private String personNr;
    private LocalDate payDate;

    public Customer(String name, String personNr, LocalDate dayDate) {
        this.name = name;
        this.personNr = personNr;
        this.payDate = dayDate;
    }

    // true if payDate is less than a year ago
    public boolean hasValidTrainingCard() {
        LocalDate nowIsh = LocalDate.now();
        Period p = Period.between(this.payDate, nowIsh);
        return p.getYears() < 1;
    }

    // true i this name or this personNr matches with customerRegister
    public boolean isMember() {
        boolean isMember = false;
        for (Customer temp : Gym.customerRegister) {
            if (this.getName().equalsIgnoreCase(temp.getName()) && this.getPersonNr().equalsIgnoreCase(temp.getPersonNr())) {
                isMember = true;
            }
        }
        return isMember;
    }

    public LocalDate getTrainingCardExpiryDate() {
        return this.getPayDate().plusYears(1);
    }

    public String getName() {
        return name;
    }

    public String getPersonNr() {
        return personNr;
    }

    public LocalDate getPayDate() {
        return payDate;
    }
}
