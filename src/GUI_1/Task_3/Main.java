package GUI_1.Task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        String fname = System.getProperty("user.home") + "/tab.txt";
        ArrayList<Integer> data = new ArrayList();
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

            int[] tab = new int[data.size()];
            for(int i = 0; i < tab.length; i++) {
                tab[i] = data.get(i);
                System.out.print(tab[i] + " ");
            }
            System.out.println();

            int maksymalna = tab[0];
            for (int i = 0; i < tab.length; i++) {
                if(maksymalna < tab[i]) maksymalna = tab[i];
            }
            System.out.println(maksymalna);

            for (int i = 0; i < tab.length; i++) {
                if(tab[i] == maksymalna) System.out.print(i + " ");
            }

        } catch (Exception e) {
            System.out.println("***");
        }

    }
}
