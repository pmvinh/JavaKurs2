package Java4_4_10;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(1,5000);
        System.out.println("Car");
        car.findTime();
        car.findPrice();
        System.out.println();
        Plane plane = new Plane(1,5000);
        System.out.println("Plane");
        plane.findTime();
        plane.findPrice();
        System.out.println();
        Train train = new Train(1,5000);
        System.out.println("Train");
        train.findTime();
        train.findPrice();
        System.out.println();
        Ship ship = new Ship(1,5000);
        System.out.println("Ship");
        ship.findTime();
        ship.findPrice();
        System.out.println();
    }
}
