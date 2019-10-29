package Sprint3GUI.Threads;

public class Skrivare implements Runnable {

    public Thread aktivitet = new Thread(this);
    private String text;
    private long intervall;


    public Skrivare(String _text, long _intercvall) {
        this.text = _text;
        this.intervall = _intercvall * 1000;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayGoodbye() {
        System.out.println("Goodbye");
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                Thread.sleep(intervall);
                System.out.print(text + " ");
                System.out.flush();
            } catch (InterruptedException e) {
                //System.out.println("Nu ska det sovas");
                break;
                //e.printStackTrace();
            }
            //System.out.println("text: " + text);
        }
    }
}
