package Sprint2.ScannersMM.Inlamning2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class CustomerVisitLog {

    public static void writeToLog(Customer customer) {
        Path path = Paths.get("CustomerLogg.txt");
        if (!Files.isReadable(path)) {
            System.out.println("Log file was created");
        }
        try (PrintWriter file = new PrintWriter(new FileWriter(new File(path.toString()), true));) {
            file.printf("%-20s %-20s %-20s", LocalDate.now().toString(), customer.getPersonNr(), customer.getName());
            file.write('\n');
            //file.close(); REDUNDANT PGA try-with-resources !! ;)

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
