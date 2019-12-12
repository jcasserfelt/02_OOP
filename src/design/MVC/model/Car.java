package design.MVC.model;

public class Car {

    int weight;
    Motor motor;
    int passangers;
    String manufacturer;

    public Car(int weight, Motor motor, int passangers, String manufacturer) {
        this.weight = weight;
        this.motor = motor;
        this.passangers = passangers;
        this.manufacturer = manufacturer;

    }

    public double nollTillHundraTid() {
        // high effect engine = short time
        // many passangers = long time
        // heavy car = long time
        double constant = 457.5; // some converter constant found online
        double currentWeight = this.weight + 600 * this.getPassangers(); //
        double time = currentWeight * constant / this.motor.getEffect();
        return time;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getPassangers() {
        return passangers;
    }

    public void setPassangers(int passangers) {
        this.passangers = passangers;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "weight: " + weight + "\n" +
                "motor: " + motor + "\n" +
                "passangers: " + passangers + "\n" +
                "manufacturer: " + manufacturer + "\n" +
                "noll till hundra: " + nollTillHundraTid();
    }
}


