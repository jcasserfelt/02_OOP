package Sprint2.ScannersMM.Gymet;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CustomerRegister.readCustomers();
        System.out.println(CustomerRegister.register.get(11).validMembership());
        System.out.println(CustomerRegister.register.get(0).existingCustomerr("Alhambra Aromes"));
        Person.getCustomerStatusMessage("Alhambra Aromes");
        Person.getCustomerStatusMessage("Bear Belle");
        System.out.println(CustomerRegister.register.get(11).validMembership());
        Person.getCustomerStatusMessage("Viktor Sprejburk");
        //System.out.println(CustomerRegister.lookForCustomer("Bear Belle"));
        try {
            System.out.println(CustomerRegister.lookForCustomer("Bear Balle").toString());

        } catch (NullPointerException e) {
            System.out.println("vattafakka");
        }
        // CustomerVisitLogg.WriteToLogg("Bear Belle");
    }
}