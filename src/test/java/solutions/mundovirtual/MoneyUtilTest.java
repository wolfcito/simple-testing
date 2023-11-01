package solutions.mundovirtual;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoneyUtilTest {
    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1000);
        Assertions.assertEquals("$1000.00", money);
    }

    @Test
    public void moneyWithNegativeSalaryTest() {
        String money = MoneyUtil.format(-1000);
        Assertions.assertEquals("-$1000.00", money);
    }

    @Test
    public void moneyWithEuroSalaryTest() {
        String money = MoneyUtil.format(-1000, "€");
        Assertions.assertEquals("-€1000.00", money);
    }

    @Test
    public void notNullExceptionMoneyTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            MoneyUtil.format(-1000, null);
        });
    }
}