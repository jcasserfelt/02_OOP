package Sprint3GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelDemo extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hej");
    JButton buton = new JButton("knappp");


    public JPanelDemo() {
        setLayout(new FlowLayout());
        add(panel);
        panel.add(label);
        panel.add(buton);
        panel.setLayout(new BorderLayout());
        buton.addActionListener(this);
        add(panel);
        panel.add(new JLabel("nord"), BorderLayout.NORTH);
        panel.add(new JButton("knapp2"), BorderLayout.SOUTH);
        // setSize(300,300);
        pack();
        setLocation(1000, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        JPanelDemo g = new JPanelDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (label.getText().equalsIgnoreCase("knapp2")) {
            label.setText("knapp33333");
        } else {
            label.setText("Else");
        }
    }
}
