package Java4_4_10;

public class Ship extends Total {
    private double time;
    private double price;

    public Ship(double time, double price) {
        this.time = time;
        this.price = price;
    }

    public void findPrice(){
        System.out.println(price * 3);
    }

    public void findTime(){
        System.out.println(time * 6);
    }
}