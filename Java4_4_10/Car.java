package Java4_4_10;

public class Car extends Total {
    private double time;
    private double price;

    public Car(double time, double price) {
        this.time = time;
        this.price = price;
    }

    public void findPrice(){
        System.out.println(price * 2);
    }

    public void findTime(){
        System.out.println(time * 8);
    }
}