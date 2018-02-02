package GUI_7.Task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    private JFrame jFrame;
    private DefaultListModel<String> defaultListModel;
    private JList<String> jList;
    private JTextField jTextField;

    Main() {
        jFrame = new JFrame("JTextField & JList");
        defaultListModel = new DefaultListModel<String>();
        jList = new JList<String>(defaultListModel);
        jTextField = new JTextField();

        jTextField.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == KeyEvent.VK_ENTER && !jTextField.getText().equals("")) {
                    defaultListModel.addElement(jTextField.getText());
                    jTextField.setText("");
                }
            }
        });

        jList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent mouseEvent) {
                if(mouseEvent.isAltDown() && jList.getSelectedIndex() >= 0) {
                    defaultListModel.remove(jList.getSelectedIndex());
                }
            }
        });

        jFrame.getContentPane().setLayout(new BorderLayout());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 500);
        jFrame.setVisible(true);
        jFrame.add(new JScrollPane(jList));
        jFrame.add(jTextField, BorderLayout.PAGE_END);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
