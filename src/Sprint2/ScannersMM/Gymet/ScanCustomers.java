package Sprint2.ScannersMM.Gymet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanCustomers {

    public static void readCustomers(String filePath) throws IOException {

        String tempLine;
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        Path path = Paths.get(filePath);
        Scanner sc = new Scanner(path);
        ArrayList<Person> register = new ArrayList<Person>();
        Person fakk = new Person();

        try (BufferedReader bufIn = Files.newBufferedReader(path)) {
            while (sc.hasNext()) {
                tempLine = sc.next();
                //while ((tempLine = sc.next()) != null)
                register.add(new Person());
                register.get(counter).personNr = tempLine;
                register.get(counter).firstName = sc.next().replace(",", "");
                register.get(counter).lastName = sc.next().replace(",", "");
                register.get(counter).avgifttBetald = sc.next().replace(",", "");
                register.get(counter).membershipDate = Person.converter(register.get(counter).avgifttBetald);
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
            System.out.println("antligen");
        }
    }

}
