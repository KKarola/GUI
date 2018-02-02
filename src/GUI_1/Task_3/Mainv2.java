package GUI_1.Task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Mainv2 {
    public static void main(String[] args) {
        String fname = System.getProperty("user.home") + "/tab.txt";
        ArrayList data = new ArrayList();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(fname));
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    int number = Integer.parseInt(st.nextToken());
                    data.add(number);
                }
            }


        } catch (Exception e) {
            System.out.println("***");
        }

    }
}
