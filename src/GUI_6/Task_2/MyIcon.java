package GUI_6.Task_2;

import java.awt.*;

public class MyIcon implements javax.swing.Icon {
    private int widht, height;
    private Color color;

    public MyIcon() {
        this.widht = 12;
        this.height = 12;
        this.color = Color.BLACK;
    }

    public MyIcon(int width, int height) {
        this.widht = width;
        this.height = height;
        color = Color.BLACK;
    }

    public MyIcon(Color color) {
        this.widht = 12;
        this.height = 12;
        this.color =color;
    }

    public MyIcon(int width, int height, Color color) {
        this.widht = width;
        this.height = height;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public int getIconWidth() {
        return widht;
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x, y, widht, height);
    }
}
