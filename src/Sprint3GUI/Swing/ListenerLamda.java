package Sprint3GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ListenerLamda extends JFrame {
    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Tryck här");

    public ListenerLamda() {
        button.addActionListener(l -> {
            if (label.getText().equalsIgnoreCase("Hej")) {
                label.setText("Hopp");
            } else {
                label.setText("Hej");
            }
        });
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        button.setFocusPainted(true);
        this.add(p);
        p.add(label);
        p.add(button);
        //this.pack();
        this.setSize(200, 200);
        this.setLocation(800, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new ListenerLamda();
    }
}
