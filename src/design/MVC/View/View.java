package design.MVC.View;

import design.MVC.model.Car;

public class View {

    public void showWeight(Car car) {
        System.out.println("Bilen väger: " + car.getWeight());
    }

    public void showNollTillHundra(Car car) {
        System.out.printf("Bilen gör 0-100 på %f sekunder, med %d passagare ", car.nollTillHundraTid(), car.getPassangers());
    }

    public void showTheWholeDamnThing(Car car) {
        System.out.println(car.toString());
    }

}
