package Network.Telefonbok;

public class Person {
    public String namn;
    public String mobilNr;
    public String mailadress;

    public Person(String namn, String mobilNr, String mailadress) {
        this.namn = namn;
        this.mobilNr = mobilNr;
        this.mailadress = mailadress;
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
