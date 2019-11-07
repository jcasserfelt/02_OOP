package Network.Telefonbok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TelefonbokClient {

    TelefonbokClient() throws IOException {
        String hostName = "127.0.0.1";  //localhost
        int portNumber = 12345;

        try (Socket adressSocket = new Socket(hostName, portNumber);
             PrintWriter out = new PrintWriter(adressSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(adressSocket.getInputStream()));
        ) {
            String fromServer;
            String fromUser;
            BufferedReader stdIn =
                    new BufferedReader(new InputStreamReader(System.in));

            System.out.println(in.readLine());

            while ((fromUser = stdIn.readLine()) != null) {
                // System.out.println("Server: " + fromServer);

                if (fromUser != null) {
                    out.println(fromUser);

                }
                fromServer = in.readLine();
                System.out.println("from server " + fromServer);
            }
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
            System.exit(1);
        }
    }

    public static void main(String[] args) throws IOException {
        TelefonbokClient client = new TelefonbokClient();
    }
}