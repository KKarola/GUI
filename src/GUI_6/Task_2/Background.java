package GUI_6.Task_2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Background implements ActionListener {

    private JTextArea textArea;

    public Background(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item = (JMenuItem) e.getSource();
        MyIcon icon = (MyIcon) item.getIcon();
        textArea.setBackground(icon.getColor());
    }
}