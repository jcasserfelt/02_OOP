package PersonRegister;

public class bilMain {


    public static void main(String[] args) {
        Car bil1 = new Car();
        Car bil2 = new Car();

        CarOwner ag1 = new CarOwner("anna", "stret", 5, bil1);
        CarOwner ag2 = new CarOwner("olle", "strets", 15, bil2);


        bilMain b = new bilMain();
        bil1.changeOwner(ag2);
    }
}
