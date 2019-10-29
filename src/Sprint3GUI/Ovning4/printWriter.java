package Sprint3GUI.Ovning4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class printWriter {
    public static void sendToFile() throws IOException {
        PrintWriter file = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("GOL_LOG.txt")));
    }
}
