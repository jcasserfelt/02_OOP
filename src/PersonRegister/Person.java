package PersonRegister;

public class Person {
    protected String _namn;
    protected String _adress;
    protected int _age;

    public Person(){}

    public Person(String namn, String adress, int age){
        this._namn = namn;
        this._adress = adress;
        this._age = age;
    }
}