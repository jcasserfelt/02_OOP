package Network.MultiClientAlaBadSkansholm;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static Database database = new Database();


    Server() throws IOException {
        int portnr = 12345;
        ServerSocket serverSocket = new ServerSocket(portnr);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client ansluten");
            ClientHanterare cl = new ClientHanterare(clientSocket);
            cl.start();

        }
    }

    public static void main(String[] args) throws IOException {
        new Server();
    }
}