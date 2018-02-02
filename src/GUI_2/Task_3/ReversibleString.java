package GUI_2.Task_3;

public class ReversibleString implements Reversible{
    String str;

    ReversibleString(String str) {this.str = str; }

    @Override
    public Reversible reverse() {
        str = new StringBuilder(str).reverse().toString();
        return new ReversibleString(str);
    }

    @Override
    public String toString() { return str; }
}
