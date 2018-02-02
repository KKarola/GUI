package GUI_7.Task_1;

import javax.swing.*;

public class Main {
    private JFrame jFrame;
    private JList list;

    public Main() {
        jFrame = new JFrame("Konwerter temperatur");

        list = new JList(new MyAbstractListModel());
        jFrame.add(new JScrollPane(list));

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 500);
        jFrame.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
