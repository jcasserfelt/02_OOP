package Network.MultiClientAlaBadSkansholm;

// ClientHanteraren kopplar upp klienten till servern

import java.io.*;
import java.net.Socket;

public class ClientHanterare extends Thread {

    public Thread aktivitet = new Thread(this);
    Socket so;
    DataInputStream in;
    DataOutputStream out;
    BufferedReader inLine;
    PrintWriter outLine;

    ClientHanterare(Socket s) throws IOException {
        so = s;
//        out = new DataOutputStream(s.getOutputStream());
//        in = new DataInputStream(s.getInputStream());
        inLine = new BufferedReader(new InputStreamReader(s.getInputStream()));
        outLine = new PrintWriter(s.getOutputStream(), true);
        aktivitet.start();


    }

    @Override
    public void run() {
        Person p = new Person();
        while (true) {
            try {
                String clientNameSearch = inLine.readLine();
                if ((p = Server.database.getPersonByName(clientNameSearch)) != null) {
                    outLine.write(p.getAddress());
                } else outLine.write("Kunde inte hitta personen");

            } catch (IOException e) {
                System.out.println("Du har blivit fakad");
            }
        }
    }
}
