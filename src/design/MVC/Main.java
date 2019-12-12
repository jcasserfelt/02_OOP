package design.MVC;

import design.MVC.View.View;
import design.MVC.controller.Controller;
import design.MVC.model.Car;
import design.MVC.model.Motor;

public class Main {
    public static void main(String[] args) {
        Car fastCar = buildFastCar();
        Car slowCar = buildSlowCar();

        View view = new View();
        Controller controller1 = new Controller(fastCar, view);

        controller1.allView();
        controller1.setPassengers(5);
        controller1.allView();
    }

    public static Motor buildSmallMotor() {
        Motor motor = new Motor(120000, 1300);
        return motor;
    }

    public static Motor buildBigMotor() {
        Motor motor = new Motor(360000, 5000);
        return motor;
    }

    private static Car buildFastCar() {
        Motor bigMotor = buildBigMotor();
        Car fastCar = new Car(1500, bigMotor, 0, "Ferrari");
        return fastCar;
    }

    private static Car buildSlowCar() {
        Motor smallMotor = buildSmallMotor();
        Car fastCar = new Car(3500, smallMotor, 0, "DKV");
        return fastCar;
    }

}
