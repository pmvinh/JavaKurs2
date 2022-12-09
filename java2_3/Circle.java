package java2_3;

public class Circle {
    private Point centre;

    public Circle(double x, double y) {
        centre = new Point(x, y);
    }

    public Circle(Point o) {
        centre = o;
    }

    public Point getCentre() {
        return centre;
    }

    @Override
    public String toString() {
        return "Circle with centre in "+centre;
    }
}