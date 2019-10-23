package Sprint3GUI;

import javax.swing.*;

public class JFrameDemo extends JFrame {
    JFrameDemo() {
        setSize(300, 300);
        setLocation(1000, 500);
        //setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new JPanelDemo());

    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}
