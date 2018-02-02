package GUI_6.Task_2;

import javax.swing.*;
import java.awt.*;

public class CustPanel extends JPanel{
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.red);
        g.fillRect(w/2 - 40, h/2 - 1, 80, 2);
    }
}

