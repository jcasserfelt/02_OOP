package Sprint3GUI.Ovning4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextEditor extends JFrame implements ActionListener {
    private JPanel p = new JPanel();
    private JTextField namn = new JTextField();
    private JButton open = new JButton("Öppna");
    private JButton save = new JButton("Spara");
    private JButton print = new JButton("Skriv ut");
    private JButton quit = new JButton("Avsluta");
    private JTextArea area = new JTextArea(10, 60);
    private JScrollPane sp = new JScrollPane(area,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);


    public TextEditor() {
        area.setFont(new Font("Monospaced", Font.PLAIN, 12));
        p.setLayout(new GridLayout(1, 6));
        p.add(new JLabel("Filnamn: ", JLabel.RIGHT));
        p.add(namn);
        p.add(open);
        p.add(save);
        p.add(print);
        p.add(quit);
        namn.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        print.addActionListener(this);
        quit.addActionListener(this);
        // placera ut panelen och textarean
        add(p, BorderLayout.NORTH);
        add(sp, BorderLayout.CENTER);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == open) {
            readFile(namn.getText());
        } else if (e.getSource() == save) {
            saveFile(namn.getText());
        } else if (e.getSource() == print) {
            try {
                area.print();  // skriver ut texten, kan ge exception
            } catch (Exception ex) {
            }
        } else if (e.getSource() == quit) {
            System.exit(0);
        }
    }

    public void readFile(String filename) {
        try {
            FileReader reader = new FileReader(filename);
            area.read(reader, null);
        } catch (FileNotFoundException e) {
            System.out.println("Filen kunde inte hittas");
        } catch (IOException e) {
        }
    }

    public void saveFile(String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            area.write(fileWriter);
        } catch (IOException e) {
            System.out.println("fileWriter funka inte");
        }
    }

    public static void main(String[] args) {
        new TextEditor();
    }
}
