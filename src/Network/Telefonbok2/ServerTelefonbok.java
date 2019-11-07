package Network.Telefonbok2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTelefonbok {

    //DatabasTelefonbok d = new DatabasTelefonbok();
    DatabasTelefonbok databas = new DatabasTelefonbok();

    public ServerTelefonbok() {
        int portnr = 12345;

        try (ServerSocket serverSocket = new ServerSocket(portnr);
             Socket clientSocket = serverSocket.accept();
             ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());
             ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
        ) {
            Object inputLine;
            Person outputPerson;

            //Fuling, vi gör såhär eftersom klienten bara tar emot Person
            oos.writeObject(new Person(null,
                    "Vems adress behöver du veta", null));

            while ((inputLine = (String) ois.readObject()) != null) {
                outputPerson = databas.getPersonDataByName(((String) (inputLine)).trim());
                if (outputPerson == null) {
                    //String n = "Denna person finns inte i databasen";
                    oos.writeObject(new Person("null", "", ""));
                } else {
                    oos.writeObject(outputPerson);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerTelefonbok server = new ServerTelefonbok();
    }
}
