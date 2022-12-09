package Java4_4_4;

public class Test {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.printMatrix();
        System.out.println();
        matrix.addition();
        matrix.printAdditionalMatrix();
        System.out.println();
        matrix.multiplication(3);
        matrix.printMultiplicationMatrix();
    }
}
