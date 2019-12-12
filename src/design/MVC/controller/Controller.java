package design.MVC.controller;

import design.MVC.View.View;
import design.MVC.model.Car;

public class Controller {
    Car car;
    View view;

    public Controller(Car car, View view) {
        this.car = car;
        this.view = view;
    }

    public void setPassengers(int passengers) {
        this.car.setPassangers(passengers);
    }

    public void weightView() {
        view.showWeight(this.car);
    }

    public void accView() {
        view.showNollTillHundra(this.car);
    }

    public void allView() {
        view.showTheWholeDamnThing(this.car);
    }
}


