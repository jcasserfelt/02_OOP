package design.MVC.model;

public class Motor {
    int displacementVolyme;
    double effect;

    public Motor(double effect, int displacementVolyme) {
        this.displacementVolyme = displacementVolyme;
        this.effect = effect;
    }

    public int getDisplacementVolyme() {
        return displacementVolyme;
    }

    public double getEffect() {
        return effect;
    }

    public void setDisplacementVolyme(int displacementVolyme) {
        this.displacementVolyme = displacementVolyme;
    }

    public void setEffect(double effect) {
        this.effect = effect;
    }
}
