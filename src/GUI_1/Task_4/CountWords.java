package GUI_1.Task_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class CountWords {
    String path;
    String line;
    List<String> lista = new ArrayList<>();
    List<String> list = new ArrayList<>();
    Map<String,Integer> map = new LinkedHashMap<String,Integer>();

    public CountWords (String path) {
        this.path = path;
    }

    List <String> getResult() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, " \t\n\r\f.,:;()[]\"'?!-{}");
                while (st.hasMoreTokens()) {
                    String s = st.nextToken();
                    list.add(s);
                }
            }

            for (int i = 0; i < list.size(); i++) {
                int n = 0;
                try {
                    n = map.get(list.get(i));
                } catch(NullPointerException exc) {

                }
                map.put(list.get(i), ++n);
            }

            StringBuilder result = new StringBuilder();
            for (String word : map.keySet()) {
                result.append(word).append(' ').append(map.get(word)).append('\n');
            }

            lista.add(result.toString());

        } catch(Exception e) {
            System.out.println("B³¹d: " + e);
        }

        return lista;
    }
}