package GUI_5.Task_4;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String[] mozliwosci = { "A", "B", "C", "D", "E", "F", "G"};

        int rc = JOptionPane.showOptionDialog(
                null,
                null,
                "Treœæ listu",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                mozliwosci,
                mozliwosci[0]
        );

        String lmNames[] = {
                "Border Layout",
                "FlowLayout",
                "Flow (left aligned)",
                "Flow (right aligned)",
                "GridLayout(0, 1)",
                "GridLayout(1, 0)",
                "GridLayout(3, 2)",

        };

        LayoutManager lm[] = {
                new BorderLayout(),
                new FlowLayout(),
                new FlowLayout(FlowLayout.LEFT),
                new FlowLayout(FlowLayout.RIGHT),
                new GridLayout(0, 1),
                new GridLayout(1, 0),
                new GridLayout(3, 2),
        };

        String gborders[] = { "West", "North", "East", "South", "Center" };

        JFrame frame = new JFrame("Layouts show");
        JPanel p = new JPanel();
        p.setBackground(Color.BLUE);
        JButton b1 = new JButton("Przycisk 1");
        p.add(b1);
        JButton b2 = new JButton("P 2");
        p.add(b2);
        JButton b3 = new JButton("Wiêkszy przycisk numer 3");
        p.add(b3);
        JButton b4 = new JButton("Przycisk 4");
        p.add(b4);
        JButton b5 = new JButton("P 5");
        p.add(b5);



        switch (rc) {
            case 0 : {
                p.setBorder(BorderFactory.createTitledBorder(lmNames[0]));
                p.setLayout(lm[0]);
                JButton b01 = new JButton("Przycisk 1");
                p.add(b01, gborders[1]);
                JButton b02 = new JButton("P 2");
                p.add(b02, gborders[0]);
                JButton b03 = new JButton("Wiêkszy przycisk numer 3");
                p.add(b03, gborders[4]);
                JButton b04 = new JButton("Przycisk 4");
                p.add(b04, gborders[3]);
                JButton b05 = new JButton("P 5");
                p.add(b05, gborders[2]);
                frame.add(p);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                break;
            }

            case 1 : {
                p.setBorder(BorderFactory.createTitledBorder(lmNames[1]));
                p.setLayout(lm[1]);
                frame.add(p);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                break;
            }

            case 2 : {
                p.setBorder(BorderFactory.createTitledBorder(lmNames[2]));
                p.setLayout(lm[2]);
                frame.add(p);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                break;
            }

            case 3 : {
                p.setBorder(BorderFactory.createTitledBorder(lmNames[3]));
                p.setLayout(lm[3]);
                frame.add(p);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                break;
            }

            case 4 : {
                p.setBorder(BorderFactory.createTitledBorder(lmNames[4]));
                p.setLayout(lm[4]);
                frame.add(p);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                break;
            }

            case 5 : {
                p.setBorder(BorderFactory.createTitledBorder(lmNames[5]));
                p.setLayout(lm[5]);
                frame.add(p);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                break;
            }

            case 6 : {
                p.setBorder(BorderFactory.createTitledBorder(lmNames[6]));
                p.setLayout(lm[6]);
                frame.add(p);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                break;
            }
        }
    }
}
