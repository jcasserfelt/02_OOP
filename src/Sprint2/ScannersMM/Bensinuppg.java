package Sprint2.ScannersMM;

import java.util.Scanner;

public class Bensinuppg {

    public static void main(String[] args) {

        double milage;
        double lastYearMilage;
        double lastYearGasUse;
        double gasPerMil;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Mätarinställning: ");
        String input = sc.nextLine();
        milage = Integer.parseInt(input);

        System.out.printf("Mätarinställning för ett år sedan: ");
        input = sc.nextLine();
        lastYearMilage = Integer.parseInt(input);

        System.out.printf("Antal liter bensin som förbrukats under året: ");
        input = sc.nextLine();
        lastYearGasUse = Integer.parseInt(input);

        gasPerMil = lastYearGasUse / (milage - lastYearMilage);

        System.out.printf("Antal körda mil:\t\t\t%.2f\n", milage);
        System.out.printf("Förbrukad bensin:\t\t\t%.2f\n", lastYearGasUse);
        System.out.printf("Bensinförbrukning per mil:\t%.2f\n", gasPerMil);
    }

}
