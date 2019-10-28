package Sprint3GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Uppg7 extends JFrame {
    JFrame frame = new JFrame();
    JButton button = new JButton("Press the button");
    JLabel label = new JLabel("Jag är en label");
    JPanel panel = new JPanel();


    public Uppg7() {
        panel.setLayout(new FlowLayout());
        add(button);
        button.addMouseListener(ml);
        button.addMouseListener(ml2);
        setSize(200, 200);
        this.setLocation(1000, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    MouseAdapter ml = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            super.mouseEntered(e);
            if (e.getComponent() == button) {
                Random rd = new Random();
                int a = rd.nextInt(200);
                int b = rd.nextInt(200);
                int c = rd.nextInt(300);
                int d = rd.nextInt(300);
                button.setBackground(new Color(a, b, c, d));

            }
        }

        @Override
        public void mouseExited(MouseEvent e) {
            super.mouseExited(e);
            if (e.getComponent() == button) {
                Random rd = new Random();
                int a = rd.nextInt(249);
                int b = rd.nextInt(249);
                int c = rd.nextInt(249);
                int d = rd.nextInt(249);
                button.setBackground(new Color(a, b, c, d));
                //button.setBackground(Color.GREEN);
            }
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            super.mouseMoved(e);
            if (e.getComponent() == button) {
                Random rd = new Random();
                int a = rd.nextInt(249);
                int b = rd.nextInt(249);
                int c = rd.nextInt(249);
                int d = rd.nextInt(249);
                button.setBackground(new Color(a, b, c, d));
            }
        }
    };
    MouseAdapter ml2 = new MouseAdapter() {
        @Override
        public void mouseMoved(MouseEvent e) {
            super.mouseMoved(e);
            if (e.getComponent() == button) {
                //button.setBackground(new Color(1, 1, 1, 1));
            }
        }
    };

    public static void main(String[] args) {
        new Uppg7();
    }
}
