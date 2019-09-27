package PersonRegister;

public class CarOwner extends Person {

    protected Car _bil;

    public CarOwner(String namn, String adress, int age, Car bil) {
        this._namn = namn;
        this._adress = adress;
        this._age = age;
        this._bil = bil;
    }
}