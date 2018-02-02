package GUI_6.Task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private Color[] colors = {Color.GREEN, Color.BLUE, Color.RED};
    int color = 0;

    Main() {
        JFrame jfrm = new JFrame("Przycisk");
        jfrm.setSize(300, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Przycisk");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (color == colors.length) {
                    color = 0;
                }
                button.setBackground(colors[color]);
                color++;
            }
        });
        jfrm.add(button);
        jfrm.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
