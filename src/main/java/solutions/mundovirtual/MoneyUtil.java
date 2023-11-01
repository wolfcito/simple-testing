package solutions.mundovirtual;

import java.math.BigDecimal;

public class MoneyUtil {
    public static String format(double salary) {
        String symbol = "$";

        return format(salary, symbol);
    }

    public static String format(double salary, String symbol) {
        if (symbol == null) throw new IllegalArgumentException();
        if (salary < 0) {
            symbol = "-" + symbol;
            salary = (-1) * salary;
        }
        BigDecimal salaryRounded = BigDecimal.valueOf(salary).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        return symbol + salaryRounded;
    }
}
