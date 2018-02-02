package GUI_3.Task_1;

import java.util.Iterator;

public class Hailstone implements Iterable<Integer>{
    private int ini;

    Hailstone(int ini) {this.ini = ini; }

    @Override
    public Iterator iterator() {
        return new Iterator<Integer>() {

            int inii = ini;
            boolean first = true;

            @Override
            public boolean hasNext() {
                return inii != 1;
            }

            @Override
            public Integer next() {
                if(first) {
                    first = false;
                    return inii;
                } else {
                    if (inii % 2 == 0) {
                        inii /= 2;
                    } else {
                        inii = 3 * inii + 1;
                    }
                    return inii;
                }
            }

            @Override
            public void remove() { }
        };
    }
}
