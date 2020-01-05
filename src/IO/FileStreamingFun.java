package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStreamingFun {


    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Win 10 PC\\Pictures\\Arduino\\Plot need FFT.PNG");
        File fileOut = new File("binaryOutput.png");
        int temp;
        List<Integer> integerList = new ArrayList<>();
        try (FileInputStream in = new FileInputStream(file);
             FileOutputStream out = new FileOutputStream(fileOut);) {
            while ((temp = in.read()) != -1) {
                out.write(temp);
                integerList.add(temp);
            }
        } catch (IOException e) {
            System.out.println();
            e.printStackTrace();

        }
        ;

    }
}
