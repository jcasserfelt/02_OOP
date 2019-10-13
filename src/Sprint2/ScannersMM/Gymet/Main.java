package Sprint2.ScannersMM.Gymet;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ScanCustomers.readCustomers("customers.txt");
        System.out.println(CustomerStorage.register.get(11).validMembership());
        System.out.println(CustomerStorage.register.get(0).existingCustomerr("Alhambra Aromes"));
        Person.getCustomerStatus("Alhambra Aromes");
        Person.getCustomerStatus("Bear Belle");
        Person.getCustomerStatus("Viktor Sprejburk");



    }
}
