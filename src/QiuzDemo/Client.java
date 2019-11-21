package QiuzDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client extends Thread {

    protected String hostName = "127.0.0.1";  //localhost
    protected int portNumber = 12345;

    Client() {
    }

    @Override
    public void run() {
        try (Socket addressSocket = new Socket(hostName, portNumber);
             PrintWriter out = new PrintWriter(addressSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(
                     new InputStreamReader(addressSocket.getInputStream()));) {
            String fromServer;
            String fromUser;
            Scanner sc = new Scanner(System.in);
            fromUser = sc.nextLine();
            out.write(fromUser);


        } catch (UnknownHostException e) {
            System.out.println("UnknownHostException");
            e.printStackTrace();
            this.interrupt();
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
            this.interrupt();
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
