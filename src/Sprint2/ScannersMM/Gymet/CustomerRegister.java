package Sprint2.ScannersMM.Gymet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class CustomerRegister {

    public static ArrayList<Person> register = new ArrayList<Person>();

    public static void readCustomers() throws IOException {
        String tempLine;
        int counter = 0;
        Path path = Paths.get("customers.txt");
        Scanner sc = new Scanner(path);
        CustomerRegister.register = new ArrayList<Person>();


        try (BufferedReader bufIn = Files.newBufferedReader(path)) {
            while (sc.hasNext()) {

                register.add(new Person());
                register.get(counter).personNr = sc.next().replace(",", "");
                register.get(counter).name = sc.next() + " " + sc.next();
                /*register.get(counter).firstName = sc.next().replace(",", "");
                register.get(counter).lastName = sc.next().replace(",", "");*/
                //register.get(counter).avgifttBetald = sc.next().replace(",", "");
                register.get(counter).membershipDate = LocalDate.parse(sc.next());
                counter++;

            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Det gick inte att skriva till fil");
            e.printStackTrace();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        } finally {
            //System.out.println("antligen");
        }
    }

    public static Person lookForCustomer(String input) throws NullPointerException {
        Person pers = null;
        for (Person temp : register) {
            if ((input.equalsIgnoreCase(temp.name) || input.equals(temp.personNr))) {
                pers = temp;
                return pers;
            }
        }
        return pers;
    }
}