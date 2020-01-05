package RunTime;

public class Running extends Thread {


    @Override
    public void run() {
        System.out.println(24 * 60 * 60 * 60 * (10e-6));

    }

    public static void main(String[] args) {
        new Running().start();
    }
}
