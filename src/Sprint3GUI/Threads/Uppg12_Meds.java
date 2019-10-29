package Sprint3GUI.Threads;

public class Uppg12_Meds {

    public static void main(String[] args) throws InterruptedException {
        Skrivare a1 = new Skrivare("Ole", 1);
        Skrivare a2 = new Skrivare("Dole", 2);
//        Thread.sleep(3000);

        a1.aktivitet.start();
        a2.aktivitet.start();
        Thread.sleep(5000);
        a1.aktivitet.interrupt();
        a2.aktivitet.interrupt();


    }
}
