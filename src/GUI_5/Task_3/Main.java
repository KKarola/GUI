package GUI_5.Task_3;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JTextArea notatnik = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(notatnik);
        JFrame frame = new JFrame();

        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        notatnik.setBackground(Color.BLUE);
        notatnik.setForeground(Color.YELLOW);
        notatnik.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 14));
        frame.setVisible(true);
    }
}