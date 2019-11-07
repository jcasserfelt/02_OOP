package Network.MultiClient;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        int portnr = 12345;
        ServerSocket serverSocket = new ServerSocket(portnr);
        Database database = new Database();

        while (true) {
            Socket clientSocket = serverSocket.accept();
            // new Clienthanterare();

            // detta ska till Clienthanterare
//            ObjectOutputStream ut = new ObjectOutputStream(clientSocket.getOutputStream());
//            ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
//            BufferedReader bf = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        }


//        try (
//                ServerSocket serverSocket = new ServerSocket(portnr);
//                Socket clientSocket = serverSocket.accept();
//                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
//                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//        ) {
//            String input;
//            String output;
//        }

    }
}