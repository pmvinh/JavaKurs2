package Java4_4_10;

public class Plane extends Total {
    private double time;
    private double price;

    public Plane(double time, double price) {
        this.time = time;
        this.price = price;
    }

    public void findPrice(){
        System.out.println(price * 5);
    }

    public void findTime(){
        System.out.println(time);
    }
}
