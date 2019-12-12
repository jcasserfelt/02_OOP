package design.MVC.model;

public class Motor {
    int displacementVolyme;
    int effect;

    public Motor(int effect, int displacementVolyme) {
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

    public void setEffect(int effect) {
        this.effect = effect;
    }

    @Override
    public String toString() {
        return displacementVolyme + "cc" +
                ", effect=" + effect / 1000 + "kW";
    }
}
