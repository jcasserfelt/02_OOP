package Sprint3GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends JFrame implements ActionListener {

    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Tryck här");

    ButtonDemo() {
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        button.addActionListener(this);
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
        if (label.getText().equalsIgnoreCase("Hej")) {
            label.setText("Hopp");
        } else {
            label.setText("Hej");
        }
    }

    public static void main(String[] args) {
        ButtonDemo g = new ButtonDemo();
    }
}
