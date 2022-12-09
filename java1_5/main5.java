package java1_5;
public class main5 {
    public static void main( String[] args ) {
        System.out.println("Hello, World!");
        System.out.println(" Total number of arguments: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument" + i + ": " + args[i]);
        }
    }
}