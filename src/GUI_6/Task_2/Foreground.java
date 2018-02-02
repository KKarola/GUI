package GUI_6.Task_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Foreground implements ActionListener {

    private JTextArea textArea;

    public Foreground(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        JMenuItem item = (JMenuItem) ae.getSource();
        MyIcon icon = (MyIcon) item.getIcon();
        textArea.setForeground(icon.getColor());
    }
}
