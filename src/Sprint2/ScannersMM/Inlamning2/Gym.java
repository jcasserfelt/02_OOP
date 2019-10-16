package Sprint2.ScannersMM.Inlamning2;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
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

    // Read customer.txt, put input in customerRegister
    public static void scanCustomerFile() {
        Path path = Paths.get("customers.txt");
        try (Scanner sc = new Scanner(new File(path.toString()))) {
            while (sc.hasNext()) {
                String personNr = sc.next().replace(",", "");
                String name = sc.next() + " " + sc.next();
                LocalDate localdate = LocalDate.parse((sc.next()));
                Gym.customerRegister.add(new Customer(name, personNr, localdate));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Customer file could not be found");         // catches if file could not be fonud
        } catch (DateTimeParseException e) {
            System.out.println("Entered customers payDate is incorrect");   // cathes if payDate is incorrect like "101f-01-04"
        } catch (Exception e) {
            System.out.println("Obskyrt fel inträffade ");                  // catches if user managed to mess up something unexpected
            e.printStackTrace();
        } finally {
            //System.out.println("inte redundant?");  // Java doesnt complain that finally-block is redundant???
            // what happened to try with resources???
        }
    }

    // the master method, takes userinput input and sends it fo further methods
    public static void customerCheckIn(String input) {
        try {
            scanCustomerFile();
            Customer temp = findCustomer(input);

            if (temp.isMember() && temp.hasValidTrainingCard()) {
                System.out.println("medlem och giltigt kort");
                System.out.println("Träningskortet går ut: " + temp.getTrainingCardExpiryDate());
                JOptionPane.showMessageDialog(null, "Medlem och giltigt kort. " + "\nTräningskortet går ut: " + temp.getTrainingCardExpiryDate());
                CustomerVisitLog.writeToLog(temp);

            } else if (temp.isMember() || !temp.hasValidTrainingCard()) {
                System.out.println("Medlem, träningskort utgånget");
                System.out.println("Träningskortet gick ut: " + temp.getTrainingCardExpiryDate());
                JOptionPane.showMessageDialog(null, "Medlem, träningskort utgånget\nTräningskortet gick ut: " + temp.getTrainingCardExpiryDate());

            } else {
                System.out.println("Kunde inte hittas/ är inte medlem");
                JOptionPane.showMessageDialog(null, "Kunde inte hittas/ är inte medlem");
            }

        } catch (NullPointerException e) { // if user input didnt match with customerRegister
            System.out.println("Kunde inte hittas/ är inte medlem");
            JOptionPane.showMessageDialog(null, "Kunde inte hittas/ är inte medlem");
        }
    }
}