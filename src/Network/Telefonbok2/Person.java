package Network.Telefonbok2;

import java.io.Serializable;

public class Person implements Serializable {
    public String namn;
    public String mobilNr;
    public String mailadress;
    static final long serialVersionUID = 42L;

    public Person(String namn, String mobilNr, String mailadress) {
        this.namn = namn;
        this.mobilNr = mobilNr;
        this.mailadress = mailadress;
    }

    Person() {
    }

    public String getNamn() {
        return namn;
    }

    public String getMobilNr() {
        return mobilNr;
    }

    public String getMailadress() {
        return mailadress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "namn='" + namn + '\'' +
                ", mobilNr='" + mobilNr + '\'' +
                ", mailadress='" + mailadress + '\'' +
                '}';
    }
}
