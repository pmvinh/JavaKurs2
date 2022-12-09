package java3_2_3_1;

import java.text.NumberFormat;
import java.util.Locale;

public class Converter {
    private final double currencyRUB = 1;
    private double money;
    private double currencyUSD;
    private double currencyEURO;

    public Converter(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public String getCurrencyUSD() {
        Locale loc = new Locale("USD");
        NumberFormat temp = NumberFormat.getCurrencyInstance(loc);
        return temp.format(this.money / 60);
    }

    public String getCurrencyEURO() {
        Locale loc = new Locale("EURO");
        NumberFormat temp = NumberFormat.getCurrencyInstance(loc);
        return temp.format(this.money / 62);
    }

    @Override
    public String toString() {
        return "Converter{" + "currencyUSD=" + currencyUSD + "USD" + ", currencyEURO=" + currencyEURO + "EURO" + '}';
    }
}
