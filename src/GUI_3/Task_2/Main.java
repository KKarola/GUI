package GUI_3.Task_2;

public class Main {

    public static void main(String[] args) {
        Calc c = new Calc();
        String wynik = c.doCalc(args[0]);
        System.out.println(wynik);
    }

}