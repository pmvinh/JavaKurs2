package java2_6;
public class CircleTest {
    public static void main(String[] args) {
        Circle2 obj1 = new Circle2(20);
        System.out.println(obj1.getLength());
        System.out.println(obj1.getSquare());
        Circle2 obj2 = new Circle2(10);
        Circle2 obj3 = new Circle2(30);
        obj1.compare(obj2);
        obj1.compare(obj3);
    }
}
