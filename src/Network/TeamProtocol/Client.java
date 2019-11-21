package Network.TeamProtocol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

    int portNr = 12345;
    String hostName = "127.0.0.1";

    Client() {
        try (Socket socket = new Socket(hostName, portNr);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader terminalIn = new BufferedReader(new InputStreamReader(System.in));


        ) {
            String input;
            String output;

            //input = terminalIn.readLine();

            // dags att snurra
            while ((input = in.readLine()) != null) {
                System.out.println("From Server: " + input);
                output = terminalIn.readLine();
                out.println(output);

            }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
    }
}
