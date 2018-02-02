package GUI_6.Task_2;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main extends JFrame{
    private final static String DEFAULT_TITLE = "bez tytu³u";
    private final static Border RAISED_BORDER = BorderFactory.createBevelBorder(BevelBorder.RAISED);
    private static final int CTRL_SHIFT_MASK = ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK;

    private final LinkedHashMap<String, Color> colors = new LinkedHashMap<String, Color>();
    private final LinkedHashMap<Integer, String> fonts = new LinkedHashMap<Integer, String>();

    {
        colors.put("Blue", Color.BLUE);
        colors.put("Yellow", Color.YELLOW);
        colors.put("Orange", Color.ORANGE);
        colors.put("Red", Color.RED);
        colors.put("White", Color.WHITE);
        colors.put("Black", Color.BLACK);
        colors.put("Green", Color.GREEN);

        fonts.put(8, "8 pts");
        fonts.put(10, "10 pts");
        fonts.put(12, "12 pts");
        fonts.put(14, "14 pts");
        fonts.put(16, "16 pts");
        fonts.put(18, "18 pts");
        fonts.put(20, "20 pts");
        fonts.put(22, "22 pts");
        fonts.put(24, "24 pts");
    }


    private JTextArea textArea;
    private FileOp fileOp;

    public Main() {

        textArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(textArea);
        add(jScrollPane);

        fileOp = new FileOp(textArea);

        JMenuBar menu = new JMenuBar();
        menu.add(createMenuFile());
        menu.add(createMenuEdit());
        menu.add(createMenuOptions());

        setJMenuBar(menu);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setTitle("Prosty edytor - " + DEFAULT_TITLE);
        setVisible(true);
    }

    private JMenu createMenuFile() {
        JMenu menuFile = new JMenu("File");
        JMenuItem open, save, saveAs, exit;

        open = createMenuItem("Open", KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        open.addActionListener(ae -> {
            fileOp.read();
            title(fileOp.getName());
        });

        save = createMenuItem("Save", KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
        save.addActionListener(ae -> fileOp.save());

        saveAs = createMenuItem("Save As", KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
        saveAs.addActionListener(ae -> {
            fileOp.saveAs();
            title(fileOp.getName());
        });

        exit = createMenuItem("Exit", KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        exit.addActionListener(ae -> fileOp.exit());

        CustPanel custPanel = new CustPanel();
        custPanel.setBorder(RAISED_BORDER);


        menuFile.add(open);
        menuFile.add(save);
        menuFile.add(saveAs);
        menuFile.add(custPanel);
        menuFile.add(exit);
        return menuFile;
    }

    private JMenu createMenuEdit() {
        JMenu edit = new JMenu("Edit");
        JMenu address = new JMenu("Adresy");

        JMenuItem work = createMenuItem("Praca", KeyStroke.getKeyStroke(KeyEvent.VK_P, CTRL_SHIFT_MASK));
        work.addActionListener(createInsertTextAction("adres pracy"));

        JMenuItem school = createMenuItem("Szko³a", KeyStroke.getKeyStroke(KeyEvent.VK_D, CTRL_SHIFT_MASK));
        school.addActionListener(createInsertTextAction("adres szko³y"));

        JMenuItem home = createMenuItem("Dom", KeyStroke.getKeyStroke(KeyEvent.VK_S, CTRL_SHIFT_MASK));
        home.addActionListener(createInsertTextAction("adres domu"));

        address.add(work);
        address.add(school);
        address.add(home);
        edit.add(address);
        return edit;
    }

    private JMenu createMenuOptions() {
        JMenu options = new JMenu("Options");

        JMenu mForeground = new JMenu("Foreground");
        mForeground.setBorder(RAISED_BORDER);
        Foreground setForegroundAction = new Foreground(textArea);
        setColorsForMenuWithAction(mForeground, setForegroundAction);

        JMenu mBackground = new JMenu("Background");
        Background setBackgroundAction = new Background(textArea);
        setColorsForMenuWithAction(mBackground, setBackgroundAction);

        JMenu mFontSize = new JMenu("Font size");
        mFontSize.setBorder(RAISED_BORDER);
        for (Map.Entry<Integer, String> entry : fonts.entrySet()) {
            JMenuItem mItem = new JMenuItem(entry.getValue());
            mItem.addActionListener(new FontSize(textArea, entry.getKey()));
            mFontSize.add(mItem);
            mItem.setBorder(RAISED_BORDER);
        }

        options.add(mForeground);
        options.add(mBackground);
        options.add(mFontSize);
        return options;
    }

    private void setColorsForMenuWithAction(JMenu menu, ActionListener action) {
        menu.setBorder(RAISED_BORDER);
        for (Map.Entry<String, Color> entry : colors.entrySet()) {
            JMenuItem mItem = new JMenuItem(entry.getKey(), new MyIcon(entry.getValue()));
            mItem.addActionListener(action);
            menu.add(mItem);
            mItem.setBorder(RAISED_BORDER);
        }
    }


    private JMenuItem createMenuItem(String label, KeyStroke acceleratorKey) {
        JMenuItem menuItem = new JMenuItem(label);
        menuItem.setBorder(RAISED_BORDER);
        menuItem.setAccelerator(acceleratorKey);
        return menuItem;
    }

    private ActionListener createInsertTextAction(String text) {
        return ae -> textArea.insert(text, textArea.getCaretPosition());
    }

    private void title(String title) {
        setTitle("Prosty edytor - " + title);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
}
