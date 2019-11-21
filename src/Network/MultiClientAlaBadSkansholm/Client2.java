package Network.MultiClientAlaBadSkansholm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);
        int portNr = 12345;
        String hostName = "127.0.0.1";
        Socket s = new Socket(hostName, portNr);

//        DataInputStream in = new DataInputStream(s.getInputStream());
//        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        BufferedReader inLine = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter outLine = new PrintWriter(s.getOutputStream(), true);

        System.out.println("Ansluter till: " + hostName + ", på port: " + portNr);

        while (true) {
            String name = sc.nextLine();
            String adress;
            outLine.write(name);
            if ((adress = inLine.readLine()) != null) {
                System.out.printf("%s bor på adressen %s", name, adress);
            }
        }
    }
}
