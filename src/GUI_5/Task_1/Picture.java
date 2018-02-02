package GUI_5.Task_1;

import javax.swing.*;
import java.awt.*;

public class Picture extends JPanel{
    Picture(int w, int h) {
        Dimension dimension = new Dimension(w, h);
        setMinimumSize(dimension);
        setPreferredSize(new Dimension(dimension));
        setMaximumSize(dimension);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.blue);
        g.drawLine(0, 0, w, h);
        g.drawLine(w, 0, 0, h);
    }
}
