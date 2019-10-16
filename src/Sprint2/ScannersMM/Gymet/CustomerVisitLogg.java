package Sprint2.ScannersMM.Gymet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomerVisitLogg {

    public static void WriteToLogg(String input) throws IOException {
        Path path = Paths.get("CustomerLogg.txt");

        try (PrintWriter logg = new PrintWriter(
                Files.newBufferedWriter(path))) {

        }


    }
}