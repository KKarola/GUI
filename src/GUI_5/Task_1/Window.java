package GUI_5.Task_1;

import javax.swing.*;

public class Window extends JFrame{
    Window() {
        super("Siatka");
        add(new Picture(200, 200));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
