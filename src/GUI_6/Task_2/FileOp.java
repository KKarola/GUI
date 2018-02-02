package GUI_6.Task_2;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class FileOp {
    JTextArea textArea;
    JFileChooser fileChooser;
    File file;
    Scanner scanner;

    FileOp (JTextArea textArea) {
        this.textArea = textArea;
        fileChooser = new JFileChooser();
    }

    public String getName() {
        return file.getName();
    }

    public void read() {
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                file = fileChooser.getSelectedFile();
                BufferedReader br = new BufferedReader(new FileReader(file));
                scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    textArea.append(scanner.nextLine() + "\n");
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }

    public void save() {
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                file = fileChooser.getSelectedFile();
                PrintWriter pw = new PrintWriter(new FileWriter(file));
                scanner = new Scanner(textArea.getText());
                while (scanner.hasNextLine()) {
                    pw.print(scanner.nextLine() + "\n");
                }
                pw.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }


    public void saveAs() {
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                file = fileChooser.getSelectedFile();
                PrintWriter pw = new PrintWriter(new FileWriter(file));
                pw.write(textArea.getText());
                pw.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }


    public void exit() {
        int rev = JOptionPane.showConfirmDialog(null, "Czy zakoñczyæ pracê?", "Pytanie", JOptionPane.YES_NO_OPTION);
        if (rev == JOptionPane.YES_OPTION)
            System.exit(0);
        else if (rev == JOptionPane.NO_OPTION)
            return;
        else if (rev == JOptionPane.CLOSED_OPTION)
            return;
    }
}
