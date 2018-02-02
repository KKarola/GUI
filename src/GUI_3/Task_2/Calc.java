package GUI_3.Task_2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class Calc{
    Map<String, Calculator> calculator = new HashMap<>();
    MathContext mc = new MathContext(100000);

    private void fillCalc() {
        calculator.put("+", (liczba1, liczba2) -> liczba1.add(liczba2));
        calculator.put("-", (liczba1, liczba2) -> liczba1.subtract(liczba2));
        calculator.put("*", (liczba1, liczba2) -> liczba1.multiply(liczba2));
        calculator.put("/", (liczba1, liczba2) -> liczba1.divide(liczba2, mc));
    }

    String doCalc(String cmd) {
        try{
            String[] arguments = cmd.split(" +");
            fillCalc();
            BigDecimal liczba1= new BigDecimal(arguments[0]);
            String operator = arguments[1];
            BigDecimal liczba2 = new BigDecimal(arguments[2]);

            BigDecimal results = calculator.get(operator).calc(liczba1,liczba2);
            results = results.setScale(7, RoundingMode.HALF_UP).stripTrailingZeros();

            return results.toString();
        } catch (Exception e) {
            return "Invalid command to calculator";
        }
    }
}
