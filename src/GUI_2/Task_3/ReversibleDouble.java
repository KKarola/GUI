package GUI_2.Task_3;

public class ReversibleDouble implements Reversible{
    double number;

    ReversibleDouble(double number) {this.number = number; }

    @Override
    public Reversible reverse() {
        number = 1/number;
        return new ReversibleDouble(number);
    }

    public Reversible add() {
        number = 1/number +10.0;
        return new ReversibleDouble(number);
    }

    @Override
    public String toString() {return Double.toString(number); }
}