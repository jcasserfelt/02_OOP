package Sprint2.ScannersMM.SkrivaTillFill;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Uppg6 {
    public static void main(String[] args) throws IOException {

        String tempLine;
        int counter = 0;
        Path path = Paths.get("NackademinPersonuppgifter.txt");
        Scanner sc = new Scanner(path);
        StringBuilder sb = new StringBuilder();
        ArrayList<Person> personRegister = new ArrayList<Person>();


        try (BufferedReader bufIn = Files.newBufferedReader(path)) {
            while ((tempLine = sc.next()) != null) {
                personRegister.add(new Person());
                personRegister.get(counter).firstName = tempLine;
                personRegister.get(counter).lastname = sc.next().replace(",", "");
                personRegister.get(counter).street = sc.next().replace(",", "");
                personRegister.get(counter).streetNumber = sc.next().replace(",", "");
                personRegister.get(counter).zipCode = sc.next().replace(",", "");
                personRegister.get(counter).town = sc.next().replace(",", "");
                personRegister.get(counter).age = sc.next().replace(",", "");
                personRegister.get(counter).weight = sc.next().replace(",", "");
                personRegister.get(counter).lenght = sc.next().replace(",", "");
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
        }

    }
}