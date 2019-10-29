package Sprint3GUI.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerInnerClassEx extends JFrame {

    JLabel label = new JLabel("Hej");
    JButton button = new JButton("Tryck här");

    class ListenerInnerClass implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }


    public static void main(String[] args) {
        new ListenerInnerClassEx();
    }
}
