package Sprint2.ScannersMM.ReadFromFile;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

public class Ovning5a {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(new Locale("SV", "sv"));
        new Locale("sv", "SE");

        double tempDig;
        String tempLine;
        ArrayList<Double> register = new ArrayList<Double>();
        BufferedReader bufIn = new BufferedReader(new FileReader("uppg5.txt"));

        while ((tempLine = bufIn.readLine()) != null) {
            tempLine = tempLine.replace(',', '.');
            tempDig = Double.valueOf(tempLine);
            register.add(tempDig);
            System.out.println(tempLine);
        }
        double hogsta = 0;
        double total = 0;
        for (Double temp : register) {
            if (temp.doubleValue() > hogsta) hogsta = temp.doubleValue();
            total += temp.doubleValue();
        }
        double avarage = total / register.size();
        System.out.printf("Hogsta: %.2f\n", hogsta);
        System.out.printf("Genomsnitt: %.2f\n", avarage);
    }

}