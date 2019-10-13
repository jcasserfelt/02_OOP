package Sprint2.ScannersMM.Gymet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomerVisitLogg {

    public static void WriteToLogg() throws IOException {
        Path path = Paths.get("CustomerLogg.txt");

        if (!Files.exists(path)) {
            Files.createFile(path);
            BufferedWriter writer =
                    Files.newBufferedWriter(path,
                            StandardCharsets.UTF_8);

            writer.write("nu skriver vi i vår fil");
            writer.flush();
        }
    }
}