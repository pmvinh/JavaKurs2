package java3_2_3_1;

public class ConverterTest {
    public static void main(String[] args) {
        Converter con = new Converter(10);
        System.out.println(con.getCurrencyUSD());
        System.out.println(con.getCurrencyEURO());
    }
}
