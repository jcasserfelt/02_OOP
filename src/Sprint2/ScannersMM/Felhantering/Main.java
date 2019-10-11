package Sprint2.ScannersMM.Felhantering;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> register = new ArrayList<Double>();


        System.out.println("a ? b");
        int a = Integer.valueOf(sc.next());

        String operator = sc.next();
        char operator1 = operator.charAt(operator.length() - 1);

        int b = Integer.valueOf(sc.next());

        double result = Kalkylator.calc(a, operator1, b);

        System.out.println("Resultat: " + result);

    }
}
