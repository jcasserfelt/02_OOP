package Sprint2.ScannersMM.Inlamning2;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Gym {
    public static ArrayList<Customer> customerRegister = new ArrayList<Customer>();

    // Goes through the customerRegister and returns first matching object.
    public static Customer findCustomer(String input) {
        Customer customer = null;
        for (Customer temp : Gym.customerRegister) {
            if (input.equalsIgnoreCase(temp.getName()) || input.equalsIgnoreCase(temp.getPersonNr())) {
                customer = temp;
            }
        }
        return customer;
    }

    public static void scanCustomerFile() {
        Path path = Paths.get("customers.txt");
        try (Scanner sc = new Scanner(path);) {
            while (sc.hasNext()) {
                String personNr = sc.next().replace(",", "");
                String name = sc.next() + " " + sc.next();
                LocalDate localdate = LocalDate.parse((sc.next()));
                Gym.customerRegister.add(new Customer(name, personNr, localdate));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void customerCheckIn(String input) {
        try {
            Gym.scanCustomerFile();
            Customer temp = Gym.findCustomer(input);

            if (temp.isMember() && temp.hasValidTrainingCard()) {
                System.out.println("medlem och giltigt kort");
                System.out.println("Träningskortet går ut: " + temp.getTrainingCardExpiryDate());
                JOptionPane.showMessageDialog(null, "Medlem och giltigt kort. " + "\nTräningskortet går ut: " + temp.getTrainingCardExpiryDate());
                CustomerVisitLogg.writeToLogg(temp);

            } else if (temp.isMember() || !temp.hasValidTrainingCard()) {
                System.out.println("Medlem, träningskort utgånget");
                System.out.println("Träningskortet gick ut: " + temp.getTrainingCardExpiryDate());
                JOptionPane.showMessageDialog(null, "Medlem, träningskort utgånget\nTräningskortet gick ut: " + temp.getTrainingCardExpiryDate());
            } else {
                System.out.println("Kunde inte hittas/ är inte medlem");
                JOptionPane.showMessageDialog(null, "Kunde inte hittas/ är inte medlem");
            }
        } catch (NullPointerException e) {
            System.out.println("Kunde inte hittas/ är inte medlem");
            JOptionPane.showMessageDialog(null, "Kunde inte hittas/ är inte medlem");
        }
    }
}