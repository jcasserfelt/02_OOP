package QiuzDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Server extends Thread {
    Socket clientSocket;

    Server(Socket s) {
        clientSocket = s;
    }

    @Override
    public void run() {
        try (PrintWriter out =
                     new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(clientSocket.getInputStream()));) {
            {
                String fromServer;
                String fromUser;
                fromServer = in.readLine();
                out.write(fromServer.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
