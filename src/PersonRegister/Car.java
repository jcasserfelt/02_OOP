package PersonRegister;

public class Car {
    protected String _regnummer;
    protected String _tillverkare;
    protected String _modell;
    protected CarOwner _agare;

    Car(){}

    Car(String tillverkare, String modell, String regnummer){
        this._tillverkare = tillverkare;
        this._modell = modell;
        this._regnummer = regnummer;
    }
    public void changeOwner(CarOwner newOwner){
        //newOwner.car = oldOwnwer.car;
        this._agare = newOwner;
    }
}