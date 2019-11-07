package Network.Telefonbok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTelefonbok {

    DatabasTelefonbok databas = new DatabasTelefonbok();

    public ServerTelefonbok() {
        int portnr = 12345;

        try (ServerSocket serverSocket = new ServerSocket(portnr);
             Socket clientSocket = serverSocket.accept();
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ) {
            String inputLine;
            String outputLine;
            System.out.println("in serverbefore fist print");
            out.println("Vilken kompis ska vi ringa?");

            while ((inputLine = in.readLine()) != null) {
                outputLine = databas.getPersonData(inputLine);
                if (outputLine == null) {
                    out.println("Denna person finns inte i databasen: " + inputLine);
                } else {
                    out.println(outputLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ServerTelefonbok server = new ServerTelefonbok();
    }
}
