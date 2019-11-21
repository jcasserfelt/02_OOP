package QiuzDemo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListner extends Thread {
    int portNr = 12345;
    private ServerSocket serverSocket;

    ServerListner() throws IOException {
        serverSocket = new ServerSocket(12345);
    }


    @Override
    public void run() {
        while (true) {
            try {
                final Socket socketToClient = serverSocket.accept();
                Server server = new Server(socketToClient);
                server.start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) throws IOException {
        ServerListner s = new ServerListner();
        s.start();
    }
}
