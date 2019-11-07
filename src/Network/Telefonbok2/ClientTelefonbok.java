package Network.Telefonbok2;

import java.io.*;
import java.net.Socket;

public class ClientTelefonbok {

    ClientTelefonbok() throws IOException {
        String hostName = "127.0.0.1";  //localhost
        int portNumber = 12345;

        try (Socket adressSocket = new Socket(hostName, portNumber);
             ObjectOutputStream oos = new ObjectOutputStream(
                     adressSocket.getOutputStream());
             ObjectInputStream ois = new ObjectInputStream(
                     adressSocket.getInputStream())
        ) {

            Person fromServer;
            String fromUser;
            BufferedReader stdIn =
                    new BufferedReader(new InputStreamReader(System.in));

            while ((fromServer = (Person) ois.readObject()) != null) {
                System.out.println("Server: " + fromServer.toString());
                fromUser = stdIn.readLine();
                if (fromUser != null) {
                    System.out.println("Client " + fromUser);
                    oos.writeObject(fromUser);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
            System.exit(1);
        }
    }

    public static void main(String[] args) throws IOException {
        ClientTelefonbok client = new ClientTelefonbok();
    }
}