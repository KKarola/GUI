package GUI_6.Task_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FontSize implements ActionListener {

    private JTextArea textArea;
    private int fontSize;

    public FontSize(JTextArea textArea, int fontSize) {
        this.textArea = textArea;
        this.fontSize = fontSize;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, fontSize));
    }
}