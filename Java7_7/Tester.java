package Java7_7;

public class Tester {
    public static void main(String[] args) {
        Printable[] printables = new Printable[3];
        printables[0] = new Printable("Magnit");
        printables[1] = new Printable("Perekrestok");
        printables[2] = new Printable("Petorechka\n");
        Magazine.printMagazines(printables);

        Printable[] printabless = new Printable[3];
        printabless[0] = new Printable("Product");
        printabless[1] = new Printable("Family");
        printabless[2] = new Printable("Electronic");
        Book.printBook(printabless);
    }
}
