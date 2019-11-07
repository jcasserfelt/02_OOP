package Network.TeamProtocol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        int portnr = 12345;
        try (ServerSocket serverSocket = new ServerSocket(portnr);
             Socket clientSocket = serverSocket.accept();
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String input;
            String output;

            //System.out.println("Nu blir det server time!");
            out.println("Välkommen till en riktigt server");
            Protocol protocol = new Protocol();
            // initiera protrokoll?
            // lägg protokoll output i in eller output..

            // lets snurr
            while ((input = in.readLine()) != null) {
                //output = protokoll metod(input)
                System.out.println("From Client: " + input);
                output = protocol.goBig(input);
                out.println(output); // skicka tillbaks till clienteländet


            }
        }
    }
}