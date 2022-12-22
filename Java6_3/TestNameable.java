package Java6_3;

public class TestNameable {
    public static void main(String[] args) {
        Nameable n1 = new Car("BWM");
        n1.getName();

        n1 = new Plane("Boeing 747");
        n1.getName();

        Plane p1 = new Plane("Airbus A380-800");
        p1.getName();
    }
}
