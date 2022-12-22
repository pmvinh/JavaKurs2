package Java6_7;

public class Test {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book(200,"Push");
        printables[1] = new Shop("Grain",22222);
        printables[2] = new Book(300,"Castle");
        printables[3] = new Shop("Book",12345);
        for (int i = 0; i < 4; i++)
            printables[i].print();
    }
}
