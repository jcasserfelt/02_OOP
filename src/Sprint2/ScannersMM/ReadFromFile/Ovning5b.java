package Sprint2.ScannersMM.ReadFromFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ovning5b {
    public static void main(String[] args) throws IOException {

        double tempDig;
        double hogsta = 0;
        double total = 0;
        int counter = 0;
        String tempLine;
        ArrayList<Double> register = new ArrayList<Double>();

        //BufferedReader bufIn = new BufferedReader(new FileReader("uppg5.txt"));
        Scanner sc = new Scanner(new File("uppg5.txt"));

        while (sc.hasNext()) {
            tempDig = sc.nextDouble();
            //tempLine = tempLine.replace(",",".");
            //tempDig = Double.valueOf(tempLine);
            //tempDig = Double.parseDouble(tempLine.replace(",", "."));
            register.add(tempDig);
            System.out.println(tempDig);
            if (tempDig > hogsta) {
                hogsta = tempDig;
            }
            total += tempDig;
            counter++;
        }

        double avarage = total / register.size();
        System.out.printf("Hogsta: %.2f\n", hogsta);
        System.out.printf("Genomsnitt: %.2f\n", total / counter);
    }
}
