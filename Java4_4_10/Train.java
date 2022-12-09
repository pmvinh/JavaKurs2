package Java4_4_10;

public class Train extends Total {
    private double time;
    private double price;

    public Train(double time, double price) {
        this.time = time;
        this.price = price;
    }

    public void findPrice(){
        System.out.println(price * 1.5);
    }

    public void findTime(){
        System.out.println(time * 10);
    }
}
